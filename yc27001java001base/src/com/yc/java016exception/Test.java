package com.yc.java016exception;

//�쳣��exception--ArithmeticException��
//�����쳣ʱ�����Դ���Ļ�---������ֹ
//����ʽ���ѿ��ܲ����쳣�Ĵ������try������
//�����쳣ʱ�����׳���Ӧ���쳣����
//�׳��Ĵ��쳣����ᱻcatch�еı������յ�
//catch����(����)�쳣
//һ��try�����ж��catch;
//���catch˳��Ҫ���ӵ������������ں������ᱻִ�У�Ҳ������˼�ˣ���ƽ���ɲ���˳��
//try-catch�����һ��δ������һtry��
//finally�����Ƿ�����쳣��finally���鶼�ᱻִ�У���������return��  �����˳�Ӧ�ó���System.exit(0)����--һ�������ͷ���Դ
//return ;�����޷���ֵʱ�������������õķ�ʽ
//try����û��catch;try-finally

//NullPointerException,ArithmeticException,IndexOutOfBoundsException
//ע������ָ���쳣��������ַ����Ƚϣ���������ǰ��

//��throwһ���쳣����ʱ����ǰ����throws���쳣�����׸����ô�ȥ����
//RuntimeException������ʱ�쳣���ᱻǿ��Ҫ����

public class Test {

	public static void main(String[] args) {

		// int[] b = { 1, 2 };
		// int a = 0;
		// try {
		// b[2] = 9;
		// a = 2 / a;// �׳�ArithmeticException����
		// } catch (ArithmeticException e) {
		// System.out.println("..");
		// e.printStackTrace();
		// } catch (IndexOutOfBoundsException e) {
		// System.out.println(".");
		// } catch (Exception e) {// e=new ArithmeticException();
		// System.out.println("...");
		// e.printStackTrace();
		// // System.out.println(e.getMessage());
		// }
		//
		// System.out.println(a);
		// System.out.println("*****");
		// // //////////////////////////
		// int a = 0;
		// try {
		// a = 2 / a;
		// }
		//
		// // catch (Exception e) {
		// // System.out.println(e.getMessage());// ��ʾ�û�
		// // // return;
		// // }
		//
		// finally {
		// System.out.println("finally");
		// }
		// System.out.println("***");
		// ///////////////////////////
		// System.out.println(rt());

		// //////////////////////////
		// int a = 0;
		// try {
		// a = 2 / a;
		// } catch (Exception e) {
		// System.out.println(e.getMessage());// ��ʾ�û�
		// // return;
		// System.exit(0);// �����˳�Ӧ�ó���
		// } finally {
		// System.out.println("finally");
		// }
		// System.out.println("***");

		// // /////////////////////////////
		// String username = null;
		// String password = null;
		// boolean b = false;
		// try {
		// b = login(username, password);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// /////////////////////////////
		String username = "admin";
		String password = "admin";
		boolean b = false;
		try {
			b = login(username, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(b);

	}

	static boolean login(String username, String password) {

		if (!"admin".equals(username)) {
			throw new LoginException("�û���������");
		}
		if (!"admin".equals(password)) {
			throw new LoginException("�������");
		}

		return true;
	}

	// static boolean login(String username, String password) throws Exception {
	// // if (username.equals("admin") && "admin".equals(password)) {
	// // if ("admin".equals(username) && "admin".equals(password)) {
	// // return true;
	// // } else {
	// // return false;
	// // }
	// if (!"admin".equals(username)) {
	// throw new Exception("�û�������");
	// }
	//
	// return true;
	// }

	static int rt() {
		int a = 0;
		try {
			a = 2 / a;
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}

}
