package com.ilodo.mybatis.controller.rest;

import java.io.IOException;
import java.util.HashMap;
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
import com.ilodo.mybatis.dao.impl.UserDaoImpl;
import com.ilodo.utils.ConvertUtils;
import com.ilodo.utils.HttpClient;

/**
 * 用户登录控制器
 * 
 * @author 常学军
 * @since jdk1.8
 * 2015-07-19
 *
 */
//@RestController
public class UserController {
	@Autowired
	private UserDao userDao;
	
	/**
	 * 登录入口 
	 * @param userAccount 用户账号
	 * @param password 密码 
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public @ResponseBody Map login( @RequestParam("emailAddress") String emailAddress,@RequestParam("password")String password){
		User userQuery = new User();
		User user = userDao.getUser(userQuery);
		String ret = "0";
		String msg = "success";
		if(user ==null || !user.getPassword().equals(password.trim())){
			ret = "1";
			msg = "fail";
		}
		
        Map map =new HashMap();
        map.put("ret",ret);
        map.put("msg",msg);
        
        return map;
		
	} 
	
}