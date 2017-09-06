package com.lm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lm.dao.UserDao;
import com.lm.model.User;
import com.lm.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

}
