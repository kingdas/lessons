package com.yc.thread;

//���߳��ࣺ��������

//public class MyThread extends Thread {
//
//	@Override
//	public void run() {// ��������ʱ���õķ���
//		while (true) {
//			System.out.println(Thread.currentThread().getName());
//		}
//	}
//
//}

public class MyThread implements Runnable {
	@Override
	public void run() {// ��������ʱ���õķ���
		while (true) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
