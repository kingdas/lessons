package com.yc.java006base2;

public class Test {

	public static void main(String[] args) {
		// ��ʶ��
		// �����������ͣ�8��;ֵ����/��������
		// �β�Ϊ������������ʱ���βεĸı䲻��Ӱ��ʵ��
		// �β�Ϊ��������ʱ�����βΡ��ĸı��Ӱ�조ʵ�Ρ�
		// ////////////////////////////////////////////
		// // ���ͣ�
		// byte b = 127;// 1;-128~127
		// // b = (byte) (b + 1);// ǿ������ת����ȡֵ��Χ��ĸ�ֵ��ȡֵ��ΧС��Ҫ���С�ǿת��
		// b += 1;// �����������Ż�
		// System.out.println(b);// �ڼ�����У������Բ������ʽ���ڵ�
		//
		// // ��֪һ���������룺����λΪ1�������λȡ�����һ
		// // ��֪һ�������Ĳ��룬����ת��Ϊʮ������:
		// // 1���ȶԸ�λȡ���� 2������ת��Ϊʮ��������3�����ϸ��ţ��ټ�ȥ1��
		//
		// short s;// 2
		// int i;// 4
		// long l;// 8
		// // i = b;
		// // b=i;//
		//
		// // �ַ�����
		// char c;// 2;0~65535
		//
		// // ������
		// float f;//4
		// double d;//8
		// // ����
		// boolean bln;// true;false;�߼�����Ľ���ǲ�������
		// ////////////////////////////////////////////
		// short s = 128;// 0000 0000 1000 0000
		// byte b = (byte) s;// 1000 0000 ��λ�ض�
		// System.out.println(b);
		// // ////////////////////////////////////
		// byte b = 1;
		// int i = 2;
		// int t = b + i;
		// ////////////////////////////////////
		// byte b = 1;
		// short i = 2;
		// short t = b + i;
		// //////////////////////////
		// int i = 8;
		// Integer t;
		// t = i;
		// i = t;
		// System.out.println(Integer.toBinaryString(85));
		// System.out.println(Integer.parseInt("123o"));
		// //////////////////////////
		// System.out.println(Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		// System.out.println(Double.MIN_VALUE + "~" + Double.MAX_VALUE);
		// /////////////////////////////////
		// ��������������߼�����ϵ��λ�����������
		// ����:+-*/%
		// �߼���&&��,||��,!��
		// boolean b1 = true, b2 = false, b3;
		// b3 = b1 && b2;// �߼������㣺���ټ�Ϊ�٣�ȫ���Ϊ��
		// System.out.println(b3);
		// b3 = b1 || b2;// �߼������㣺���漴Ϊ�棬ȫ�ٲ�Ϊ��
		// System.out.println(b3);
		// b3 = !b1;
		// System.out.println(b3);
		// ��·
		// int a = 5, b = 8, c;
		// boolean bln;
		// bln = ((c = a) > b) && ((c = b) > a);
		// System.out.println(bln);
		// System.out.println(c);
		// bln = ((c = a) > b) & ((c = b) > a);// &λ����������㣻��Ҳ���Խ����߼����㣬������·
		// System.out.println(c);
		// ��ϵ:>,>=,<,<=,==,!=;�������ǲ�������
		// λ��&,|,~,^,>>,<<,>>>
		// int a = 5, b = 8, c;
		// c = a & b;
		// System.out.println(c);
		// c = a | b;
		// System.out.println(c);
		// c = a ^ b;
		// System.out.println(c);
		// c = ~a;
		// System.out.println(c);
		// c = 9 >> 3;
		// System.out.println(c);
		// c = a << 2;
		// System.out.println(c);
		// c = -7 >>> 1;// ����λ����һ����
		// System.out.println(c);
		// ����:(),++,--,.,?:,=,
		// /////////////////////////////////////////////
		int n = -1;
		int c = 0;
		while (n != 0) {
			c += n & 1;
			n >>>= 1;
		}
		System.out.println(c);
		// λ����������������Ч����ߵ�����
		System.out.println(Integer.toBinaryString(-1));

	}

}
