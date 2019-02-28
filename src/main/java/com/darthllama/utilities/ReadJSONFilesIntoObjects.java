package com.darthllama.utilities;

import com.darthllama.classes.JsonStores.*;
import com.darthllama.classes.JsonStores.PlayerClassStore;
import com.darthllama.classes.PlayerRaceDetails.PlayerRace;
import com.darthllama.classes.PlayerClassDetails.PlayerClass;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.darthllama.classes.*;

public class ReadJSONFilesIntoObjects {

    //Logging
    private final static Logger logger = Logger.getLogger(ReadJSONFilesIntoObjects.class);

    //Collections
    private static List<String> backgroundList = new ArrayList<>();
    private static List<String> classList = new ArrayList<>();
    private static List<String> equipmentList = new ArrayList<>();
    private static List<String> featureList = new ArrayList<>();
    private static List<String> raceList = new ArrayList<>();
    private static List<String> spellsList = new ArrayList<>();

    public static void readJSONfilesIntoObjects(String filePath) {
        logger.info("ReadJSONFilesIntoObjects called.");
        //Read the JSON Files
        //For all our mapping needs
        ObjectMapper objectMapper = new ObjectMapper();
        //For the more complex JSON

        //For storing our backgrounds
        BackgroundStore backgroundStore = new BackgroundStore();
        //For races
        PlayerRaceStore raceStore = new PlayerRaceStore();
        //For classes
        PlayerClassStore classStore = new PlayerClassStore();
        //Test Players Character
        PlayerCharacterStore playerCharacterStore = new PlayerCharacterStore();

        //Backgrounds
        //Read 00background_list.txt
        try (Stream<String> stream = Files.lines(Paths.get(filePath + "\\resources\\json\\backgrounds\\00background_list.txt"))) {
            //stream.forEach(System.out::println);
            backgroundList = stream
                    .filter(line -> !line.startsWith("//")) //allows comments
                    .filter(line -> !line.isEmpty())   //Removes white space lines
                    .map(String::toLowerCase)       //removes the problem of cases
                    .distinct()                     //removes duplicates
                    .collect(Collectors.toList());  //Adds it to the list

        } catch (IOException e) {
            logger.error("IOException:" + e);
            e.printStackTrace();
        }
    logger.info("Backgrounds list read, time to convert each JSON file mentioned.");

        //Check that all the names listed have related files
        int tempCount = 0;
        while (tempCount < backgroundList.size()) {
            try {
                logger.info("Converting the following into objects: " + backgroundList.get(tempCount) + ".json");
                logger.info("Grabbing file: " + filePath + "\\resources\\json\\backgrounds\\" + backgroundList.get(tempCount) + ".json");
                //This loads the file from the users directory, aloowing them to make their own changes

                //The location of the file
                String fileLocation = filePath + "\\resources\\json\\backgrounds\\" + backgroundList.get(tempCount) + ".json";

                //This grabs the json file and acts to a temporary background, however we need to add the objects dynamically
                Background background = objectMapper.readValue(new File(fileLocation), Background.class);

                //So, we use the backgroundStore that was initialised in the begining and this nerd to the array
                backgroundStore.addBackground(background.getBackground_name(), background.getProficiencies_skills(), background.getProficiencies_tools(), background.getLanguages(),
                                background.getEquipment(), background.getCoins(), background.getBackground_speciality(), background.getBackground_feature(), background.getPersonality_trait_options(),
                                background.getIdeal_options(), background.getBond_options(), background.getFlaw_options());

                tempCount++;
            }
            catch (JsonGenerationException e){
                logger.error("JsonGenerationException converting JSON files to objects;/n" + e);
            }
            catch (JsonMappingException e){
                logger.error("JsonMappingException converting JSON files to objects;/n" + e);
            }
            catch (IOException e){
                logger.error("IOException converting JSON files to objects;/n" + e);
            }
        }

        //classes
        //Read 00class_list.txt
        try (Stream<String> stream = Files.lines(Paths.get(filePath + "\\resources\\json\\classes\\00class_list.txt"))) {
            //stream.forEach(System.out::println);
            classList = stream
                    .filter(line -> !line.startsWith("//")) //allows comments
                    .filter(line -> !line.isEmpty())   //Removes white space lines
                    .map(String::toLowerCase)       //removes the problem of cases
                    .distinct()                     //removes duplicates
                    .collect(Collectors.toList());  //Adds it to the list

        } catch (IOException e) {
            logger.error("IOException:" + e);
            e.printStackTrace();
        }
        logger.info("Class list read, time to convert each JSON file mentioned.");

        //Check that all the names listed have related files
        tempCount = 0;
        while (tempCount < classList.size()) {
            try {
                logger.info("Converting the following into objects: " + classList.get(tempCount) + ".json");
                logger.info("Grabbing file: " + filePath + "\\resources\\json\\classes\\" + classList.get(tempCount) + ".json");
                //This loads the file from the users directory, aloowing them to make their own changes

                //The location of the file
                String fileLocation = filePath + "\\resources\\json\\classes\\" + classList.get(tempCount) + ".json";

                //This grabs the json file and acts to a temporary background, however we need to add the objects dynamically
                PlayerClass playerClass = objectMapper.readValue(new File(fileLocation), PlayerClass.class);

                //So, we use the class Store that was initialised in the begining and this nerd to the array
                classStore.addPlayerClass(playerClass.getClass_name(), playerClass.getHitDie(), playerClass.getSkill_choice(),
                        playerClass.getSaving_throws());

                tempCount++;
            }
            catch (JsonGenerationException e){
                logger.error("JsonGenerationException converting JSON files to objects;/n" + e);
            }
            catch (JsonMappingException e){
                logger.error("JsonMappingException converting JSON files to objects;/n" + e);
            }
            catch (IOException e){
                logger.error("IOException converting JSON files to objects;/n" + e);
            }
        }
        //equipment

        //features

        //races
        //Read 00race_list.txt
        try (Stream<String> stream = Files.lines(Paths.get(filePath + "\\resources\\json\\races\\00race_list.txt"))) {
            //stream.forEach(System.out::println);
            raceList = stream
                    .filter(line -> !line.startsWith("//")) //allows comments
                    .filter(line -> !line.isEmpty())   //Removes white space lines
                    .map(String::toLowerCase)       //removes the problem of cases
                    .distinct()                     //removes duplicates
                    .collect(Collectors.toList());  //Adds it to the list

        } catch (IOException e) {
            logger.error("IOException:" + e);
            e.printStackTrace();
        }
        logger.info("Race list read, time to convert each JSON file mentioned.");

        //Check that all the names listed have related files
        tempCount = 0;
        while (tempCount < raceList.size()) {
            try {
                logger.info("Converting the following into objects: " + raceList.get(tempCount) + ".json");
                logger.info("Grabbing file: " + filePath + "\\resources\\json\\races\\" + raceList.get(tempCount) + ".json");
                //This loads the file from the users directory, aloowing them to make their own changes

                //The location of the file
                String fileLocation = filePath + "\\resources\\json\\races\\" + raceList.get(tempCount) + ".json";

                //This grabs the json file and acts to a temporary background, however we need to add the objects dynamically
                PlayerRace playerRace = objectMapper.readValue(new File(fileLocation), PlayerRace.class);

                //So, we use the backgroundStore that was initialised in the begining and this nerd to the array
                PlayerRaceStore.addPlayerRace(playerRace.getPlayerRaceName(), playerRace.getSize(), playerRace.getSpeed(), playerRace.getLanguages(), playerRace.getDarkvision(),
                                                playerRace.getFeatures(), playerRace.getProfiencyArmours(), playerRace.getProfiencyTools(), playerRace.getProfiencyWeapons(), playerRace.getStat_increases());
                tempCount++;
            }
            catch (JsonGenerationException e){
                logger.error("JsonGenerationException converting JSON files to objects;/n" + e);
            }
            catch (JsonMappingException e){
                logger.error("JsonMappingException converting JSON files to objects;/n" + e);
            }
            catch (IOException e){
                logger.error("IOException converting JSON files to objects;/n" + e);
            }
        }

        //spells
        //Testy mctest
        logger.info("Background Store; " + backgroundStore.getBackgroundArrAsString());
        logger.info("Player Races loaded; " + PlayerRaceStore.getPlayerRaceArrAsString());
        logger.info("Player Classes loaded; " + PlayerClassStore.getPlayerClassArrAsString());

        //Player Character Test
        //classStore.addPlayerClass(playerClass.getClass_name(), playerClass.getHitDie(), playerClass.getSkill_choice(),
        //                        playerClass.getSaving_throws());

        ArrayList<String> attributeTest1 = new ArrayList<String>();
        attributeTest1.add("10");
        attributeTest1.add("10");
        attributeTest1.add("10");
        attributeTest1.add("10");
        attributeTest1.add("10");
        attributeTest1.add("10");

        ArrayList<String> attributeTest2 = new ArrayList<String>();
        attributeTest2.add("15");
        attributeTest2.add("7");
        attributeTest2.add("13");
        attributeTest2.add("14");
        attributeTest2.add("12");
        attributeTest2.add("9");

        ArrayList<String> personality1 = new ArrayList<String>();
        personality1.add("I will fight for Justice.");
        ArrayList<String> personality2 = new ArrayList<String>();
        ArrayList<String> ideal1 = new ArrayList<String>();
        ideal1.add("I am fortunate to have what I do, and I will help other achieve the same.");
        ArrayList<String> ideal2 = new ArrayList<String>();
        ArrayList<String> bond1 = new ArrayList<String>();
        bond1.add("My mother raised me to be the warrior I am.");
        ArrayList<String> bond2 = new ArrayList<String>();
        ArrayList<String> flaw1 = new ArrayList<String>();
        flaw1.add("I have a secret that I will do anything to keep as one.");
        ArrayList<String> flaw2 = new ArrayList<String>();
        ArrayList<String> skillprof1 = new ArrayList<String>();
        skillprof1.add("Athletics");
        skillprof1.add("Intimidation");
        skillprof1.add("Perception");
        ArrayList<String> skillprof2 = new ArrayList<String>();

        playerCharacterStore.addPlayerCharacterClass(PlayerRaceStore.getPlayerRaceAtIndex(1),
                                                    backgroundStore.getBackgroundAtIndex(1),
                                                    PlayerClassStore.getPlayerClassAtIndex(1),attributeTest1, personality1,ideal1,bond1,flaw1, skillprof1, "Test McTest", "A reknowned warrior build to destroy the one ring. He will become king and destroy all of hte evil in the world.");

        //Convert them all into Objects
        //Backgrounds

        //classes

        //equipment

        //features

        //races

        //spells
    }
}
