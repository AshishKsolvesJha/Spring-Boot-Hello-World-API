package com.First.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/api")
    public  String ApiFirst(){
        return "ASHISH KUMAR JHA API";
    }
    @RequestMapping("/Address")
    public String addr(){
        return "107-A BC Block, Shalimar bagh";
    }

}