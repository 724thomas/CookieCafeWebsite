package com.example.cookiecafewebsite.repository;

import com.example.cookiecafewebsite.dto.SignupDto;
import com.example.cookiecafewebsite.entity.CustomerEntity;
import com.example.cookiecafewebsite.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    @Autowired
    userMapper userMapper;

    public int insertUser(SignupDto signupDto) {
        return userMapper.insertUser(signupDto);
    }

    public CustomerEntity checkUserExist(String id) {
        return userMapper.checkUserExist(id);
    }

    public CustomerEntity login(String id) {
        return userMapper.login(id);
    }
}
