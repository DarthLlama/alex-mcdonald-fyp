package com.darthllama.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    final static Logger logger = Logger.getLogger(IndexController.class);

    //I've had a problem loading a static homepage, so this is janky fix
    @GetMapping("/index")
    public String loadIndex(){
        return "index";
    }

}
