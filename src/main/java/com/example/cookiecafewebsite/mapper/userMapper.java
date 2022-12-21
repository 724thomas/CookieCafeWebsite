package com.example.cookiecafewebsite.mapper;

import com.example.cookiecafewebsite.dto.SignupDto;
import com.example.cookiecafewebsite.entity.CustomerEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userMapper {

    public int insertUser(SignupDto signupDto);
    public CustomerEntity checkUserExist(String id);
    public CustomerEntity login(String id);
}
