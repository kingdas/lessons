package com.yc;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(value = "/ms2", loadOnStartup = 1)
public class MyServlet2 implements Servlet {

	@Override
	public void destroy() {
		System.out.println("销毁");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("初始化---第一次请求");//生命周期开始：第一次请求时；可以设置提前loadOnStartup
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("处理请求---每次请求");
	}

}
