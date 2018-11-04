package com.yc.thread;

public class Sell implements Runnable {
	private int ticket = 20;
	private Object o=new Object();

	@Override
	public void run() {

		while (ticket > 0) {
			sell();
		}

	}

	private  void sell() {
		synchronized (o) {
			if (ticket > 0) {
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "售出："
						+ ticket--);
			}
		}
		
	}

	public static void main(String[] args) {
		Sell s = new Sell();
		Thread t1 = new Thread(s, "窗口一");
		t1.start();
		t1 = new Thread(s, "窗口二");
		t1.start();
		t1 = new Thread(s, "窗口三");
		t1.start();
		t1 = new Thread(s, "窗口四");
		t1.start();
	}

}
