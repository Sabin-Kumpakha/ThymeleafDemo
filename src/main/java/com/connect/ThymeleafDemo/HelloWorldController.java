package com.connect.ThymeleafDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String hello(Model model){
        String greeting;
        Date now = new Date();
        int hour = now.getHours();

        if(hour < 12){
            greeting = "Good Morning";
        } else if (hour < 18) {
            greeting = "Good Afternoon";
        } else if (hour < 21) {
            greeting = "Good Evening";
        } else {
            greeting = "Good Night";
        }

        model.addAttribute("message", "Hello World!!!");
        model.addAttribute("greeting", greeting);
        return "helloWorld";
    }
}
