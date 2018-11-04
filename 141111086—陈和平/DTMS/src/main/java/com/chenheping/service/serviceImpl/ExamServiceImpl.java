package com.chenheping.service.serviceImpl;

import com.chenheping.DAO.ExamMapper;
import com.chenheping.domin.Exam;
import com.chenheping.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
@Service
public class ExamServiceImpl implements ExamService {
    @Autowired
    private ExamMapper examMapper;
    @Override
    public Integer deleteByExamId(Integer examId) {
        return examMapper.deleteByExamId(examId);
    }

    @Override
    public Integer insert(Exam exam) {
        return examMapper.insert(exam);
    }

    @Override
    public List selectByStuId(Integer stuId) {
        return examMapper.selectByStuId(stuId);
    }

    @Override
    public Integer updateByExamId(Exam exam) {
        return examMapper.updateByExamId(exam);
    }

    @Override
    public List<Exam> selectAllExam() {
        return examMapper.selectAllExam();
    }
}
