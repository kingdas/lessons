package com.yc.crud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yc.crud.model.User;
import com.yc.crud.model.UserQuery;
import com.yc.crud.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userSerivce;

	@RequestMapping("nameExists")
	public String nameExists(String name, HttpServletResponse response) {
		String t = "";
		if (userSerivce.nameExists(name)) {
			t = "1";
		} else {
			t = "0";
		}
		try {
			response.getWriter().print(t);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping("findByNameOrStatus")
	public String findByNameOrStatus(String name, int status, Model m) {
		UserQuery uq = new UserQuery();
		uq.setName(name);
		uq.setStatus(status);
		List<User> us = userSerivce.findByNameOrStatus(uq);
		m.addAttribute("us", us);
		return "userList";
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doUpdate(User u) {
		userSerivce.update(u);
		return "redirect:/user/list";
	}

	@RequestMapping("update/{operator_id}")
	public String update(@PathVariable int operator_id, Model m) {
		User u = userSerivce.findById(operator_id);
		m.addAttribute("u", u);
		return "userUpdate";
	}

	@RequestMapping("list")
	public String list(Model m) {
		List<User> us = userSerivce.findAll();
		m.addAttribute("us", us);
		return "userList";
	}

	@RequestMapping("del/{operator_id}")
	public String del(@PathVariable int operator_id) {
		userSerivce.del(operator_id);
		return "redirect:/user/list";
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add() {
		return "userAdd";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(User u, HttpServletResponse resp) {
		userSerivce.add(u);
		try {
			resp.setCharacterEncoding("utf-8");
			resp.setContentType("text/html;charset=utf-8");
			resp.getWriter()
					.print("<script>alert('恭喜您，用户增加成功');close();opener.location.href='/yc27803crud_ssm/user/list';</script>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
