package com.darthllama.utilities;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DiceRollerController {

    public static int globalSides = 6;

    @GetMapping("/dice-roller")
    public String greeting(@RequestParam(name="sides", required=false, defaultValue="globalSides") int sides, Model model) {
        globalSides = sides;
        model.addAttribute("sides", sides);
        int result = Dice.Roll(sides);

        model.addAttribute("result", result);

        return "dice-roller";
    }

}
