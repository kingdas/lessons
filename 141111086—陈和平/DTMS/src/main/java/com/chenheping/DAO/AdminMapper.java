package com.chenheping.DAO;

import com.chenheping.domin.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Chenhp on 2018/3/20 0020.
 */
@Component
@Mapper
public interface AdminMapper {
    Integer deleteByAdminId(Integer adminId);
    Integer insert(Admin admin);
    Admin selectByAdminId(Integer adminId);
    Integer updateByAdminId(Admin admin);
    Admin selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
    List<Admin> selectAllAdmin();
}
