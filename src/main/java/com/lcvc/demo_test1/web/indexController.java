package com.lcvc.demo_test1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class indexController {

    @RequestMapping("index")
    public String index(){
        return "index.html";
    }

    @RequestMapping("denglu")
    public String denglu(){
        return "denglu.html";
    }
}
