package com.darthllama.classes.JsonStores;

import com.darthllama.classes.PlayerRaceDetails.PlayerRace;
import com.darthllama.classes.PlayerRaceDetails.PlayerSubrace;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class PlayerRaceStore {
    final static Logger logger = Logger.getLogger(PlayerRaceStore.class);

    private static ArrayList<PlayerRace> playerRaceStoreArrayList;

    public PlayerRaceStore(){ playerRaceStoreArrayList = new ArrayList<PlayerRace>(); }

    public static void addPlayerRace(String playerRaceName, String size, String speed, String[] languages, String darkvision,
                                   String[] features, String[] profiencyArmours, String[] profiencyTools, String[] profiencyWeapons, String[] stat_increases){

        playerRaceStoreArrayList.add(new PlayerRace(playerRaceName, size, speed, languages, darkvision,features, profiencyArmours, profiencyTools, profiencyWeapons, stat_increases));

        logger.info("Player Race added; " + playerRaceName);
    }

    //To get specific spells
    public static PlayerRace getPlayerRaceAtIndex(int index){
        return playerRaceStoreArrayList.get(index);
    }

    //or the entire list
    public static ArrayList getPlayerRaceArr(){
        return playerRaceStoreArrayList;
    }

    public static String getPlayerRaceArrAsString(){
        String output = "";
        int temp = 0;

        while (temp < playerRaceStoreArrayList.size()){
            if(temp == playerRaceStoreArrayList.size() - 1){
                output += playerRaceStoreArrayList.get(temp).getPlayerRaceName();
            }
            else{
                output += playerRaceStoreArrayList.get(temp).getPlayerRaceName() + ", ";
            }
            temp++;
        }

        return "Player Race Array as String; " + output;
    }


}
