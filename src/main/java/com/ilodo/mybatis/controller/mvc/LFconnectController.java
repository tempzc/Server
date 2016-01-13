package com.ilodo.mybatis.controller.mvc;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.util.URLEncoder;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ilodo.mybatis.bean.User;
import com.ilodo.mybatis.dao.UserDao;
import com.ilodo.utils.ConvertUtils;
import com.ilodo.utils.HttpClient;
import com.ilodo.utils.Md5;
import com.lf.lfopen.webservices.domain.workoutresult.json.ResultProgressManualCardioWorkout;
import com.lf.lfopen.webservices.domain.workoutresult.json.ResultProgressManualCardioWorkoutData;
import com.lf.lfopen.webservices.domain.workoutresult.json.ResultProgressManualStrengthWorkout;
import com.lf.lfopen.webservices.domain.workoutresult.json.ResultProgressManualStrengthWorkoutData;
import com.lf.lfopen.webservices.domain.workoutresult.json.ResultProgressWorkout;
import com.lf.lfopen.webservices.domain.workoutresult.json.ResultProgressWorkoutData;

/**
 * 用户登录控制器
 * 
 * @author 常学军
 * @since jdk1.8 2015-07-19
 *
 */
@Controller
public class LFconnectController {
	@Autowired
	private UserDao userDao;
	private User mainUser;
	private static String token;
	private static String refreshToken;
	private String uri;
	private int op ;

	/**
	 * 登录入口
	 * 
	 * @param userAccount
	 *            用户账号
	 * @param password
	 *            密码
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("emailAddress") String emailAddress, 
			@RequestParam("password") String password,
			Model model){
		if(null == emailAddress || "".equals(emailAddress)){
			model.addAttribute("err","邮箱不能为空!");
			return "login";
		}
		if(null == password || "".equals(password)){
			model.addAttribute("err","密码不能为空!");
			return "login";
		}
		User user = new User();
		user.setEmailAddress(emailAddress.trim());
		user.setPassword(Md5.md5(password.trim()));
		mainUser = userDao.getUser(user);
		
		if (mainUser == null) {
			HttpClient.getToken(emailAddress.trim(), password.trim());
			if (token != null) {
				uri = "/user?access_token=" + new URLEncoder().encode(token);
				String xmlResponse = HttpClient.api(token, uri);
				try {
					mainUser = ConvertUtils.xmlStringToBean(xmlResponse, User.class);
				} catch (JsonProcessingException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				mainUser.setToken(token);
				mainUser.setRefreshToken(refreshToken);
				mainUser.setCreateTime(Calendar.getInstance().getTime());
				mainUser.setPassword(Md5.md5(password.trim()));
				userDao.insertUser(mainUser);
			}
		}

		if(mainUser == null){
			model.addAttribute("err","用户名密码不对!");
			return "login";
		}
		if(mainUser.getDeleted() == 1){
			mainUser.setDeleted(0);
			userDao.updateUserDeleted(mainUser);
		}
		return index(model);
	}
	
	/**
	 * 力健回调
	 * 
	 * @param userAccount
	 *            用户账号
	 * @param password
	 *            密码
	 * @return
	 */
	@RequestMapping(value = "/loginback", method = RequestMethod.GET)
	public @ResponseBody String loginback(@RequestParam("code") String code, Model model) {
		Map<String,String> map = HttpClient.getTokenMap(code);
		token = (String) map.get("access_token");
		refreshToken = (String) map.get("refresh_token");
		return token;
	}

	@RequestMapping(value = "/index")
	public String index(Model model) {
		List<User> list = userDao.getAllUsers();
		model.addAttribute("user", mainUser);
		model.addAttribute("list", list);
		return "admin";
	}

	@RequestMapping(value = "/user")
	public String user(@Param("userId") long userId,Model model) {
		User user = userDao.getUserByUserId(userId);
		model.addAttribute("user", user);
		return "user";
	}

	@RequestMapping(value = "/profile")
	public String profile(Model model) {
		model.addAttribute("user", mainUser);
		return "profile";
	}
	
	@RequestMapping(value = "/modify")
	public String modify(@Param("userId") long userId,Model model) {
		User user = userDao.getUserByUserId(userId);
		model.addAttribute("user", user);
		return "profile";
	}

	@RequestMapping(value = "/insertUser",method = RequestMethod.POST
			)
	public @ResponseBody String insertUser(User user) {
		userDao.updateUser(user);
		Map map = new HashMap();
		map.put("ret", 0);
		map.put("msg", "ok");
		return "0";
	}

	@RequestMapping(value = "/userList",method = RequestMethod.GET)
	public String userList(Model model) {
		List<User> list = userDao.getAllUsers();
		model.addAttribute("list", list);
		return "userlist";
	}

	@RequestMapping(value = "/dealUser",method = RequestMethod.GET,
			produces="application/json")
	public @ResponseBody Map dealUser(@Param("userId") long userId) {
		userDao.updateUserByUserId(userId);
		Map map = new HashMap();
		map.put("ret", 0);
		map.put("msg", "ok");
		return map;
	}

	@RequestMapping(value = "/workoutresults/get_results_workout", method = RequestMethod.GET)
	public String getResultsWorkout(@Param("userId") long userId,Model model) {
		User user = userDao.getUserByUserId(userId);
		String fromDate = "11/10/2015";
		String toDate = "12/31/2016";
		String timeZone = "GMT-0800";
		uri = "/workoutresults/get_results_workout" + "?fromDate=" + fromDate + "&toDate=" + toDate + "&timezone="
				+ timeZone + "&access_token=" + new URLEncoder().encode(user.getToken());

		String xmlResponse = HttpClient.api(token, uri);
		try {
			ResultProgressWorkout resultProgressWorkout = ConvertUtils.xmlStringToBean(xmlResponse,
					ResultProgressWorkout.class);
			List<ResultProgressWorkoutData> list = (List<ResultProgressWorkoutData>) resultProgressWorkout
					.getResultWorkoutData();
			model.addAttribute("list", list);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "workout_results";
	}

	@RequestMapping(value = "/workoutresults/get_manualcardio_results", method = RequestMethod.GET)
	public String getManualCardioResults(@Param("userId") long userId,Model model) {
		User user = userDao.getUserByUserId(userId);
		String fromDate = "11/10/2015";
		String toDate = "12/30/2016";
		String timeZone = "GMT-0800";
		uri = "/workoutresults/get_manualcardio_results" + "?fromDate=" + fromDate + "&toDate=" + toDate + "&timezone="
				+ timeZone + "&access_token=" + new URLEncoder().encode(user.getToken());
		String uri2 = "/workoutresults/get_manualstrength_results" + "?fromDate=" + fromDate + "&toDate=" + toDate
				+ "&timezone=" + timeZone + "&access_token=" 
				+ new URLEncoder().encode(user.getToken());

		String xmlResponse = HttpClient.api(token, uri);
		try {
			ResultProgressManualCardioWorkout resultProgressManualCardioWorkout = ConvertUtils
					.xmlStringToBean(xmlResponse, ResultProgressManualCardioWorkout.class);
			List<ResultProgressManualCardioWorkoutData> list = (List<ResultProgressManualCardioWorkoutData>) resultProgressManualCardioWorkout
					.getResultWorkoutData();
			model.addAttribute("list", list);
			String xmlResponse2 = HttpClient.api(token, uri2);
			System.out.println(xmlResponse2);
			ResultProgressManualStrengthWorkout resultProgressManualStrengthWorkout = ConvertUtils
					.xmlStringToBean(xmlResponse2, ResultProgressManualStrengthWorkout.class);
			List<ResultProgressManualStrengthWorkoutData> list2 = resultProgressManualStrengthWorkout
					.getResultWorkoutData();
			model.addAttribute("list2", list2);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "get_manualcardio_results";
	}

	@RequestMapping(value = "/rest", method = RequestMethod.GET, produces = { "application/xml" })
	public @ResponseBody Map<String, String> rest(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		Map<String, String> map = new HashMap<String, String>();
		String msg = "success";
		map.put("ret", "0");
		map.put("code", "1");

		return map;
	}
	
	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

}