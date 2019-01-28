package com.darthllama.utilities;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DiceRollerController {

    final static Logger logger = Logger.getLogger(DiceRollerController.class);

    public static int globalSides = 6;

    @GetMapping("/dice-roller")
    public String greeting(@RequestParam(name="sides", required=false, defaultValue="globalSides") int sides, Model model) {
        globalSides = sides;
        model.addAttribute("sides", sides);
        int result = Dice.Roll(sides);

        model.addAttribute("result", result);
        logger.info("Rolled D" + sides + " -> " + result);

        return "dice-roller";
    }

}
