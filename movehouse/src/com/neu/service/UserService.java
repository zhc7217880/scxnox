package com.neu.service;

import com.neu.entity.User;

public interface UserService {
	User login(String name,String password) throws Exception;
}
