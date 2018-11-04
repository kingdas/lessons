package com;

import java.sql.ResultSet;

public class QuestionTable extends db{
	private int question_id;
	private String q_name;
	private String q_item;
	private String answer_A;
	private String answer_B;
	private String answer_C;
	private String answer_D;
	private String right_key;
	private String subjectparse;
	
	private String Ssql;

	public QuestionTable() {
		super();
		this.question_id = 0;
		this.q_name = "";
		this.q_item = "";
		this.answer_A = "";
		this.answer_B = "";
		this.answer_C = "";
		this.answer_D = "";
		this.right_key = "";
		this.subjectparse = "";
		Ssql = "";
	}
	
	public boolean add_question(){
		Ssql = "insert into question "
			+ "(q_name,q_item,answer_A,answer_B,"
			+ "answer_C,answer_D,right_key,"
			+ "subjectparse) values( '"+q_name+"', '"
			+ q_item+"', '"+answer_A+"', '"+answer_B
			+ "', '"+answer_C+"', '"+answer_D+"', '"
			+ right_key+"', '"+subjectparse+"' )";
		boolean isadd = super.exeSql(Ssql);
		return isadd;
	}
	public ResultSet show_all_ques(){
		Ssql="select * from question";
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
	public ResultSet show_all_ques_con(int id, String type){
		Ssql="select * from question where 1=1";
		if(id != 0){
			Ssql = Ssql+" and question_id="+id;
		}if(type != null || "".equals(type)){
			if("check".equals(type)){
				Ssql = Ssql + " and q_item="+"'选择题'";
			}else if("judge".equals(type)){
				Ssql = Ssql + " and q_item="+"'判断题'";
			}
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
	public boolean update_question(){
		Ssql = "update question set "
			+ "q_name="+"'"+q_name +"', "
			+ "q_item="+"'"+q_item +"', "
			+ "answer_A="+"'"+answer_A +"', "
			+ "answer_B="+"'"+answer_B +"', "
			+ "answer_C="+"'"+answer_C +"', "
			+ "answer_D="+"'"+answer_D +"', "
			+ "right_key="+"'"+right_key +"', "
			+ "subjectparse="+"'"+subjectparse +"' "
			+ "where question_id="+question_id+";";
		boolean isUpdate = super.exeSql(Ssql);
		return isUpdate;
	}
	public ResultSet show_update()
	   {
	    	Ssql="select * from question where question_id="+question_id;
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
	public boolean delete_que()
	   {
	    	Ssql="delete from question where question_id="
	    	+ question_id; 
	        
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
	    	Ssql="select * from question where question_id="+question_id;        
	        try
			{
	   			ResultSet rs = super.exeSqlQuery(Ssql);
	            if (rs.next())
	            {
	            	this.q_name = rs.getString("q_name");
	        		this.q_item = rs.getString("q_item");
	        		this.answer_A = rs.getString("answer_A");
	        		this.answer_B = rs.getString("answer_B");
	        		this.answer_C = rs.getString("answer_C");
	        		this.answer_D = rs.getString("answer_D");
	        		this.right_key = rs.getString("right_key");
	        		this.subjectparse = rs.getString("subjectparse");
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

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQ_name() {
		return q_name;
	}

	public void setQ_name(String q_name) {
		this.q_name = q_name;
	}

	public String getQ_item() {
		return q_item;
	}

	public void setQ_item(String q_item) {
		this.q_item = q_item;
	}

	public String getAnswer_A() {
		return answer_A;
	}

	public void setAnswer_A(String answer_A) {
		this.answer_A = answer_A;
	}

	public String getAnswer_B() {
		return answer_B;
	}

	public void setAnswer_B(String answer_B) {
		this.answer_B = answer_B;
	}

	public String getAnswer_C() {
		return answer_C;
	}

	public void setAnswer_C(String answer_C) {
		this.answer_C = answer_C;
	}

	public String getAnswer_D() {
		return answer_D;
	}

	public void setAnswer_D(String answer_D) {
		this.answer_D = answer_D;
	}

	public String getRight_key() {
		return right_key;
	}

	public void setRight_key(String right_key) {
		this.right_key = right_key;
	}

	public String getSubjectparse() {
		return subjectparse;
	}

	public void setSubjectparse(String subjectparse) {
		this.subjectparse = subjectparse;
	}

	public String getSsql() {
		return Ssql;
	}

	public void setSsql(String ssql) {
		Ssql = ssql;
	}

	@Override
	public String toString() {
		return "QuestionTable [question_id=" + question_id + ", q_name=" + q_name + ", q_item=" + q_item + ", answer_A="
				+ answer_A + ", answer_B=" + answer_B + ", answer_C=" + answer_C + ", answer_D=" + answer_D
				+ ", right_key=" + right_key + ", subjectparse=" + subjectparse + ", Ssql=" + Ssql + "]";
	} 
	
}