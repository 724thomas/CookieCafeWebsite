package com.example.cookiecafewebsite.controller;

import com.example.cookiecafewebsite.dto.SignupDto;
import com.example.cookiecafewebsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public String signup(SignupDto signupDto) {
    //[id, pw, name, phone, address, addressDetail, email, gender, sns, birth]
    //[724thomas, a1035819, 최원준, 01048430882, 서울 강남구 봉은사로 404, 상주, 724thomas@gmail.com, 남자, , 19920724]

        String signupSuccess = userService.idExists(signupDto.getId());
        System.out.println(signupDto.getId());
        System.out.println(signupSuccess);
        if (signupSuccess.equals("0")){
            userService.insertUser(signupDto);
            return "1";
        }else{
            return "0";
        }
    }

    @PostMapping("/login")
    public String login(@RequestParam HashMap<String,String> hashMap, HttpSession session) {
        if (userService.login(hashMap)){
            session.setAttribute("id", hashMap.get("id"));
            return "1";
        }else{
            return "";
        }
    }
}
