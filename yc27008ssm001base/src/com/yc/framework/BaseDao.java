package com.yc.framework;

import java.util.List;

public interface BaseDao<T> {
	int add(T u);

	int update(T u);

	int del(int id);

	T findById(int id);

	List<T> findAll();
}
