package com.chenheping.DAO;

import com.chenheping.domin.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
@Mapper
public interface StudentMapper {
    Integer deleteByStudentId(Integer studentId);
    Integer insert(Student student);
    Student selectByStudentId(Integer studentId);
    Integer updateByStudentId(Student student);
    List<Student> selectAllStudent();
    List<Student> selectByNameAndPass(@Param("username")String username,@Param("password")String password);
}
