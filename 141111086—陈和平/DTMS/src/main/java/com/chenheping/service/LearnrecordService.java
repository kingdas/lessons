package com.chenheping.service;

import com.chenheping.domin.Learnrecord;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
public interface LearnrecordService {
    Integer deleteByLearnrecordId(Integer learnrecrdId);
    Integer insert(Learnrecord learnrecord);
    Learnrecord selectByLearnrecordId(Integer learnrecordId);
    Integer updateByLearnrecordId(Learnrecord learnrecord);
    List<Learnrecord> selectAllLearnrecord();
}
