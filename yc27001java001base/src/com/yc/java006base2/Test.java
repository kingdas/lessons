package com.yc.java006base2;

public class Test {

	public static void main(String[] args) {
		// 标识符
		// 基本数据类型：8种;值类型/引用类型
		// 形参为基本数据类型时，形参的改变不会影响实参
		// 形参为引用类型时，“形参”的改变会影响“实参”
		// ////////////////////////////////////////////
		// // 整型：
		// byte b = 127;// 1;-128~127
		// // b = (byte) (b + 1);// 强制类型转换：取值范围大的赋值给取值范围小的要进行“强转”
		// b += 1;// 编译器做了优化
		// System.out.println(b);// 在计算机中，数据以补码的形式存在的
		//
		// // 已知一个负数求补码：符号位为1，其余各位取反后加一
		// // 已知一个负数的补码，将其转换为十进制数:
		// // 1、先对各位取反； 2、将其转换为十进制数；3、加上负号，再减去1。
		//
		// short s;// 2
		// int i;// 4
		// long l;// 8
		// // i = b;
		// // b=i;//
		//
		// // 字符类型
		// char c;// 2;0~65535
		//
		// // 浮点型
		// float f;//4
		// double d;//8
		// // 布尔
		// boolean bln;// true;false;逻辑运算的结果是布尔类型
		// ////////////////////////////////////////////
		// short s = 128;// 0000 0000 1000 0000
		// byte b = (byte) s;// 1000 0000 高位截断
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
		// 运算符：算术、逻辑、关系、位、其它运算符
		// 算术:+-*/%
		// 逻辑：&&与,||或,!非
		// boolean b1 = true, b2 = false, b3;
		// b3 = b1 && b2;// 逻辑与运算：遇假即为假，全真才为真
		// System.out.println(b3);
		// b3 = b1 || b2;// 逻辑或运算：遇真即为真，全假才为假
		// System.out.println(b3);
		// b3 = !b1;
		// System.out.println(b3);
		// 短路
		// int a = 5, b = 8, c;
		// boolean bln;
		// bln = ((c = a) > b) && ((c = b) > a);
		// System.out.println(bln);
		// System.out.println(c);
		// bln = ((c = a) > b) & ((c = b) > a);// &位运算的与运算；它也可以进行逻辑运算，但不短路
		// System.out.println(c);
		// 关系:>,>=,<,<=,==,!=;运算结果是布尔类型
		// 位：&,|,~,^,>>,<<,>>>
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
		// c = -7 >>> 1;// 符号位向右一起移
		// System.out.println(c);
		// 其它:(),++,--,.,?:,=,
		// /////////////////////////////////////////////
		int n = -1;
		int c = 0;
		while (n != 0) {
			c += n & 1;
			n >>>= 1;
		}
		System.out.println(c);
		// 位运算是所有运算中效率最高的运算
		System.out.println(Integer.toBinaryString(-1));

	}

}
