package com.example.cookiecafewebsite.service;

import com.example.cookiecafewebsite.dto.SignupDto;
import com.example.cookiecafewebsite.entity.CustomerEntity;
import com.example.cookiecafewebsite.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public int insertUser(SignupDto signupDto) {
        return userRepository.insertUser(signupDto);
    }

    public String idExists(String id) {
        if (userRepository.checkUserExist(id) != null){
            return "1";
        }else{
            return "0";
        }
    }

    public boolean login(HashMap<String,String> hashmap) {
        CustomerEntity user = userRepository.login(hashmap.get("id"));
        return user != null && user.getPw().equals(hashmap.get("pw"));
    }
}
