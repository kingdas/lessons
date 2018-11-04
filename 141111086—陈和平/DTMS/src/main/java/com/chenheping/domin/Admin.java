package com.chenheping.domin;

import java.sql.Timestamp;


public class Admin {
  private Integer admin_id;
  private String a_username;
  private String a_name;
  private String a_password;
  private Timestamp a_lasttime;


  @Override
  public String toString() {
    return "Admin{" +
            "admin_id=" + admin_id +
            ", a_username='" + a_username + '\'' +
            ", a_name='" + a_name + '\'' +
            ", a_password='" + a_password + '\'' +
            ", a_lasttime=" + a_lasttime +
            '}';
  }

  public Admin(Integer admin_id, String a_username, String a_name, String a_password, Timestamp a_lasttime) {
    this.admin_id = admin_id;
    this.a_username = a_username;
    this.a_name = a_name;
    this.a_password = a_password;
    this.a_lasttime = a_lasttime;
  }

  public Admin(){

  }

  public String getA_username() {
    return a_username;
  }

  public void setA_username(String a_username) {
    this.a_username = a_username;
  }

  public Integer getAdmin_id() {
    return admin_id;
  }

  public void setAdmin_id(Integer admin_id) {
    this.admin_id = admin_id;
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

  public Timestamp getA_lasttime() {
    return a_lasttime;
  }

  public void setA_lasttime(Timestamp a_lasttime) {
    this.a_lasttime = a_lasttime;
  }
}
