package com.chenheping.domin;

import java.sql.Timestamp;

public class Learnrecord {
  private Integer learnrecord_id;
  private Integer student_id;
  private Timestamp start_time;
  private String time;
  private String subject;
  private  String l_juli;
  private String car_number;

  @Override
  public String toString() {
    return "Learnrecord{" +
            "learnrecord_id=" + learnrecord_id +
            ", student_id=" + student_id +
            ", start_time=" + start_time +
            ", time='" + time + '\'' +
            ", subject='" + subject + '\'' +
            ", l_juli='" + l_juli + '\'' +
            ", car_number='" + car_number + '\'' +
            '}';
  }

  public Learnrecord() {
  }

  public Learnrecord(Integer learnrecord_id, Integer student_id, Timestamp start_time, String time, String subject, String l_juli, String car_number) {
    this.learnrecord_id = learnrecord_id;
    this.student_id = student_id;
    this.start_time = start_time;
    this.time = time;
    this.subject = subject;
    this.l_juli = l_juli;
    this.car_number = car_number;
  }

  public Integer getLearnrecord_id() {
    return learnrecord_id;
  }

  public void setLearnrecord_id(Integer learnrecord_id) {
    this.learnrecord_id = learnrecord_id;
  }

  public Integer getStudent_id() {
    return student_id;
  }

  public void setStudent_id(Integer student_id) {
    this.student_id = student_id;
  }

  public Timestamp getStart_time() {
    return start_time;
  }

  public void setStart_time(Timestamp start_time) {
    this.start_time = start_time;
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

  public String getL_juli() {
    return l_juli;
  }

  public void setL_juli(String l_juli) {
    this.l_juli = l_juli;
  }

  public String getCar_number() {
    return car_number;
  }

  public void setCar_number(String car_number) {
    this.car_number = car_number;
  }
}
