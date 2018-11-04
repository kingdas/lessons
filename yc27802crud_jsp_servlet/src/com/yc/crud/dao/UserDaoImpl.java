package com.yc.crud.dao;

import java.util.List;

import com.yc.crud.model.User;
import com.yc.crud.model.UserQuery;
import com.yc.framework.DbUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public int add(User u) {
		String sql = "";
		if (u.getOperator_id() != null) {
			sql = "insert into t_user(operator_id,name,password,status)values("
					+ u.getOperator_id() + ",'" + u.getName() + "','"
					+ u.getPassword() + "'," + u.getStatus() + ")";
		} else {
			sql = "insert into t_user(name,password,status)values('"
					+ u.getName() + "','" + u.getPassword() + "',"
					+ u.getStatus() + ")";
		}
		return DbUtils.executeCUD(sql);
	}

	@Override
	public int del(int operator_id) {
		String sql = "delete from t_user where operator_id=" + operator_id;
		return DbUtils.executeCUD(sql);
	}

	@Override
	public int update(User u) {
		String sql = "update t_user set name='" + u.getName() + "',password='"
				+ u.getPassword() + "',status=" + u.getStatus()
				+ " where operator_id=" + u.getOperator_id() + "";
		return DbUtils.executeCUD(sql);
	}

	@Override
	public User findById(int operator_id) {
		String sql = "select * from t_user where operator_id=" + operator_id;
		List<User> us = DbUtils.executeR(sql, User.class);
		if (us != null && us.size() > 0) {
			return us.get(0);
		}
		return null;
	}

	@Override
	public List<User> findByCondition(UserQuery uq) {
		String sql = "select * from t_user where 1=1";
		if (uq != null) {// 有条件
			if (uq.getStatus() == null)// 用户名的精确查询
			{
				if (uq.getName() != null) {
					sql += " and name='" + uq.getName() + "'";
				}
			} else {// 用户名的模糊查询与状态值的联合查询
				if (uq.getName() != null && uq.getName().trim().length() > 0) {
					sql += " and name like '%" + uq.getName() + "%'";
				}
				if (uq.getStatus() != -1) {
					sql += " and status=" + uq.getStatus();
				}
			}
		}
		System.out.println(sql);
		List<User> us = DbUtils.executeR(sql, User.class);
		return us;
	}

	@Override
	public List<User> findAll() {
		// String sql = "select * from t_user";
		// List<User> us = DbUtils.executeR(sql, User.class);
		// return us;
		return findByCondition(null);
	}

}
