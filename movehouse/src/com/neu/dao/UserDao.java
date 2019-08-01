package com.neu.dao;

import com.neu.entity.User;

public interface UserDao {
	User getById(String name,String password) throws Exception;
}
