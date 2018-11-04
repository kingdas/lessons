package com.chenheping.service;

import com.chenheping.domin.Exam;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
public interface ExamService {
    Integer deleteByExamId(Integer examId);
    Integer insert(Exam exam);
    List selectByStuId(Integer stuId);
    Integer updateByExamId(Exam exam);
    List<Exam> selectAllExam();
}
