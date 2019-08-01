package com.neu.service;

import com.neu.dao.UserDao;
import com.neu.dao.UserDaoImpl;
import com.neu.entity.User;

public class UserServiceImpl implements UserService{
	private UserDao userDao = new UserDaoImpl();
	@Override
	public User login(String name, String password) throws Exception {
		User user = userDao.getById(name, password);
		return user;
	}
	

}
