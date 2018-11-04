package com.yc;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CodeServlet")
public class CodeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int n = new Random().nextInt(1000000);
		MyImg mi = new MyImg();
		BufferedImage bi = mi.getImg(n + "");
		request.getSession().setAttribute("n", n);
		ImageIO.write(mi.bi, "png", response.getOutputStream());
		
		

	}

}
