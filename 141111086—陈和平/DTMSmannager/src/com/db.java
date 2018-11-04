package com;
import java.sql.*;

public class db
{ 
	String userName="root";
	String userPassword="1234";
	String url="jdbc:mysql://localhost:3306/dtms?useUnicode=true&characterEncoding=UTF-8";
	Connection dbcon;   
	Statement stmt;
	ResultSet rs;    	
   	public db()
   	{
   		stmt = null;
		rs = null;	
   	try
		{			
			Class.forName("org.gjt.mm.mysql.Driver");
			dbcon= DriverManager.getConnection(url,userName,userPassword);	
		}
		catch(SQLException ex)
		{
			System.out.println(ex.toString());		
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println(ex.toString());	
		}
   	}   	
	public boolean exeSql(String strSql)
	{
		try
		{
   			stmt=dbcon.createStatement();
			stmt.executeUpdate(strSql);
			return true;            
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
			return false;
		}			
	}	
    public ResultSet exeSqlQuery(String strSql)
	{		
		try
		{
   			stmt=dbcon.createStatement();
			rs =stmt.executeQuery(strSql);			            
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
			rs = null;
		}		
		return rs;
	}  
}

