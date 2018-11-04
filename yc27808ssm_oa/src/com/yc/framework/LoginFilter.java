package com.yc.framework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

public class LoginFilter implements Filter {

	public LoginFilter() {

	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("..");
		HttpServletRequest req = (HttpServletRequest) request;
		Object obj = req.getSession().getAttribute("emp");

		String url = req.getRequestURL().toString();
		System.out.println(url);

		List<String> urls = new ArrayList<String>();
		urls.add("login.jsp");
		urls.add("login");

		if (obj != null || url.endsWith("login.jsp") || url.endsWith("login")) {
			chain.doFilter(request, response);// 放行请求
		} else {// 返回登录
			((HttpServletResponse) response)
					.sendRedirect("/yc27808ssm_oa/login.jsp");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
