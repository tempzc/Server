package com.ilodo.mybatis.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ilodo.mybatis.bean.User;
import com.ilodo.mybatis.dao.UserDao;
import com.ilodo.mybatis.mapper.UserMapper;

/**
 * 用户dao实现类
 * @author 常学军
 * @since jdk1.8
 * 2015-07-19
 *
 */
@Repository
public class UserDaoImpl implements UserDao{
	public UserMapper userMapper;
    /**
     * @param userMapper the userMapper to set
     */
    @Autowired
    public void setUserMapper(@Qualifier("userMapper") UserMapper userMapper) {
        this.userMapper = userMapper;
    }
	@Override
	public User getUser(User user) {
		return userMapper.getUser(user);
	}
	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}
	@Override
	public void deleteUser(String emailAddress) {
		userMapper.deleteUser(emailAddress);
		
	}
	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
		
	}
	@Override
	public List<User> getAllUsers() {
		return userMapper.getAllUsers();
	}
	@Override
	public void updateUserByUserId(long userId) {
		userMapper.updateUserByUserId(userId);
	}
	@Override
	public void updateUserDeleted(User user) {
		userMapper.updateUserDeleted(user);
		
	}
	@Override
	public User getUserByUserId(long userId) {
		return userMapper.getUserByUserId(userId);
	}
    
}

