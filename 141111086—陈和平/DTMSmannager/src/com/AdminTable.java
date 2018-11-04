package com;

import java.sql.ResultSet;

public class AdminTable extends db{
	private String a_username;
	private String a_name;
	private String a_password;
	
	private String Ssql;

	public AdminTable() {
		super();
		this.a_username = "";
		this.a_name = "";
		this.a_password = "";
		Ssql = "";
	}
	public boolean check_admin(){
		Ssql = " select * from admin where "
				+ "a_username='"+a_username+"' and "
				+ "a_password='"+a_password+"'";
		ResultSet rs = null;
		
        try
		{
   		 	rs = super.exeSqlQuery(Ssql); 
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString()); 
		}
        if(rs!=null){
        	return true;
        }
        return false;
	
	}
	
	public ResultSet select_admin(){
		Ssql = " select * from admin where "
				+ "a_username='"+a_username+"' and "
				+ "a_password='"+a_password+"'";
		ResultSet rs = null;
        try
		{
   		 	rs = super.exeSqlQuery(Ssql); 
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString()); 
		}
		return rs;
	}

	public String getA_username() {
		return a_username;
	}

	public void setA_username(String a_username) {
		this.a_username = a_username;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public String getA_password() {
		return a_password;
	}

	public void setA_password(String a_password) {
		this.a_password = a_password;
	}
	
	
	
	
	
	
}
