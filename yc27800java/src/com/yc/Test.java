package com.yc;

public class Test {

	public static void main(String[] args) {

		// int t = fun(5);
		// System.out.println(t);

		S s1 = S.getS(); // = new S();
		S s2 = S.getS();
		System.out.println(s1 == s2);
	}

	static int fun(int n) {
		if (n == 1) {
			return 1;
		}
		return n * fun(n - 1);
	}

}
