package com.ilodo.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ilodo.mybatis.bean.User;

/**
 * 用户Dao层
 * @author 常学军
 * @since jdk1.8
 * 2015-07-19
 *
 */
public interface UserDao {
	public User getUser(User user);
	public User getUserByUserId(long userId);
	public void updateUserByUserId(long userId);
	public void insertUser(@Param("user") User user);
	public void deleteUser(String emailAddress);
	public void updateUser(@Param("user") User user);
	public void updateUserDeleted(@Param("user") User user);
	public List<User> getAllUsers();

}