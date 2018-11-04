package com.chenheping.DAO;

import com.chenheping.domin.Practice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
@Mapper
public interface PracticeMapper {
    Integer deleteByPracticeId(Integer practiceId);
    Integer insert(Practice practice);
    Practice selectByPracticeId(Integer practiceId);
    Integer updateByPracticeId(Practice practice);
    List<Practice> selectAllPractice(Integer student_id );
}
