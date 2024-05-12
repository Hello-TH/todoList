package com.example.todoList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/")
public class HelloWorldController {
	
    @GetMapping("/")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World！ + Branch Test");
        return "index";
    }
}