package com.yc;

public class B {
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public B(A a) {
		super();
		this.a = a;
	}

	public B() {
		super();
	}

	public void b() {
		System.out.println("b..");
	}

	public static void main(String[] args) {
		// B b = new B();
		// // b.b();
		// b.getA().a();
		// ////////////////////////
		// B b = new B();
		// b.setA(new A());
		// b.getA().a();
		// ////////////////////////
		B b = new B(new A());
		b.getA().a();

	}
}
