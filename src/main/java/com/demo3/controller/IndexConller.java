package com.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexConller {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
