package com.arthur.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/helloThymeleaf")
    public String helloThymeleaf(Model model, @RequestParam(value = "name", required = false, defaultValue = "world") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
}
