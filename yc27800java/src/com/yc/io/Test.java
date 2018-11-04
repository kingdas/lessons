package com.yc.io;

public class Test {
	public static void main(String[] args) throws Exception {

		// File f = new File("d:\\abc");
		// // System.out.println(f.exists());
		// // System.out.println(f.isDirectory());
		// // System.out.println(f.isFile());
		// File[] fs = f.listFiles();
		// for (File ft : fs) {
		// if (ft.isDirectory()) {
		// System.out.println("[" + ft.getName() + "]");
		// } else {
		// System.out.println(ft.getName());
		// }
		// }
		// // ///////////////////////////////////
		// File f = new File("d:/abc/abc.txt");
		// InputStream is = new FileInputStream(f);
		// int t = is.read();
		// System.out.println(t);
		// is.close();
		// // ///////////////////////////////////
		// File f = new File("d:/abc/abc.txt");
		// InputStream is = new FileInputStream(f);
		// int t = 0;
		// while ((t = is.read()) != -1) {
		// System.out.print((char) t);
		// }
		// is.close();
		// // ///////////////////////////
		// File f = new File("d:/ab/c/a.txt");
		// if (!f.exists()) {
		// File fp = f.getParentFile();
		// if (!fp.exists()) {
		// // fp.mkdir();
		// fp.mkdirs();// 创建目录及子目录
		// }
		// f.createNewFile();
		// }
		// OutputStream os = new FileOutputStream(f);
		// os.write(99);
		// os.flush();//缓存内容写出，缓存满自动调用，另手动调用，close时会自动调用
		// os.close();
		// // ///////////////////////////
		// File fs = new File("d:" + File.separator + "abc" + File.separator
		// + "a.jpg");
		// File fd = new File("d:/abc/a/ab.jpg");
		// InputStream is = new FileInputStream(fs);
		// OutputStream os = new FileOutputStream(fd);
		// int t = 0;
		// while ((t = is.read()) != -1) {
		// os.write(t ^ '天');
		// }
		// is.close();
		// os.close();
		// System.out.println("ok");

		// ///////////////////////////
		// File fs =new File("d:/abc/a/ab.jpg");
		// File fd = new File("d:/abc/a/abab.jpg");
		// InputStream is = new FileInputStream(fs);
		// OutputStream os = new FileOutputStream(fd);
		// int t = 0;
		// while ((t = is.read()) != -1) {
		// os.write(t ^ '天');
		// }
		// is.close();
		// os.close();
		// System.out.println("ok");
		// // ///////////////////////////
		// File fs = new File("d:/abc/a.jpg");
		// File fd = new File("d:/abc/abab.jpg");
		// InputStream is = new FileInputStream(fs);
		// OutputStream os = new FileOutputStream(fd);
		// byte[] buff = new byte[1024];
		// int len = 0;
		// while ((len = is.read(buff)) != -1) {
		// os.write(buff, 0, len);
		// }
		// is.close();
		// os.close();
		// System.out.println("ok");
		// // // ///////////////////////////
		// File fs = new File("d:/abc/yc.rar");
		// File fd = new File("d:/abc/ycyc.rar");
		// InputStream is = new FileInputStream(fs);
		// OutputStream os = new FileOutputStream(fd);
		// BufferedInputStream bis = new BufferedInputStream(is);// 带缓存的输入流
		// BufferedOutputStream bos = new BufferedOutputStream(os);
		// long t = new Date().getTime();
		// byte[] buff = new byte[1024];
		// int len = 0;
		// while ((len = bis.read(buff)) != -1) {
		// bos.write(buff, 0, len);
		// }
		// bis.close();
		// bos.close();
		// System.out.println(new Date().getTime() - t);//670
		// ///////////////////////////
		// File fs = new File("d:/abc/yc.rar");
		// File fd = new File("d:/abc/ycyc.rar");
		// InputStream is = new FileInputStream(fs);
		// OutputStream os = new FileOutputStream(fd);
		//
		// long t = new Date().getTime();
		// byte[] buff = new byte[1024];
		// int len = 0;
		// while ((len = is.read(buff)) != -1) {
		// os.write(buff, 0, len);
		// }
		// is.close();
		// os.close();
		// System.out.println(new Date().getTime() - t);//2324

		// // // ///////////////////////////
		// File fd = new File("d:/abc/d.data");
		// OutputStream os = new FileOutputStream(fd);
		// BufferedOutputStream bos = new BufferedOutputStream(os);
		// DataOutputStream dos = new DataOutputStream(bos);
		// dos.writeChar('c');
		// dos.writeDouble(3.14);
		// dos.close();
		// // /////////////////////////
		// File fd = new File("d:/abc/d.data");
		// InputStream is = new FileInputStream(fd);
		// BufferedInputStream bis = new BufferedInputStream(is);
		// DataInputStream dis = new DataInputStream(bis);// 装饰器设计模式
		// char c = dis.readChar();
		// double d = dis.readDouble();
		// dis.close();
		// System.out.println(c + "," + d);
		// // // // ///////////////////////////
		// File fd = new File("d:/abc/d.data");
		// OutputStream os = new FileOutputStream(fd);
		// BufferedOutputStream bos = new BufferedOutputStream(os);
		// ObjectOutputStream oos = new ObjectOutputStream(bos);
		// User u = new User(22, "zs");
		// oos.writeObject(u);// 序列化：保存对象到文件
		// oos.close();
		// System.out.println("ok");
		// // // ///////////////////////////
		// File fd = new File("d:/abc/d.data");
		// InputStream is = new FileInputStream(fd);
		// BufferedInputStream bis = new BufferedInputStream(is);
		// ObjectInputStream ois = new ObjectInputStream(bis);
		// User u = (User) ois.readObject();
		// System.out.println(u);
		// ois.close();
		// // //////////////////////
		// File f = new File("d:/abc/aa.txt");
		// if (!f.exists()) {
		// f.createNewFile();
		// }
		// Reader r = new FileReader(f);
		// Writer w = new FileWriter(f);
		// BufferedReader br = new BufferedReader(r);
		// BufferedWriter bw = new BufferedWriter(w);
		// String str = "abc";
		// bw.write(str);
		// bw.close();
		// String st = br.readLine();
		// br.close();
		// System.out.println(st);

		// //////////////////////
		// File f = new File("d:/abc/aa.txt");
		// InputStream is = new FileInputStream(f);
		// InputStreamReader isr = new InputStreamReader(is);
		// BufferedReader br = new BufferedReader(isr);
		// String st = br.readLine();
		// br.close();
		// System.out.println(st);
		// //////////////////////
		// File f = new File("d:/abc");
		// File[] fs = f.listFiles(new FilenameFilter() {
		// @Override
		// public boolean accept(File dir, String name) {
		// return name.endsWith(".xml");
		// }
		// });
		// for (File ft : fs) {
		// System.out.println(ft.getName());
		// }

	}

}
