package com.kulpreet.springBoot1.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String home(){
        logger.debug("Printing welcome message");
        return ("<h1> Welcome to the Homepage of Employee Department Management Project </h1>");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user")
    public String user(){
        logger.debug("Printing welcome message for user");
        return ("<h1> Welcome User to the Homepage of Employee Department Management Project </h1>");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/admin")
    public String admin(){
        logger.debug("Printing welcome message for admin");
        return ("<h1> Welcome Admin to the Homepage of Employee Department Management Project </h1>");
    }
}
