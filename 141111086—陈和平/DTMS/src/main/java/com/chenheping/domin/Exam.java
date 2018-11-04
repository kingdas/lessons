package com.chenheping.domin;

import java.sql.Timestamp;

public class Exam {
  private Integer exam_id;
  private Integer student_id;
  private String  e_score;
  private Timestamp e_time;
  private String  e_truenum;
  private String e_falsenum;

  public Exam(Integer student_id, String e_score, Timestamp e_time, String e_truenum, String e_falsenum) {
    this.student_id = student_id;
    this.e_score = e_score;
    this.e_time = e_time;
    this.e_truenum = e_truenum;
    this.e_falsenum = e_falsenum;
  }

  @Override
  public String toString() {
    return "Exam{" +
            "exam_id=" + exam_id +
            ", student_id=" + student_id +
            ", e_score='" + e_score + '\'' +
            ", e_time=" + e_time +
            ", e_truenum='" + e_truenum + '\'' +
            ", e_falsenum='" + e_falsenum + '\'' +
            '}';
  }

  public Integer getExam_id() {
    return exam_id;
  }

  public void setExam_id(Integer exam_id) {
    this.exam_id = exam_id;
  }

  public Integer getStudent_id() {
    return student_id;
  }

  public void setStudent_id(Integer student_id) {
    this.student_id = student_id;
  }

  public String getE_score() {
    return e_score;
  }

  public void setE_score(String e_score) {
    this.e_score = e_score;
  }

  public Timestamp getE_time() {
    return e_time;
  }

  public void setE_time(Timestamp e_time) {
    this.e_time = e_time;
  }

  public String getE_truenum() {
    return e_truenum;
  }

  public void setE_truenum(String e_truenum) {
    this.e_truenum = e_truenum;
  }

  public String getE_falsenum() {
    return e_falsenum;
  }

  public void setE_falsenum(String e_falsenum) {
    this.e_falsenum = e_falsenum;
  }

  public Exam(Integer exam_id, Integer student_id, String e_score, Timestamp e_time, String e_truenum, String e_falsenum) {
    this.exam_id = exam_id;
    this.student_id = student_id;
    this.e_score = e_score;
    this.e_time = e_time;
    this.e_truenum = e_truenum;
    this.e_falsenum = e_falsenum;
  }
}
