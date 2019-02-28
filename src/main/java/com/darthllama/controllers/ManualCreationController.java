package com.darthllama.controllers;

import com.darthllama.classes.JsonStores.*;
import com.darthllama.classes.PlayerCharacter;
import com.darthllama.classes.PlayerRaceDetails.PlayerRace;
import com.darthllama.classes.Background;
import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ManualCreationController {
    final static Logger logger = Logger.getLogger(ManualCreationController.class);
    //This is who we are passing down the line
    public PlayerCharacter playerCharacter;

    @GetMapping("/manual-character")
    public String LoadManualCharacterIntroPage(){
        logger.info("ManualCharacterIntroPage loaded");
        return "ManualCharacterPageIntro.html";
    }

    @GetMapping("/manual-1-race")
    public String LoadManualCharacter1Race(Model model){
        model.addAttribute("playerRaces", PlayerRaceStore.getPlayerRaceArr());

        logger.info("LoadManualCharacter1Race loaded");
        return "ManualCreation/race.html";
    }

    @PostMapping("/manual-1-race")
    public String ManualCharacter1RacChosen(@ModelAttribute PlayerRace playerRace){
        playerCharacter.setPlayerRace(playerRace);

        logger.info("PlayerRace chosen: " + playerRace.getPlayerRaceName());
        return "ManualCreation/background.html";
    }

    @GetMapping("/manual-2-background")
    public String LoadManualCharacter2Background(Model model){
        model.addAttribute("backgrounds", BackgroundStore.getBackgroundArr());

        logger.info("LoadManualCharacter2Background loaded");
        return "ManualCreation/background.html";
    }

    @GetMapping("/manual-3-class")
    public String LoadManualCharacter3Class(Model model){
        model.addAttribute("playerClasses", PlayerClassStore.getPlayerClassArr());

        logger.info("LoadManualCharacter3Class loaded");
        return "ManualCreation/class.html";
    }

    @GetMapping("/manual-4-attributes")
    public String LoadManualCharacter4Attributes(Model model){
        //model.addAttribute("playerRaces", PlayerRaceStore.getPlayerRaceArr());

        logger.info("LoadManualCharacter4Attributes loaded");
        return "ManualCreation/attributes.html";
    }

    @GetMapping("/manual-5-further-info")
    public String LoadManualCharacter4FutherInfo(Model model){
        //model.addAttribute("playerRaces", PlayerRaceStore.getPlayerRaceArr());

        logger.info("LoadManualCharacter4FurtherInfo loaded");
        return "ManualCreation/further-info.html";
    }
}
