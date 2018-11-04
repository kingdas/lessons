package com.yc;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletRequestAttributeListener {

	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("增加了请求属性");
		System.out.println(srae.getName() + ":" + srae.getValue());
		System.out.println(srae.getSource());
	}

	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println("删除了请求属性");
	}

	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("修改了请求属性");
	}

}
