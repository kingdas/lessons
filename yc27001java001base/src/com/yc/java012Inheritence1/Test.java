package com.yc.java012Inheritence1;

public class Test {

	public static void main(String[] args) {

		// Animal an = new Dog();// ����ת��
		// an.eat();
		// Dog d = null;
		// if (an instanceof Dog) {
		// d = (Dog) an;// ����ת��
		// d.eat();
		// System.out.println("-------------");
		// }
		// Cat c = null;
		// if (an instanceof Cat) {// instanceof �ж�ĳһ�����Ƿ���ĳ�����ʵ��
		// c = (Cat) an;// ClassCastException
		// c.eat();
		// }
		// ////////////////////////////////////////////
		// ��̬
		// * �̳�
		// * ��������д
		// * ���������ָ������Ķ���

		Animal an = new Dog();// ����ת��
		an.eat();
		// an.sleep();// ��������ָ���������ʱ�����ܵ���������չ
		an.toString();//

		an = new Cat();
		an.eat();
		
		Dog d=new Dog();
		d.sleep();

	}
}
