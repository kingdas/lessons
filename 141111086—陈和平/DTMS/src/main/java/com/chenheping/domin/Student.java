package com.chenheping.domin;

import java.sql.Timestamp;

public class Student {
  private Integer student_id;
  private String s_username;
  private String s_password;
  private String s_phone;
  private String s_sex;
  private Timestamp s_time;
  private String s_name;
  private String s_result;
  private String s_coach;
  private String s_discount;
  private String s_free_statue;
  private String s_c_type;
  private String s_statue;
  private String s_d_address;
  private String s_address;
  private String s_cardid;
  private String s_age;


  @Override
  public String toString() {
    return "Student{" +
            "student_id=" + student_id +
            ", s_username='" + s_username + '\'' +
            ", s_password='" + s_password + '\'' +
            ", s_phone='" + s_phone + '\'' +
            ", s_sex='" + s_sex + '\'' +
            ", s_time=" + s_time +
            ", s_name='" + s_name + '\'' +
            ", s_result='" + s_result + '\'' +
            ", s_coach='" + s_coach + '\'' +
            ", s_discount='" + s_discount + '\'' +
            ", s_free_statue='" + s_free_statue + '\'' +
            ", s_c_type='" + s_c_type + '\'' +
            ", s_statue='" + s_statue + '\'' +
            ", s_d_address='" + s_d_address + '\'' +
            ", s_address='" + s_address + '\'' +
            ", s_cardid='" + s_cardid + '\'' +
            ", s_age='" + s_age + '\'' +
            '}';
  }

  public Student(Integer student_id, String s_username, String s_password, String s_phone, String s_sex, Timestamp s_time, String s_name, String s_result, String s_coach, String s_discount, String s_free_statue, String s_c_type, String s_statue, String s_d_address, String s_address, String s_cardid, String s_age) {
    this.student_id = student_id;
    this.s_username = s_username;
    this.s_password = s_password;
    this.s_phone = s_phone;
    this.s_sex = s_sex;
    this.s_time = s_time;
    this.s_name = s_name;
    this.s_result = s_result;
    this.s_coach = s_coach;
    this.s_discount = s_discount;
    this.s_free_statue = s_free_statue;
    this.s_c_type = s_c_type;
    this.s_statue = s_statue;
    this.s_d_address = s_d_address;
    this.s_address = s_address;
    this.s_cardid = s_cardid;
    this.s_age = s_age;
  }

  public Integer getStudent_id() {
    return student_id;
  }

  public void setStudent_id(Integer student_id) {
    this.student_id = student_id;
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

  public String getS_sex() {
    return s_sex;
  }

  public void setS_sex(String s_sex) {
    this.s_sex = s_sex;
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

  public String getS_result() {
    return s_result;
  }

  public void setS_result(String s_result) {
    this.s_result = s_result;
  }

  public String getS_coach() {
    return s_coach;
  }

  public void setS_coach(String s_coach) {
    this.s_coach = s_coach;
  }

  public String getS_discount() {
    return s_discount;
  }

  public void setS_discount(String s_discount) {
    this.s_discount = s_discount;
  }

  public String getS_free_statue() {
    return s_free_statue;
  }

  public void setS_free_statue(String s_free_statue) {
    this.s_free_statue = s_free_statue;
  }

  public String getS_c_type() {
    return s_c_type;
  }

  public void setS_c_type(String s_c_type) {
    this.s_c_type = s_c_type;
  }

  public String getS_statue() {
    return s_statue;
  }

  public void setS_statue(String s_statue) {
    this.s_statue = s_statue;
  }

  public String getS_d_address() {
    return s_d_address;
  }

  public void setS_d_address(String s_d_address) {
    this.s_d_address = s_d_address;
  }

  public String getS_address() {
    return s_address;
  }

  public void setS_address(String s_address) {
    this.s_address = s_address;
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
}