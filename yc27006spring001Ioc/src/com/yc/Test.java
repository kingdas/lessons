package com.yc;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// BeanFactory bf = new ClassPathXmlApplicationContext("spring.xml");
		// //A a = (A) bf.getBean("a");
		// a.a();
		// // /////////////////////////////////
		// BeanFactory bf = new ClassPathXmlApplicationContext("spring.xml");
		// B b = (B) bf.getBean("b");
		// b.getA().a();
		// /////////////////////////////////
		BeanFactory bf = new ClassPathXmlApplicationContext("spring.xml");
		D d = (D) bf.getBean("d");
		d.getC().c();

	}

}
