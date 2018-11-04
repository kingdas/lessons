package com.chenheping.service;

import com.chenheping.domin.Student;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
public interface StudentService {
    Integer deleteByStudentId(Integer studentId);
    Integer insert(Student student);
    Student selectByStudentId(Integer studentId);
    Integer updateByStudentId(Student student);
    List<Student> selectAllStudent();
    List<Student> selectByNameAndPass(String username,String password);
}
