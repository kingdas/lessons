package com;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;

public class StudentTable extends db{
	private int student_id;
	private String s_sex;
	private String s_result;
	private String s_username;
	private String s_password;
	private String s_phone;
	private String s_address;
	private String s_d_address;
	private String s_statue;
	private String s_c_type;
	private String s_free_statue;
	private String s_discount;
	private Timestamp s_time;
	private String s_name;
	private String s_coach;
	private String s_cardid;
	private String s_age;
	
	private String Ssql;
	
	
	public StudentTable() {
		super();
		this.student_id = 0;
		this.s_sex = "";
		this.s_result = "";
		this.s_username = "";
		this.s_password = "";
		this.s_phone = "";
		this.s_address = "";
		this.s_d_address = "";
		this.s_statue = "";
		this.s_c_type = "";
		this.s_free_statue = "";
		this.s_discount = "";
		this.s_time = new Timestamp(new Date().getTime());
		this.s_name = "";
		this.s_coach = "";
		this.s_cardid = "";
		this.s_age = "";
		Ssql = "";
	}
	
	public boolean add_student(){
		Ssql = "insert into student "
				+ "( s_sex, s_result, s_username, s_password,"
				+ " s_phone, s_address, s_d_address, s_statue,"
				+ " s_c_type, s_free_statue, s_discount,"
				+ " s_time, s_name, s_coach, s_cardid, s_age ) values( "
				+ "'"+s_sex+"', '"+s_result+"', '"+s_username+"', "
				+ "'"+s_password+"', '"+s_phone+"', '"+s_address+"', "
				+ "'"+s_d_address+"', '"+s_statue+"', '"+s_c_type+"', "
				+ "'"+s_free_statue+"', '"+s_discount+"', '"+s_time+"', "
				+ "'"+s_name+"', '"+s_coach+"', '"+s_cardid+"', '"+s_age+ "' )";
		boolean isadd = super.exeSql(Ssql);
		return isadd;
	}
	public ResultSet show_all_stus(){
		Ssql="select * from student";
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
	
	public boolean update_student(){
		Ssql = "update student set "
				+ "s_sex="+"'"+s_sex+"', "
				+ "s_result="+"'"+s_result+"', "
				+ "s_username="+"'"+s_username+"', "
				+ "s_password="+"'"+s_password+"', "
				+ "s_phone="+"'"+s_phone+"', "
				+ "s_address="+"'"+s_address+"', "
				+ "s_d_address="+"'"+s_d_address+"', "
				+ "s_statue="+"'"+s_statue+"', "
				+ "s_c_type="+"'"+s_c_type+"', "
				+ "s_free_statue="+"'"+s_free_statue+"', "
				+ "s_discount="+"'"+s_discount+"', "
				+ "s_coach="+"'"+s_coach+"', "
				+ "s_cardid="+"'"+s_cardid+"', "
				+ "s_age="+"'"+s_age+"' "
				+ "where student_id="+student_id+";";
		boolean isUpdate = super.exeSql(Ssql);
		return isUpdate;
	}
	public ResultSet show_update()
	   {
	    	Ssql="select * from student where student_id="+student_id;
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
	public boolean delete_stu()
	   {
	    	Ssql="delete from student where student_id="
	    	+ student_id; 
	        
	        try
			{
	   			boolean rs = super.exeSql(Ssql);
	            if (rs)
	            {
	                return true;
	            }
	            else
	            {
	               return false;
	            }
			}
			catch(Exception ex)
			{
				System.out.println(ex.toString()); 
	            return false;
			}
	   }   
	
	
	public boolean init()
	   {
	    	Ssql="select * from student where student_id="+student_id;        
	        try
			{
	   			ResultSet rs = super.exeSqlQuery(Ssql);
	            if (rs.next())
	            {
	            			this.s_sex = rs.getString("s_sex");
	            			this.s_result = rs.getString("s_result");
	            			this.s_username = rs.getString("s_username");
	            			this.s_password = rs.getString("s_password");
	            			this.s_phone = rs.getString("s_phone");
	            			this.s_address = rs.getString("s_address");
	            			this.s_d_address = rs.getString("s_d_address");
	            			this.s_statue = rs.getString("s_statue");
	            			this.s_c_type = rs.getString("s_c_type");
	            			this.s_free_statue = rs.getString("s_free_statue");
	            			this.s_discount = rs.getString("s_discount");
	            			this.s_time = rs.getTimestamp("s_time");
	            			this.s_name = rs.getString("s_name");
	            			this.s_coach = rs.getString("s_coach");
	            			this.s_cardid = rs.getString("s_cardid");
	            			this.s_age = rs.getString("s_age");
	                return true;
	            }
	            else
	            {
	               return false;
	            }
			}
			catch(Exception ex)
			{
				System.out.println(ex.toString());            
	            return false;
			}
	   }   
	
	
	
	
	public String getS_cardid() {
		return s_cardid;
	}

	public void setS_cardid(String s_cardid) {
		this.s_cardid = s_cardid;
	}

	public String getS_age() {
		return s_age;
	}

	public void setS_age(String s_age) {
		this.s_age = s_age;
	}

	public int getStuent_id() {
		return student_id;
	}
	public void setStuent_id(int stuent_id) {
		this.student_id = stuent_id;
	}
	public String getS_sex() {
		return s_sex;
	}
	public void setS_sex(String s_sex) {
		this.s_sex = s_sex;
	}
	public String getS_result() {
		return s_result;
	}
	public void setS_result(String s_result) {
		this.s_result = s_result;
	}
	public String getS_username() {
		return s_username;
	}
	public void setS_username(String s_username) {
		this.s_username = s_username;
	}
	public String getS_password() {
		return s_password;
	}
	public void setS_password(String s_password) {
		this.s_password = s_password;
	}
	public String getS_phone() {
		return s_phone;
	}
	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}
	public String getS_address() {
		return s_address;
	}
	public void setS_address(String s_address) {
		this.s_address = s_address;
	}
	public String getS_d_address() {
		return s_d_address;
	}
	public void setS_d_address(String s_d_address) {
		this.s_d_address = s_d_address;
	}
	public String getS_statue() {
		return s_statue;
	}
	public void setS_statue(String s_statue) {
		this.s_statue = s_statue;
	}
	public String getS_c_type() {
		return s_c_type;
	}
	public void setS_c_type(String s_c_type) {
		this.s_c_type = s_c_type;
	}
	public String getS_free_statue() {
		return s_free_statue;
	}
	public void setS_free_statue(String s_free_statue) {
		this.s_free_statue = s_free_statue;
	}
	public String getS_discount() {
		return s_discount;
	}
	public void setS_discount(String s_discount) {
		this.s_discount = s_discount;
	}
	public Timestamp getS_time() {
		return s_time;
	}
	public void setS_time(Timestamp s_time) {
		this.s_time = s_time;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_coach() {
		return s_coach;
	}
	public void setS_coach(String s_coach) {
		this.s_coach = s_coach;
	}

	@Override
	public String toString() {
		return "StudentTable [stuent_id=" + student_id + ", s_sex=" + s_sex + ", s_result=" + s_result + ", s_username="
				+ s_username + ", s_password=" + s_password + ", s_phone=" + s_phone + ", s_address=" + s_address
				+ ", s_d_address=" + s_d_address + ", s_statue=" + s_statue + ", s_c_type=" + s_c_type
				+ ", s_free_statue=" + s_free_statue + ", s_discount=" + s_discount + ", s_time=" + s_time + ", s_name="
				+ s_name + ", s_coach=" + s_coach + ", Ssql=" + Ssql + "]";
	}
	
	
}
