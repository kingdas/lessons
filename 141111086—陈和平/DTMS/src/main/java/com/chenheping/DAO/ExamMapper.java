package com.chenheping.DAO;

import com.chenheping.domin.Exam;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */

@Mapper
public interface ExamMapper {
    Integer deleteByExamId(Integer examId);
    Integer insert(Exam exam);
    List selectByStuId(Integer stuId);
    Integer updateByExamId(Exam exam);
    List<Exam> selectAllExam();
}
