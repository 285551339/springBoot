package com.springboot.springbootdocker.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

    @GetMapping("/test")
    public String test(){
        System.out.println("12346");
        System.out.println("987654");
        return "HLLE HODER";
    }

}
