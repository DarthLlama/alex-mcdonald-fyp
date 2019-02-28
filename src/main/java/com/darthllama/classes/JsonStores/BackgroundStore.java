package com.darthllama.classes.JsonStores;

import com.darthllama.classes.Background;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class BackgroundStore {
    //This is the class that is made up of of the different backgrounds, when the JSON files are read, they created
    //and put into here. From here we can do actual stuff with it. Probably. Hopefully.

    final static Logger logger = Logger.getLogger(BackgroundStore.class);

    private static ArrayList<Background> backgroundArray;

    public BackgroundStore(){
        backgroundArray = new ArrayList<Background>();
    }

    public void addBackground(String background_name, List<String> proficiencies_skills, List<String> proficiencies_tools,
                              List<String> languages, List<String> equipment, List<String> coins, List<String> background_speciality,
                              String background_feature, List<String> personality_trait_options, List<String> ideal_options,
                              List<String> bond_options, List<String> flaw_options){

        backgroundArray.add(new Background(background_name, proficiencies_skills, proficiencies_tools, languages, equipment, coins,
                                            background_speciality, background_feature,
                                            personality_trait_options, ideal_options, bond_options, flaw_options));

        logger.info("Background added to BackgroundStore; " + background_name);
    }

    //To get specific backgrounds
    public Background getBackgroundAtIndex(int index){
        return backgroundArray.get(index);
    }

    //or the entire list
    public static ArrayList getBackgroundArr(){
        return backgroundArray;
    }

    public String getBackgroundArrAsString(){
        String output = "";
        int temp = 0;

        while (temp < backgroundArray.size()){
            if(temp == backgroundArray.size() - 1){
                output += backgroundArray.get(temp).getBackground_name();
            }
            else{
                output += backgroundArray.get(temp).getBackground_name() + ", ";
            }
            temp++;
        }

        return "Background Array as String; " + output;
    }

}
