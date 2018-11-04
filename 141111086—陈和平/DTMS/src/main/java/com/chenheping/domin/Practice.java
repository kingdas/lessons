package com.chenheping.domin;

import java.sql.Timestamp;

public class Practice {
  private Integer practice_id;
  private Integer student_id;
  private Timestamp p_time;
  private String  p_score;
  private String p_truenum;
  private String p_falsenum;
  private String p_number;

  public Practice(Integer practice_id, Integer student_id, Timestamp p_time, String p_score, String p_truenum, String p_falsenum, String p_number) {
    this.practice_id = practice_id;
    this.student_id = student_id;
    this.p_time = p_time;
    this.p_score = p_score;
    this.p_truenum = p_truenum;
    this.p_falsenum = p_falsenum;
    this.p_number = p_number;

  }

  public Practice(Integer student_id, Timestamp p_time, String p_score, String p_truenum, String p_falsenum, String p_number) {
    this.student_id = student_id;
    this.p_time = p_time;
    this.p_score = p_score;
    this.p_truenum = p_truenum;
    this.p_falsenum = p_falsenum;
    this.p_number = p_number;
  }


  @Override
  public String toString() {
    return "Practice{" +
            "practice_id=" + practice_id +
            ", student_id=" + student_id +
            ", p_time=" + p_time +
            ", p_score='" + p_score + '\'' +
            ", p_truenum='" + p_truenum + '\'' +
            ", p_falsenum='" + p_falsenum + '\'' +
            ", p_number='" + p_number + '\'' +
            '}';
  }

  public Integer getPractice_id() {
    return practice_id;
  }

  public void setPractice_id(Integer practice_id) {
    this.practice_id = practice_id;
  }

  public Integer getStudent_id() {
    return student_id;
  }

  public void setStudent_id(Integer student_id) {
    this.student_id = student_id;
  }

  public Timestamp getP_time() {
    return p_time;
  }

  public void setP_time(Timestamp p_time) {
    this.p_time = p_time;
  }

  public String getP_score() {
    return p_score;
  }

  public void setP_score(String p_score) {
    this.p_score = p_score;
  }

  public String getp_truenum() {
    return p_truenum;
  }

  public void setp_truenum(String p_truenum) {
    this.p_truenum = p_truenum;
  }

  public String getP_falsenum() {
    return p_falsenum;
  }

  public void setP_falsenum(String p_falsenum) {
    this.p_falsenum = p_falsenum;
  }

  public String getP_number() {
    return p_number;
  }

  public void setP_number(String p_number) {
    this.p_number = p_number;
  }
}
