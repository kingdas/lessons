package com.yc.java008encapsulate;

public class StaticTest {
	// static
	// �����Ժ��෽��(��̬��Ա)---�������Ժͷ������Ǿ�̬��Ա��
	int a;
	static int b;// ������

	// ��̬���������ж�����ģ�һ�������޸��˾�̬���Ե�ֵ�����������ֵ���ܴ�Ӱ��
	// ���飺��̬��Ա�ķ���������ֱ�ӷ���

	void t() {
		a = 5;
		b = 8;
	}

	static void tt() {// �෽��
		// a = 55;// �ھ�̬��Ա�в���ʹ�÷Ǿ�̬��Ա
		// Ϊʲô����̬��Ա�Ĵ������ڷǾ�̬��Ա
		b = 88;
	}

	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		st1.a = 11;
		st1.b = 111;
		StaticTest.b=1111;
		System.out.println("st1.a=" + st1.a + ",st1.b=" + st1.b);
		StaticTest st2 = new StaticTest();
		st2.a = 22;
		st2.b = 222;
		System.out.println("st2.a=" + st2.a + ",st2.b=" + st2.b);
		System.out.println("st1.a=" + st1.a + ",st1.b=" + st1.b);

	}

}
