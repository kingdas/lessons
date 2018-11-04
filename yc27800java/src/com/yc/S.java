package com.yc;

public class S {
	private static S i = new S();

	private S() {
	}

	public static S getS() {
		return i;
	}

}
