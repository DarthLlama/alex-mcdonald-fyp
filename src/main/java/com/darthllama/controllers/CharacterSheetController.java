package com.darthllama.controllers;

import com.darthllama.classes.JsonStores.PlayerCharacterStore;
import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CharacterSheetController {
    final static Logger logger = Logger.getLogger(CharacterSheetController.class);


    @GetMapping("/character-sheets")
    public String LoadCharacterListPage(Model model){
        model.addAttribute("playerCharacters", PlayerCharacterStore.getPlayerCharacterArr());

        return "character-list";
    }

}
