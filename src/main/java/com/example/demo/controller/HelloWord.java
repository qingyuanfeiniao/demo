package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Author wanglei
 * @create 2021/3/5 5:01 下午
 */
@RestController
@RequestMapping("/api/hello")
public class HelloWord {

    @GetMapping("/hello")
    public String hello(){

        return "hello world!";
    }


}
