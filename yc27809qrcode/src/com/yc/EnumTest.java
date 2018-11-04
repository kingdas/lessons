package com.yc;

public class EnumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Color c = Color.BLUE;

		switch (c) {
		case RED:
			System.out.println("..");
			break;
		case BLUE:
			System.out.println("**");
			break;

		default:
			break;
		}
		
		Clr r=Clr.R;
		
		System.out.println(c.ordinal());
		System.out.println(c.name());

	}

}
