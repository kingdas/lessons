package com.yc.java004function;

public class Test {

	public static void main(String[] args) {
		// �������ȶ��壬��ʹ��
		// ���壺����ǩ��������ֵ����+������+����(�β�)�б�+���������
		//
		// Test t=new Test();
		// int n = t.abs(9);
		// System.out.println(n);
		// ////////////////////////////
		// int n = abs(-8);// ʵ��
		// System.out.println(n);
		// ////////////////////////////

		// int a = 5, b = 8;
		// System.out.println("a=" + a + ",b=" + b);
		// change(a, b);
		// System.out.println("a=" + a + ",b=" + b);
		// �β�Ϊ������������ʱ���βεĸı䲻��Ӱ��ʵ��
		// �β�Ϊ��������ʱ���βεĸı��Ӱ��ʵ��
		// ///////////////////////////////
		// System.out.println(3 + 4 + "java" + 3 + 4);
		// ///////////////////////////////
		// int[] a = { 5, 8 };
		// System.out.println("a[0]=" + a[0] + ",a[1]=" + a[1]);
		// change(a);
		// System.out.println("a[0]=" + a[0] + ",a[1]=" + a[1]);
		// // ///////////////////////////////
		//
		// int n = 17;
		// boolean b = isPrime(n);
		// System.out.println(b);
		// ///////////////////////////////

		int n = 17;
		if (isPrime(n)) {
			System.out.println(n + "������");
		} else {
			System.out.println(n + "��������");
		}

	}

	static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void change(int[] a) {
		a[0] = a[0] ^ a[1];
		a[1] = a[0] ^ a[1];
		a[0] = a[0] ^ a[1];
	}

	static void change(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	}

	/**
	 * �����ֵ
	 * 
	 * @param n
	 *            ����
	 * @return ���ؾ���ֵ
	 */
	static int abs(int n) {
		if (n < 0) {
			return -1 * n;
		}
		return n;// ����ֵ���������ý���
	}
}
