package com.chenheping.DAO;

import com.chenheping.domin.Learnrecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
@Mapper
public interface LearnrecordMapper {
    Integer deleteByLearnrecordId(Integer learnrecrdId);
    Integer insert(Learnrecord learnrecord);
    Learnrecord selectByLearnrecordId(Integer learnrecordId);
    Integer updateByLearnrecordId(Learnrecord learnrecord);
    List<Learnrecord> selectAllLearnrecord();
}
