package com.yc.crud.dao;

import java.util.List;

import com.yc.crud.model.User;
import com.yc.crud.model.UserQuery;

public interface UserDao {

	int add(User u);

	int del(int operator_id);

	int update(User u);

	User findById(int operator_id);

	List<User> findByCondition(UserQuery uq);

	List<User> findAll();

}
