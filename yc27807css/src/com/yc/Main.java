package com.yc;

import java.util.UUID;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = UUID.randomUUID().toString()
				+ "xx.bmp".substring("xx.bmp".lastIndexOf("."));
		System.out.println(s);
	}

}
