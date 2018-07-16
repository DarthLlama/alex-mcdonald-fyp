package com.darthllama.utilities;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice {

    final static Logger logger = Logger.getLogger(Dice.class);

    //Declare the random object
    private static Random random = new Random();
    private static int result;
    private static int count;

    public static int Roll(int sides){
        //i.e. "Roll a six sided dice" becomes "Dice.Roll(6)"
        result = random.nextInt(sides) + 1;
        return result;
    }

    public static int RollAbilitiyScore() {
        int lowestValue = 0;
        int[] tempValues = new int[4];
        result = 0;
        count = 0;
        logger.info("Rolling Ability Scores, result: " + result);

        //for each stat, we have to roll four, six sided dice and remove the lowest.
        while(count < tempValues.length) {

            tempValues[count] = Roll(6);
            logger.info("Value: " + tempValues[count]);

            if (lowestValue > tempValues[count] || lowestValue == 0){
                lowestValue = tempValues[count];
                System.out.println("New lowest value: " + tempValues[count]);
            }
            count++;
        }
        result = tempValues[0] + tempValues[1] + tempValues[2] + tempValues[3];
        logger.info("Result total: "  + result);
        result -= lowestValue;
        return result;
    }

    //inputs include hit die + con modifier
    public static int RollHealth(int hitDie, int conMod){
        result = Roll(hitDie) + conMod;
        return result;
    }
}

