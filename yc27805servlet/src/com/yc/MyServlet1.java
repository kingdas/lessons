package com.yc;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ms1")
public class MyServlet1 extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {

		System.out.println("...");

	}

}
