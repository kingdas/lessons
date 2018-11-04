package com.chenheping.service.serviceImpl;

import com.chenheping.DAO.LearnrecordMapper;
import com.chenheping.domin.Learnrecord;
import com.chenheping.service.LearnrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
@Service
public class LearnRecordServiceImpl implements LearnrecordService {
    @Autowired
    private LearnrecordMapper learnrecordMapper;
    @Override
    public Integer deleteByLearnrecordId(Integer learnrecrdId) {
        return learnrecordMapper.deleteByLearnrecordId(learnrecrdId);
    }

    @Override
    public Integer insert(Learnrecord learnrecord) {
        return learnrecordMapper.insert(learnrecord);
    }

    @Override
    public Learnrecord selectByLearnrecordId(Integer learnrecordId) {
        return learnrecordMapper.selectByLearnrecordId(learnrecordId);
    }

    @Override
    public Integer updateByLearnrecordId(Learnrecord learnrecord) {
        return learnrecordMapper.updateByLearnrecordId(learnrecord);
    }

    @Override
    public List<Learnrecord> selectAllLearnrecord() {
        return learnrecordMapper.selectAllLearnrecord();
    }
}
