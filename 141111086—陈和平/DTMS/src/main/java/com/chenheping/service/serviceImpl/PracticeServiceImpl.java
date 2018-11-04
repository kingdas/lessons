package com.chenheping.service.serviceImpl;

import com.chenheping.DAO.PracticeMapper;
import com.chenheping.domin.Practice;
import com.chenheping.service.PracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
@Service
public class PracticeServiceImpl implements PracticeService {
    @Autowired
    private PracticeMapper practiceMapper;
    @Override
    public Integer deleteByPracticeId(Integer practiceId) {
        return practiceMapper.deleteByPracticeId(practiceId);
    }

    @Override
    public Integer insert(Practice practice) {
        return practiceMapper.insert(practice);
    }

    @Override
    public Practice selectByPracticeId(Integer practiceId) {
        return practiceMapper.selectByPracticeId(practiceId);
    }

    @Override
    public Integer updateByPracticeId(Practice practice) {
        return practiceMapper.updateByPracticeId(practice);
    }

    @Override
    public List<Practice> selectAllPractice(Integer student_id) {
        return practiceMapper.selectAllPractice(student_id);
    }
}
