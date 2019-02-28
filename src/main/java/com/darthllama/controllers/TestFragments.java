package com.darthllama.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestFragments {
    @GetMapping("/fragments")
    public String getHome() {
        return "fragments.html";
    }
}
