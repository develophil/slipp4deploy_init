package com.slipp.slippdeployinit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jarvis on 2017. 8. 30..
 */
@Controller
public class IndexController {

    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "hello world";
    }

    @GetMapping("/index")
    public String indexPage(){
        return "index";
    }
}
