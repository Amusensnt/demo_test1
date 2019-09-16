package com.lcvc.demo_test1.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value="/api/login")
public class loginController {

    @GetMapping
    public Map<String,Object> login(String username,String password){
        Map<String,Object> map=new HashMap<>();
        if(username.equals("user")&&password.equals("123456")){
            map.put("status",1);
        }else{
            map.put("status",0);
            map.put("myMesssge","登录失败：账号或密码错误");
        }
        return map;
    }
}
