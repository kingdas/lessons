package com.yc.thread;

public class Test {

	public static void main(String[] args) {

		// MyThread t1 = new MyThread();
		// t1.start();// �����߳�
		// // t1.run();//run ���������ֶ����ã�����ֶ����ã���ô�����Ƕ��߳�ִ�У�ֻ���߳�
		// System.out.println(Thread.currentThread().getName());
		// MyThread t2 = new MyThread();
		// t2.start();// �����߳�
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
