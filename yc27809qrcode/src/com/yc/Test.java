package com.yc;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

public class Test {

	private static final int BLACK = 0xFF000000;
	private static final int WHITE = 0xFFFFFFFF;

	public static void main(String[] args) throws Exception {
		String text = "http://www.qq.com    "; // ������URL ��ɨ��֮�����ת���������
		String path = "D:/"; // ͼƬ���ɵ�λ��
		int width = 300;
		int height = 300;
		// ��ά��ͼƬ��ʽ
		String format = "gif";
		// ���ñ��룬��ֹ��������
		Hashtable<EncodeHintType, Object> ht = new Hashtable<EncodeHintType, Object>();
		ht.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		// ���ö�ά�����(�������ݣ��������ͣ�ͼƬ��ȣ�ͼƬ�߶�,��ʽ)
		BitMatrix bitMatrix = new MultiFormatWriter().encode(text,
				BarcodeFormat.QR_CODE, width, height, ht);
		// ���ɶ�ά��(�����ά�����������·��)
		File outputFile = new File(path);
		if (!outputFile.exists()) {
			// �����ļ���
			outputFile.mkdir();
		}
		int b_width = bitMatrix.getWidth();
		int b_height = bitMatrix.getHeight();
		// ����ͼ�񻺳���
		BufferedImage image = new BufferedImage(b_width, b_height,
				BufferedImage.TYPE_3BYTE_BGR);
		for (int x = 0; x < b_width; x++) {
			for (int y = 0; y < b_height; y++) {
				image.setRGB(x, y, bitMatrix.get(x, y) ? BLACK : WHITE);
			}
		}
		// ���ɶ�ά��
		ImageIO.write(image, format, new File(path + "/erweima." + format)); // ��ά�������
																				// ��
																				// erweima.sgif
	}
}
