package com.yc.userSys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.userSys.dao.GroupDao;
import com.yc.userSys.dao.UserDao;
import com.yc.userSys.model.GroupModel;
import com.yc.userSys.model.UserModel;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserDao userDao;
	@Autowired
	private GroupDao groupDao;

	@RequestMapping("update")
	public String update(int id, Model m) {
		UserModel u = userDao.findById(id);
		m.addAttribute("u", u);
		List<GroupModel> gs = groupDao.findAll();
		m.addAttribute("gs", gs);
		return "userUpdate";
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doUpdate(UserModel u) {
		userDao.update(u);
		return "redirect:/user/list";
	}

	@RequestMapping("del")
	public String del(int id) {
		userDao.del(id);
		return "redirect:/user/list";
	}

	@RequestMapping("add")
	public String add(Model m) {
		List<GroupModel> gs = groupDao.findAll();
		m.addAttribute("gs", gs);
		return "userAdd";
	}

	@RequestMapping("doAdd")
	public String doAdd(UserModel u) {
		userDao.add(u);
		return "redirect:/user/list";
	}

	@RequestMapping("list")
	public String list(Model m) {
		List<UserModel> us = userDao.findAll();
		m.addAttribute("us", us);
		return "userList";
	}

	@RequestMapping("json/{id}")
	@ResponseBody
	public UserModel testJson(@PathVariable int id) {
		UserModel u = userDao.findById(id);
		System.out.println(u);
		return u;
	}

	@RequestMapping("users")
	@ResponseBody
	public List<UserModel> usersJson() {
		return userDao.findAll();
	}

}
