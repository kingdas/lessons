package com.yc.java008encapsulate;

public class MethodOverload {
	// ���������أ������У�ͬ���ķ����з��������أ�
	// ǰ�᣺��ͬһ�����У���������ͬ�����б����������ͣ�˳�򣩲�ͬ,������ֵ���Ͳ�ͬ���ܹ��ɷ���������

	// int add(int a, int b) {
	// return a + b;
	// }

	// long add(int a, int b) {
	// System.out.println(".");
	// return a + b;
	// }
	//
	long add(int a, long b) {
		System.out.println("..");
		return a + b;
	}

	long add(long a, int b) {
		System.out.println("...");
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		MethodOverload mo = new MethodOverload();
		// mo.add(a, b);

	}
}
