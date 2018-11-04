package com.yc;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// jdbc
		System.out.println(request.getParameter("name"));
		String t = "";
		Random r = new Random();
		if (r.nextInt() % 2 == 0) {
			t = "1";
		} else {
			t = "0";
		}
		response.getWriter().print(t);
	}

}
