package com.chenheping.service;

import com.chenheping.domin.Admin;

import java.util.List;

/**
 * Created by Chenhp on 2018/3/20 0020.
 */
public interface AdminService {
    Admin selectByUsernameAndPassword(String username,String password);
    Integer deleteByAdminId(Integer adminId);
    Integer insert(Admin admin);
    Admin selectByAdminId(Integer adminId);
    Integer updateByAdminId(Admin admin);
    List<Admin> selectAllAdmin();
}
