package com.yc.java003array;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// int a = 5, b, c, d, e, f, g;
		// // ���飺һ�ο��Զ�����ͬ���͵ı�����
		// // ���ڴ�����Щ������������;
		// // �������±���������Ԫ�أ��±���㿪ʼ
		// int ax[];
		// int[] arr = new int[10];
		// arr[0] = 1;
		// arr[1] = 2;
		// arr[9] = 10;
		// // System.out.println(arr[9]);
		// System.out.println(arr.length);// �����length"����"
		// ///////////////////////////
		// int[] a = { 1, 34, 21, 4 };
		// System.out.println(a.length);
		// System.out.println(a[2]);
		// // ///////////////////////////
		// int[] a = new int[10];
		// for (int i = 0; i < a.length; i++) {
		// a[i] = i + 1;
		// }
		// for (int i = 0; i < a.length; i++) {
		// // System.out.print(a[i]+" ");
		// System.out.print(a[i] + ",");
		// }
		// System.out.println();
		// /////////////////////////
		// Random r = new Random();
		// int n;
		// n = r.nextInt(100);
		// System.out.println(n);
		// // ///////////////////////////
		Random r = new Random();
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();

	}

}
