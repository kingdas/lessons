package com.yc.java011Inheritence;

//�̳У���������
//ʵ�����������ʱ�����Զ���ʵ��������Ķ���
//��java�У���ֻ�ܵ��̳У������ɶ�ʵ�֡�
public class B/* ���࣬������ */extends A/* ���࣬���࣬���� */{

	void bt() {
		// b=9;
		a = 3;
		t();
		toString();
	}

	public B() {
		super(4);
		// ��ʽ����
		// super();//��ʽ---���ø���Ĺ��췽��
		System.out.println(2);
	}

	public B(String s) {
		System.out.println(8);
	}

	public static void main(String[] args) {
		new B();
	}

}
