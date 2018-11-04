package com.yc.thread;

//多线程类：并发处理

//public class MyThread extends Thread {
//
//	@Override
//	public void run() {// 并发处理时调用的方法
//		while (true) {
//			System.out.println(Thread.currentThread().getName());
//		}
//	}
//
//}

public class MyThread implements Runnable {
	@Override
	public void run() {// 并发处理时调用的方法
		while (true) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
