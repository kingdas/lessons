package com.yc.thread;

public class Test {

	public static void main(String[] args) {

		// MyThread t1 = new MyThread();
		// t1.start();// 启动线程
		// // t1.run();//run 方法不能手动调用，如果手动调用，那么它不是多线程执行，只单线程
		// System.out.println(Thread.currentThread().getName());
		// MyThread t2 = new MyThread();
		// t2.start();// 启动线程
		// //////////////////////////////
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		t = new Thread(mt);
		t.start();
		t = new Thread(mt);
		t.start();
	}

}
