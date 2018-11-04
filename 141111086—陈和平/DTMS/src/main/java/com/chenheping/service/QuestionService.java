package com.chenheping.service;

import com.chenheping.domin.Question;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
public interface QuestionService {
    Integer deleteByQuestionId(Integer questionId);
    Integer insert(Question question);
    Question selectByQuestionId(Integer questionId);
    Integer updateByQuestionId(Question question);
    List<Question> selectAllQuestion();
}
