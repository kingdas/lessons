package com.chenheping.service.serviceImpl;

import com.chenheping.DAO.AdminMapper;
import com.chenheping.domin.Admin;
import com.chenheping.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chenhp on 2018/3/20 0020.
 */
@Service(value = "adminservice")
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin selectByUsernameAndPassword(String username, String password) {
        if ("".equals(username)){

        }
        return null;
    }

    public Integer deleteByAdminId(Integer adminId){
        return adminMapper.deleteByAdminId(adminId);
    }
    public Integer insert(Admin admin){
        return adminMapper.insert(admin);
    }
    public Admin selectByAdminId(Integer adminId){
        return adminMapper.selectByAdminId(adminId);
    }
    public Integer updateByAdminId(Admin admin){
        return adminMapper.updateByAdminId(admin);
    }
    public List<Admin> selectAllAdmin(){
        return adminMapper.selectAllAdmin();
    }
}
