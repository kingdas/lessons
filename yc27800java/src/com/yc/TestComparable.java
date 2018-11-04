package com.yc;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparable {

	public static void main(String[] args) {

		// int n = "cbf".compareTo("cbc");
		// System.out.println(n);
		// ///////////////////////////
		User[] us = { new User(22, "zs"), new User(22, "ls"),
				new User(21, "zs"), };
		for (User u : us) {
			System.out.println(u);
		}
		System.out.println("--------------------");
		// Arrays.sort(us);
		Arrays.sort(us, new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		for (User u : us) {
			System.out.println(u);
		}

	}
}
