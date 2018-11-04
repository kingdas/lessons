package com.yc;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;

public class MyImg {

	int w = 100, h = 30;
	BufferedImage bi;

	public MyImg() {
		bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.getGraphics();
		g.setColor(new Color(255, 0, 0));
		g.drawLine(0, 0, 50, 50);
		g.drawOval(50, 50, 40, 30);
		g.drawString("123", 20, 20);
		g.dispose();
	}

	public BufferedImage getImg(String c) {
		bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.getGraphics();
		g.setColor(new Color(255, 0, 0));

		g.drawString(c, 10, 20);
		g.dispose();
		return bi;
	}

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("d:/xx/a.jpg");
		MyImg mi = new MyImg();
		ImageIO.write(mi.bi, "jpg", os);
	}

}
