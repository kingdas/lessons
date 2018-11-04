package com.yc;

import java.util.Arrays;

import com.yc.framework.ArrayUtils;

public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[10];
		ArrayUtils.initArray(a);
		ArrayUtils.printArray(a);
		// ArrayUtils.bubbleSort(a);
		// ArrayUtils.selectSort(a);
		Arrays.sort(a);
		ArrayUtils.printArray(a);
	}

}
