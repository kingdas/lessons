package com.yc.java008encapsulate;

public class Cat {

	// ���췽���������ǹ������ģ��������ʱ���õķ���
	// �����ǲ��ṩ�κεĹ��췽������ϵͳ��Ϊ��������һ���޲εĹ��췽����
	// �������ṩ�κεĹ��췽������ôϵͳ������Ϊ���������Ǹ��޲ι��췽��
	// public Cat() {// ����ķ������޷���ֵ���ͣ�����ͬ����
	//
	// }

	// int a;
	// a=5;

	// int a=5;

	int a;

	{// �����
		a = 5;
		System.out.println("**");
	}
	static {// ��̬�����
		System.out.println("%%%");
	}

	public Cat() {
		// Cat(5);//һ�����췽����ȥ������һ�����췽���������ù��췽�������ֵ��ã�����this();
		this(5);
		// a = 6;
		System.out.println("..");
	}

	public Cat(int age) {
		System.out.println("...");
	}

	public static void main(String[] args) {
		Cat c = new Cat();
	}

}
