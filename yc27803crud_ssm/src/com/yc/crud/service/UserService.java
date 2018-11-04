package com.yc.crud.service;

import java.util.List;

import com.yc.crud.model.User;
import com.yc.crud.model.UserQuery;

public interface UserService {

	int add(User u);

	int del(int operator_id);

	int update(User u);

	User findById(int operator_id);

	// List<User> findByCondition(UserQuery uq);
	boolean nameExists(String name);

	List<User> findByNameOrStatus(UserQuery uq);

	List<User> findAll();

}
