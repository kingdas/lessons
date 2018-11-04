package com.yc.framework;

import java.util.Random;

public class ArrayUtils {
	public static void printArray(int[] a) {
		for (int t : a) {
			System.out.print(t + " ");
		}
		System.out.println();
	}

	public static void initArray(int[] a) {
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);
		}
	}

	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					a[j] = a[j] ^ a[j + 1];
					a[j + 1] = a[j] ^ a[j + 1];
					a[j] = a[j] ^ a[j + 1];
				}
				//printArray(a);
			}
		}
	}

	public static void selectSort(int[] a) {
		int min, minIndex, tmp;
		for (int j = 0; j < a.length - 1; j++) {// Ñ¡ÔñÅÅÐò
			min = a[j];
			minIndex = j;
			for (int i = j; i < a.length; i++) {
				if (a[i] < min) {
					min = a[i];
					minIndex = i;
				}
			}
			tmp = a[j];
			a[j] = a[minIndex];
			a[minIndex] = tmp;
		}

	}
}
