package com.yc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxTest extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("version"));
		String t = "";
		int flg = 0;
		if (new Random().nextInt(100) % 2 == 0) {
			t = "³É¹¦";
			flg = 1;
		} else {
			t = "Ê§°Ü";
		}
		String jsonStr = "{'code':'" + flg + "','content':'" + t + "'}";
		PrintWriter out = response.getWriter();
		out.print(jsonStr);
		out.close();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
