package com.example.projekt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}