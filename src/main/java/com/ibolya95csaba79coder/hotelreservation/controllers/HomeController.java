package com.ibolya95csaba79coder.hotelreservation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    @ResponseBody
    public String home() {

        System.out.println();
        return "hello!";
    }
}
