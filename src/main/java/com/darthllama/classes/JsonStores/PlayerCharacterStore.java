package com.darthllama.classes.JsonStores;

import com.darthllama.classes.Background;
import com.darthllama.classes.PlayerCharacter;
import com.darthllama.classes.PlayerClassDetails.PlayerClass;
import com.darthllama.classes.PlayerRaceDetails.PlayerRace;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class PlayerCharacterStore {
    final static Logger logger = Logger.getLogger(PlayerCharacterStore.class);

    private static ArrayList<PlayerCharacter> playerCharacterArrayList;

    public PlayerCharacterStore(){ playerCharacterArrayList = new ArrayList<PlayerCharacter>(); }

    public static void addPlayerCharacterClass(PlayerRace playerRace, Background background, PlayerClass playerClass, ArrayList<String> attributeScores,
                                               ArrayList<String> personalityTraits, ArrayList<String> ideals, ArrayList<String> bonds, ArrayList<String> flaws,
                                               ArrayList<String> skillProcifiencies, String playerName, String playerDesc){
        playerCharacterArrayList.add(new PlayerCharacter(playerRace, background, playerClass, attributeScores,
                                    personalityTraits, ideals, bonds, flaws,
                                    skillProcifiencies, playerName, playerDesc));

        logger.info("Player Character added; " + playerName);
    }

    //To get specific player classes
    public PlayerCharacter getPlayerCharacterAtIndex(int index){
        return playerCharacterArrayList.get(index);
    }

    //or the entire list
    public static ArrayList getPlayerCharacterArr(){
        return playerCharacterArrayList;
    }

    public static String getPlayerClassArrAsString(){
        String output = "";
        int temp = 0;

        while (temp < playerCharacterArrayList.size()){
            if(temp == playerCharacterArrayList.size() - 1){
                output += playerCharacterArrayList.get(temp).getPlayerName();
            }
            else{
                output += playerCharacterArrayList.get(temp).getPlayerName() + ", ";
            }
            temp++;
        }

        return "Player Character Array as String; " + output;
    }
}