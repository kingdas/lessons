package com.chenheping.domin;

public class Question {
  private Integer question_id;
  private String q_name;
  private String q_item;
  private String answer_a;
  private String answer_b;
  private String answer_c;
  private String answer_d;
  private String right_key;
  private String subjectparse;

  public Question(Integer question_id, String q_name, String q_item, String answer_a, String answer_b, String answer_c, String answer_d, String right_key, String subjectparse) {
    this.question_id = question_id;
    this.q_name = q_name;
    this.q_item = q_item;
    this.answer_a = answer_a;
    this.answer_b = answer_b;
    this.answer_c = answer_c;
    this.answer_d = answer_d;
    this.right_key = right_key;
    this.subjectparse = subjectparse;
  }

  @Override
  public String toString() {
    return "Question{" +
            "question_id=" + question_id +
            ", q_name='" + q_name + '\'' +
            ", q_item='" + q_item + '\'' +
            ", answer_a='" + answer_a + '\'' +
            ", answer_b='" + answer_b + '\'' +
            ", answer_c='" + answer_c + '\'' +
            ", answer_d='" + answer_d + '\'' +
            ", right_key='" + right_key + '\'' +
            ", subjectparse='" + subjectparse + '\'' +
            '}';
  }

  public Question() {
  }

  public Integer getQuestion_id() {
    return question_id;
  }

  public void setQuestion_id(Integer question_id) {
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

  public String getAnswer_a() {
    return answer_a;
  }

  public void setAnswer_a(String answer_a) {
    this.answer_a = answer_a;
  }

  public String getAnswer_b() {
    return answer_b;
  }

  public void setAnswer_b(String answer_b) {
    this.answer_b = answer_b;
  }

  public String getAnswer_c() {
    return answer_c;
  }

  public void setAnswer_c(String answer_c) {
    this.answer_c = answer_c;
  }

  public String getAnswer_d() {
    return answer_d;
  }

  public void setAnswer_d(String answer_d) {
    this.answer_d = answer_d;
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
}
