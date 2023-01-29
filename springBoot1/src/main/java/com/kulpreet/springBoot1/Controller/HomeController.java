package com.kulpreet.springBoot1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String home(){
        return ("<h1> Welcome to the Homepage of Employee Department Management Project </h1>");
    }
}
