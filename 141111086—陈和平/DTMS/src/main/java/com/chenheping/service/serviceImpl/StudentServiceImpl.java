package com.chenheping.service.serviceImpl;

import com.chenheping.DAO.StudentMapper;
import com.chenheping.domin.Student;
import com.chenheping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Integer deleteByStudentId(Integer studentId) {
        return studentMapper.deleteByStudentId(studentId);
    }

    @Override
    public Integer insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public Student selectByStudentId(Integer studentId) {
        return studentMapper.selectByStudentId(studentId);
    }

    @Override
    public Integer updateByStudentId(Student student) {
        return studentMapper.updateByStudentId(student);
    }

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }

    @Override
    public List<Student> selectByNameAndPass(String username,String password) {
        return studentMapper.selectByNameAndPass(username,password);
    }
}
