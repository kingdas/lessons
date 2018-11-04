package com.yc.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.crud.dao.UserDao;
import com.yc.crud.model.User;
import com.yc.crud.model.UserQuery;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public int add(User u) {
		return userDao.add(u);
	}

	@Override
	public int del(int operator_id) {
		return userDao.del(operator_id);
	}

	@Override
	public int update(User u) {
		return userDao.update(u);
	}

	@Override
	public User findById(int operator_id) {
		return userDao.findById(operator_id);
	}

	@Override
	public boolean nameExists(String name) {
		UserQuery uq = new UserQuery();
		uq.setName(name);
		List<User> us = userDao.findByCondition(uq);
		if (us != null && us.size() == 1) {
			return true;
		}
		return false;
	}

	@Override
	public List<User> findByNameOrStatus(UserQuery uq) {
		return userDao.findByCondition(uq);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

}
