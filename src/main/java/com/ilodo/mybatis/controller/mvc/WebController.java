package com.ilodo.mybatis.controller.mvc;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.util.URLEncoder;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @since jdk1.8
 * 2015-07-19
 *
 */
@Controller
public class WebController {
	@Autowired
	private UserDao userDao;
	private User user;
	
    @RequestMapping("/")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "login";
    }
	
    @RequestMapping(value="/upload", method=RequestMethod.GET)
    public String provideUploadInfo() {
        return "upload";
    }

    @RequestMapping(value="/admin", method=RequestMethod.GET)
    public String admin() {
    	return "admin";
    }

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	} 
	
}