package com.yc.java019JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws Exception {
		// // JDBC:
		// // 0.�����
		// // ������JAR��
		// // 1.ע������
		// Class.forName("com.mysql.jdbc.Driver");// ����
		// // 2.��ȡ"���Ӷ���"
		// Connection conn = DriverManager.getConnection(
		// "jdbc:mysql://localhost:3306/db_gw", "root", "root");
		// // 3.��ȡ�������
		// Statement stat = conn.createStatement();
		// // 4.ִ��SQL���
		// ResultSet rs = stat.executeQuery("select * from t_user");
		// // 5.������
		// while (rs.next()) {
		// System.out.println(rs.getInt("id") + "," + rs.getString("name")
		// + "," + rs.getInt("group_id"));
		// }
		// // 6.�ͷ���Դ
		// rs.close();
		// stat.close();
		// conn.close();
		//
		// // stat.executeUpdate("delete from t_user where id=5");
		// // // ////////////////////////////////
		// ResultSet rs = DbUtils.executeR("select * from t_user");
		// while (rs.next()) {
		// System.out.println(rs.getInt("id") + "," + rs.getString("name")
		// + "," + rs.getInt("group_id"));
		// }
		// rs.close();
		// // // ////////////////////////////////
		// int n = DbUtils
		// .executeCUD("insert into t_user(name,tel,group_id)values( 'xx' ,'111',1)");
		// System.out.println(n);
		// // // ////////////////////////////////
		// int n = DbUtils.executeCUD("update t_user set name='yy' where id=8");
		// System.out.println(n);
		// // ////////////////////////////////
		// int n = DbUtils.executeCUD("delete from t_user where id=8");
		// System.out.println(n);
		// // // ////////////////////////////////
		// Connection conn = DbUtils.getConnection();
		// ResultSet rs = DbUtils.executeR(conn, "select * from t_user");
		// while (rs.next()) {
		// System.out.println(rs.getInt("id") + "," + rs.getString("name")
		// + "," + rs.getInt("group_id"));
		// }
		// DbUtils.release(conn, null, rs);
		// // ////////////////////////////////
		// Properties p = new Properties();
		// p.load(Thread.currentThread().getContextClassLoader()
		// .getResourceAsStream("dbInof.properties"));
		// String url = (String) p.get("url");
		// System.out.println(url);
		// // ////////////////////////////////
		List<User> us = new ArrayList<User>();
		User u = null;
		Connection conn = DbUtils.getConnection();
		ResultSet rs = DbUtils.executeR(conn, "select * from t_user");
		while (rs.next()) {
			u = new User(rs.getInt("id"), rs.getString("name"),
					rs.getString("tel"), rs.getInt("group_id"));
			us.add(u);
		}
		DbUtils.release(conn, null, rs);
		System.out.println(us);

	}
}
