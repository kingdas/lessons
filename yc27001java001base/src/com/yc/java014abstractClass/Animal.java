package com.yc.java014abstractClass;

//abstract���� �����ǳ����ࣻ
//�����಻��ʵ����
//һ��javaԴ�ļ��п����ж���࣬��ֻ����һ�������࣬�����������Ҫ���ļ�ͬ��
//û�з�����ķ����ǡ����󷽷���
//���г��󷽷������Ȼ�ǳ�����
// �����಻һ�����г��󷽷�
//һ����̳���һ�������࣬�����Ҫô��ɳ���ģ�Ҫô��ʵ�ֳ�����ĳ��󷽷���

public abstract class Animal {

	abstract void eat();// û�з�����ķ����ǡ����󷽷���
	// ���г��󷽷������Ȼ�ǳ�����
	// �����಻һ�����г��󷽷�

	void sleep() {

	}

	public static void main(String[] args) {
		Animal an = new Dog();
		an.eat();
	}

}

interface A {

}

// һ����̳���һ�������࣬�����Ҫô��ɳ���ģ�Ҫô��ʵ�ֳ�����ĳ��󷽷���
// abstract
class Dog extends Animal {

	@Override
	void eat() {
		System.out.println("dog.eat");
	}

}
