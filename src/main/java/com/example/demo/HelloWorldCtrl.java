package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldCtrl
{
    @RequestMapping("/test")
    public String hello()
    {
        return "Success: Your request have been handled by HelloWorld Controller at /";
    }
}