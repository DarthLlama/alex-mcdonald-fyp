package com.darthllama.classes.JsonStores;

import org.apache.log4j.Logger;
import com.darthllama.classes.PlayerClassDetails.PlayerClass;

import java.util.ArrayList;

public class PlayerClassStore {
    final static Logger logger = Logger.getLogger(PlayerClassStore.class);

    private static ArrayList<PlayerClass> playerClassArrayList;

    public PlayerClassStore(){ playerClassArrayList = new ArrayList<PlayerClass>(); }

    public static void addPlayerClass(String class_name, String hitDie, String[] skill_choice, String[] saving_throws){
        playerClassArrayList.add(new PlayerClass(class_name, hitDie, skill_choice, saving_throws));

        logger.info("Player Class added; " + class_name);
    }

    //To get specific player classes
    public static PlayerClass getPlayerClassAtIndex(int index){
        return playerClassArrayList.get(index);
    }

    //or the entire list
    public static ArrayList getPlayerClassArr(){
        return playerClassArrayList;
    }

    public static String getPlayerClassArrAsString(){
        String output = "";
        int temp = 0;

        while (temp < playerClassArrayList.size()){
            if(temp == playerClassArrayList.size() - 1){
                output += playerClassArrayList.get(temp).getClass_name();
            }
            else{
                output += playerClassArrayList.get(temp).getClass_name() + ", ";
            }
            temp++;
        }

        return "Player Class Array as String; " + output;
    }
}
