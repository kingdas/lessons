package com.yc;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/upload")
public class Upload extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��������

		// // �����ϴ�����
		// DiskFileItemFactory factory = new DiskFileItemFactory();
		// // �����ڴ��ٽ�ֵ - �����󽫲�����ʱ�ļ����洢����ʱĿ¼��
		// factory.setSizeThreshold(1024 * 1024 * 3);//3M
		// // ������ʱ�洢Ŀ¼
		// factory.setRepository(new
		// File(System.getProperty("java.io.tmpdir")));

		File f = null;
		File fp = new File(request.getRealPath("/") + "/res/upload/");
		if (ServletFileUpload.isMultipartContent(request)) {// �Ƿ����ļ��ϴ�������
			DiskFileItemFactory dfif = new DiskFileItemFactory();
			ServletFileUpload sfu = new ServletFileUpload(dfif);
			List<FileItem> lfi = null;
			try {
				lfi = sfu.parseRequest(request);
				for (FileItem fi : lfi) {
					if (!fi.isFormField()) {
						// f = new File(fp, fi.getName());
						f = new File(fp, UUID.randomUUID().toString()
								+ fi.getName().substring(
										fi.getName().lastIndexOf(".")));
						fi.write(f);
						System.out.println(fi.getName());
						System.out.println(fp.getPath());
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
