package com.chenheping.DAO;

import com.chenheping.domin.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
@Mapper
public interface QuestionMapper {
    Integer deleteByQuestionId(Integer questionId);
    Integer insert(Question question);
    Question selectByQuestionId(Integer questionId);
    Integer updateByQuestionId(Question question);
    List<Question> selectAllQuestion();
}
