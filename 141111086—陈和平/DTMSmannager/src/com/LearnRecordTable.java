package com;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;

public class LearnRecordTable extends db{
	private int learnrecord_id;
	private String student_id;
	private Timestamp start_time;
	private String l_juli;
	private String time;
	private String subject;
	private String car_number;
	private String Ssql;
	public LearnRecordTable() {
		super();
		this.learnrecord_id = 0;
		this.student_id = "";
		this.start_time = new Timestamp(new Date().getTime());
		this.l_juli = "";
		this.time = "";
		this.subject = "";
		this.car_number = "";
		this.Ssql = "";
	}
	
	
	public boolean add_learnrecord(){
		Ssql = "insert into learnrecord "
			+ "(student_id,start_time,l_juli,time,"
			+ "subject,car_number) values((select student_id from student where s_username='xue"+student_id+"'), '"
			+ start_time+"', '"+l_juli+"', '"+time
			+ "', '"+subject+"', '"+car_number+"' )";
		boolean isadd = super.exeSql(Ssql);
		return isadd;
	}
public ResultSet show_all_lrs_con(String id, String type){
		Ssql="select l.learnrecord_id,l.student_id,(select s.s_username"
			+" from student s where l.student_id=s.student_id"
			+"),(select s.s_name"
			+" from student s where l.student_id=s.student_id"
			+"),l.start_time,l.time,l.subject,l.l_juli,l.car_number from learnrecord l where 1=1 ";
		if(type != null || !"".equals(type)){
			if (!"所有".equals(type)) {
				Ssql = Ssql + " and subject="+"'"+type+"'";
			}
		}
		if(!"".equals(id) && id != null  ){
			Ssql = Ssql + " and student_id=(select student_id from student where s_username='"+"xue"+id+"')";
		}
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
public int getLearnrecord_id() {
	return learnrecord_id;
}
public void setLearnrecord_id(int learnrecord_id) {
	this.learnrecord_id = learnrecord_id;
}
public String getStudent_id() {
	return student_id;
}
public void setStudent_id(String student_id) {
	this.student_id = student_id;
}
public Timestamp getStart_time() {
	return start_time;
}
public void setStart_time(Timestamp start_time) {
	this.start_time = start_time;
}
public String getL_juli() {
	return l_juli;
}
public void setL_juli(String l_juli) {
	this.l_juli = l_juli;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getCar_number() {
	return car_number;
}
public void setCar_number(String car_number) {
	this.car_number = car_number;
}
public String getSsql() {
	return Ssql;
}
public void setSsql(String ssql) {
	Ssql = ssql;
}
@Override
public String toString() {
	return "LearnRecordTable [learnrecord_id=" + learnrecord_id + ", student_id=" + student_id + ", start_time="
			+ start_time + ", l_juli=" + l_juli + ", time=" + time + ", subject=" + subject + ", car_number="
			+ car_number + "]";
}
	


	
}
