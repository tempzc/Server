package com.ilodo.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import com.ilodo.mybatis.bean.User;

/**
 * 定义在该命名空间内允许使用内置缓存，最大值为512个对象引用，读写默认是开启的，
 * 缓存内省刷新时间为默认3600000毫秒，写策略是拷贝整个对象镜像到全新堆 （如同CopyOnWriteList）因此线程安全
 */
@CacheNamespace(size = 512)
public interface UserMapper {

	/**
	 * 根据账号获得用户
	 * @param userAccount 用户账号
	 * @return
	 */
	@Options(useCache = true, flushCache = false, timeout = 10000)
	public User getUser(User user);

	@Options(useCache = true, flushCache = false, timeout = 10000)
	public User getUserByUserId(long userId);
	/**
	 * 根据用户Id获得用户
	 * @param userId 用户Id
	 * @return
	 */
	@Options(useCache = true, flushCache = false, timeout = 10000)
	public void updateUserByUserId(long userId);

	@Options(useCache = true, flushCache = false, timeout = 10000)
	public void updateUserDeleted(User user);

	/**
	 * 获得所有用户
	 * @return
	 */
	@Options(useCache = true, flushCache = false, timeout = 10000)
	public List<User> getAllUsers();

	/**
	 * 添加用户
	 * @param userAccount
	 */
	@Options(flushCache = true, timeout = 20000)
	public void insertUser(User user);

	/**
	 * 更新用户
	 * @param userAccount
	 */
	@Options(flushCache = true, timeout = 20000)
	public void updateUser(User user);
	/**
	 * 删除一个用户
	 * @param userAccount
	 */
	@Options(flushCache = true, timeout = 20000)
	public void deleteUser(String emailAddress);
}
