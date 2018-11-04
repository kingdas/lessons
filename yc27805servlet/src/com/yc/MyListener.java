package com.yc;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletRequestAttributeListener {

	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("��������������");
		System.out.println(srae.getName() + ":" + srae.getValue());
		System.out.println(srae.getSource());
	}

	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println("ɾ������������");
	}

	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("�޸�����������");
	}

}
