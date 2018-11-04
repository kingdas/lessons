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
	int tc;// �ܷ�����
	int oc;// ��������
	ServletContext sc;

	public void contextInitialized(ServletContextEvent arg0) {
		tc = 55;// �洢�豸��ȡ
		sc = arg0.getServletContext();
		sc.setAttribute("tc", tc);
		sc.setAttribute("oc", oc);
		System.out.println(1);
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		// tcд�뵽�洢�豸
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
