package com.hhm.mygit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ming
 * @create 2018-10-31 21:32
 */
@RestController
public class TestController {

    // 新增注释
    
    //新增方法
    public void addMethod(){
        System.out.println("this is new method.");
    }

    @GetMapping("/test")
    public String test(){
        return "ok";
    }

}
