package com.yc.java007base3;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// // ����ṹ��˳��ѡ��ѭ��
		// char k = 3;
		// // char k = 'a';
		// switch (k) {// ��·ѡ��;
		// // key��1.5��ǰֻ����int���ͣ�1.5�Ժ������ö�٣�1.7�Ժ������String
		// case 1:
		// System.out.println(1);
		// System.out.println("..");
		// break;// ����switch���
		// case 3:
		// System.out.println(3);
		// System.out.println("**");
		// // break;
		// case 4:
		// System.out.println(4);
		// System.out.println("--");
		// break;
		// default:
		// System.out.println(99);
		// break;
		// }
		// System.out.println("888888888888");
		// ////////////////////////////////
		// for,while,foreach
		// do-while

		// int n = 15;
		// int sum = 0;
		// while (n < 15) {
		// sum += n;
		// n++;
		// }
		// System.out.println(sum);

		// int n = 15;
		// int sum = 0;
		// do {// ѭ��������ִ��һ�Σ�����һ��ִ��ʱ���������Ļ�while��do-whileû����
		// sum += n;
		// n++;
		// } while (n < 15);
		// System.out.println(sum);
		// ///////////////////////////
		// ����
		// int[] a = { 3, 4, 5 };
		// boolean[] b = { true, false, false };
		// boolean[] c = new boolean[2];
		// System.out.println(c[0]);
		// System.out.println(b[2]);
		// // Ĭ��ֵ������������Ԫ��Ĭ��ֵΪ��false;
		// // double,float����Ԫ��Ĭ��ֵΪ0.0
		// // byte,short,int,long����Ԫ��Ĭ��ֵΪ0
		// // char ����Ԫ��Ĭ��ֵΪ0
		// int x;
		// System.out.println(x);
		// /////////////////////
		// String[] ss;
		// Random[] rs;
		// Math[] ms;
		// /////////////////////
		// int[] a = { 1, 2, 3 };
		// int[] b = { 1, 2, 1, 4 };
		// int[][] c = { a, b };// ��ά����
		// // ��������
		// for (int i = 0; i < c.length; i++) {
		// for (int j = 0; j < c[i].length; j++) {
		// System.out.print(c[i][j] + " ");
		// }
		// System.out.println();
		// }
		// // /////////////////////
		// Random r = new Random();
		// int[] a = new int[10];
		// for (int i = 0; i < a.length; i++) {
		// a[i] = r.nextInt(100);
		// }
		// for (int t : a) {
		// System.out.print(t + " ");
		// }
		// System.out.println();
		// int min, minIndex;
		// min = a[0];
		// minIndex = 0;
		// for (int i = 0; i < a.length; i++) {
		// if (a[i] < min) {
		// min = a[i];
		// minIndex = i;
		// }
		// }
		// System.out.println(minIndex);
		// // /////////////////////
		// Random r = new Random();
		// int[] a = new int[10];
		// for (int i = 0; i < a.length; i++) {
		// a[i] = r.nextInt(100);
		// }
		// // i=3;
		// for (int t : a) {
		// System.out.print(t + " ");
		// }
		// System.out.println();
		// int min, minIndex, tmp;// ������������
		// // tmp<==>temp;flag<==>flg; LV
		// {
		// min = a[0];
		// minIndex = 0;
		// for (int i = 0; i < a.length; i++) {
		// if (a[i] < min) {
		// min = a[i];
		// minIndex = i;
		// }
		// }
		// tmp = a[0];
		// a[0] = a[minIndex];
		// a[minIndex] = tmp;
		// }
		// for (int t : a) {
		// System.out.print(t + " ");
		// }
		// /////////////////////
		// Random r = new Random();
		// int[] a = new int[10];
		// for (int i = 0; i < a.length; i++) {
		// a[i] = r.nextInt(100);
		// }
		// for (int t : a) {
		// System.out.print(t + " ");
		// }
		// System.out.println();
		// int min, minIndex, tmp;// ������������
		// for (int j = 0; j < a.length - 1; j++) {// ѡ������
		// min = a[j];
		// minIndex = j;
		// for (int i = j; i < a.length; i++) {
		// if (a[i] < min) {
		// min = a[i];
		// minIndex = i;
		// }
		// }
		// tmp = a[j];
		// a[j] = a[minIndex];
		// a[minIndex] = tmp;
		// }
		// for (int t : a) {
		// System.out.print(t + " ");
		// }
		// ////////////////////////////////
		// long l=12345678901L;
		// double d=12345678901D;
		// byte b=128;
		// ////////////
		// int a = 010;// �˽�����
		// int b = 0x10;// ʮ��������
		// System.out.println(a);
		// System.out.println(b);
		int a = 9;
		char[] c = { 'a', 'b', ' ' };
		String s = "def";

		xxx(a, c, s);

		System.out.println(a);
		System.out.println(c);
		System.out.println(s);

	}

	static void xxx(int a, char[] c, String s) {
		a += 5;
		c[0] = 'x';
		s += 'x';
	}

}
