package com.yc;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class OnlineListener implements ServletContextListener,
		HttpSessionListener {
	int tc;// 总访问量
	int oc;// 在线人数
	ServletContext sc;

	public void contextInitialized(ServletContextEvent arg0) {
		tc = 55;// 存储设备读取
		sc = arg0.getServletContext();
		sc.setAttribute("tc", tc);
		sc.setAttribute("oc", oc);
		System.out.println(1);
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		// tc写入到存储设备
	}

	public void sessionCreated(HttpSessionEvent arg0) {
		sc.setAttribute("tc", ++tc);
		sc.setAttribute("oc", ++oc);
		System.out.println(2);
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		sc.setAttribute("oc", --oc);
	}

}
