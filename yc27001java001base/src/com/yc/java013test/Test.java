package com.yc.java013test;

public  class Test {

	public static void main(String[] args) {
		// ��̲����һ�����ӣ���ֻ�������֡���һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ����
		// ��ֻ���ӰѶ��һ�����뺣�У�������һ�ݡ��ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ�
		// �ֶ���һ������ͬ���Ѷ��һ�����뺣�У�������һ�ݣ����������ġ�����ֻ���Ӷ����������ģ�
		// �ʺ�̲��ԭ�������ж��ٸ����ӣ�
		int c = 0;
		float f;
		for (int i = 1; true; i++) {
			f = i;
			for (int j = 0; j < 5; j++) {
				f = (f - 1) * 4 / 5;
				if ((int) f != f) {
					break;
				}
			}
			if ((int) f == f) {
				System.out.println(i);
				if (++c % 10 == 0) {
					break;
				}
			}
		}

	}

}
