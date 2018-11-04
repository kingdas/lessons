package com.chenheping.service;

import com.chenheping.domin.Practice;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
public interface PracticeService {
    Integer deleteByPracticeId(Integer practiceId);
    Integer insert(Practice practice);
    Practice selectByPracticeId(Integer practiceId);
    Integer updateByPracticeId(Practice practice);
    List<Practice> selectAllPractice(Integer student_id);
}
