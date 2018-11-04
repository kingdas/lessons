package com.yc.crud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yc.crud.model.User;
import com.yc.crud.model.UserQuery;
import com.yc.crud.service.UserService;
import com.yc.crud.service.UserServiceImpl;

public class UserController extends HttpServlet {
	private UserService userSerivce = new UserServiceImpl();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String m = request.getParameter("m");
		if ("add".equals(m)) {
			add(request, response);
		} else if ("del".equals(m)) {
			del(request, response);
		} else if ("update".equals(m)) {
			update(request, response);
		} else if ("doUpdate".equals(m)) {
			doUpdate(request, response);
		} else if ("findByNameOrStatus".equals(m)) {
			findByNameOrStatus(request, response);
		} else if ("nameExists".equals(m)) {
			nameExists(request, response);
		} else {
			list(request, response);
		}

	}

	private void nameExists(HttpServletRequest request,
			HttpServletResponse response) {
		String t = "";
		if (userSerivce.nameExists(request.getParameter("name"))) {
			t = "1";
		} else {
			t = "0";
		}
		try {
			response.getWriter().print(t);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void findByNameOrStatus(HttpServletRequest request,
			HttpServletResponse response) {
		UserQuery uq = new UserQuery();
		uq.setName(request.getParameter("name"));
		uq.setStatus(Integer.parseInt(request.getParameter("status")));
		List<User> us = userSerivce.findByNameOrStatus(uq);
		request.setAttribute("us", us);
		try {
			request.getRequestDispatcher("userList.jsp").forward(request,
					response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void doUpdate(HttpServletRequest request,
			HttpServletResponse response) {
		int operator_id = Integer.parseInt(request.getParameter("operator_id"));
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		int status = Integer.parseInt(request.getParameter("status"));
		User u = new User(operator_id, name, password, status);
		userSerivce.update(u);
		list(request, response);
	}

	private void update(HttpServletRequest request, HttpServletResponse response) {
		int operator_id = Integer.parseInt(request.getParameter("operator_id"));
		User u = userSerivce.findById(operator_id);
		request.setAttribute("u", u);
		try {
			request.getRequestDispatcher("userUpdate.jsp").forward(request,
					response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void list(HttpServletRequest request, HttpServletResponse response) {
		List<User> us = userSerivce.findAll();
		request.setAttribute("us", us);
		try {
			request.getRequestDispatcher("userList.jsp").forward(request,
					response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void del(HttpServletRequest request, HttpServletResponse response) {
		int operator_id = Integer.parseInt(request.getParameter("operator_id"));
		userSerivce.del(operator_id);
		list(request, response);
	}

	private void add(HttpServletRequest request, HttpServletResponse response) {
		int operator_id = Integer.parseInt(request.getParameter("operator_id"));
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		int status = Integer.parseInt(request.getParameter("status"));
		User u = new User(operator_id, name, password, status);
		userSerivce.add(u);
		try {
			response.getWriter().print("<script>alert('恭喜您，用户增加成功');close();opener.location.href='UserController';</script>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
