package com.darthllama.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RandomCreationController {
    final static Logger logger = Logger.getLogger(RandomCreationController.class);

    @GetMapping("/randomise-character")
    public String LoadRandomiseCharacterIntroPage(){
        logger.info("RandomiseCharacterIntroPage loaded");
        return "RandomCharacterPageIntro.html";
    }

    @GetMapping("randomise-character-done")
    public String RandomiseCharacter(){
        logger.info("RandomiseCharacter called.");

        //Random character generation things

        return "";
    }

}
