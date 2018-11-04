package com.chenheping.service.serviceImpl;

import com.chenheping.DAO.QuestionMapper;
import com.chenheping.domin.Question;
import com.chenheping.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    private QuestionMapper questionMapper;
    @Override
    public Integer deleteByQuestionId(Integer questionId) {
        return questionMapper.deleteByQuestionId(questionId);
    }

    @Override
    public Integer insert(Question question) {
        return questionMapper.insert(question);
    }

    @Override
    public Question selectByQuestionId(Integer questionId) {
        return questionMapper.selectByQuestionId(questionId);
    }

    @Override
    public Integer updateByQuestionId(Question question) {
        return questionMapper.updateByQuestionId(question);
    }

    @Override
    public List<Question> selectAllQuestion() {
        return questionMapper.selectAllQuestion();
    }
}
