package com.darthllama.parsers;

import com.darthllama.Application;
import org.apache.log4j.Logger;
import org.apache.tomcat.jni.User;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MasterFileReader {
    //This class reads all the 00type_list.txt files for each JSON section

    final static Logger logger = Logger.getLogger(MasterFileReader.class);

    static List<String> backgroundList = new ArrayList<>();
    static List<String> classList = new ArrayList<>();
    static List<String> equipmentList = new ArrayList<>();
    static List<String> featureList = new ArrayList<>();
    static List<String> raceList = new ArrayList<>();
    static List<String> spellsList = new ArrayList<>();

    public static void ReadFiles(){
        //File path
        //TODO: Provide a way for the user to set up this value
        //i.e. C:\Users\Alex\SpringbootMVC\alex-mcdonald-fyp\src\resources\json
        //TODO: This is very bad practise to grab from the properties like this. Create something better. Look it up.
        String filePath = System.getProperty("user.home") +
                Application.props.getProperty("resourceFolderPath");

        logger.info("The Users file directory will be; " + filePath);

        //each of these files contains a list of files that have a corresponding JSON file
        String background_list_file = "\\resources\\json\\backgrounds\\00background_list.txt";
        String class_list_file = "\\resources\\json\\classes\\00class_list.txt";
        String equipment_list_file = "\\resources\\json\\equipment\\00equipment_list.txt";
        String feature_list_file = "\\resources\\json\\features\\00features_list.txt";
        String race_list_file = "\\resources\\json\\races\\00race_list.txt";
        String spells_list_file = "\\resources\\json\\spells\\00spells_list.txt";

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(filePath + background_list_file))) {
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

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(filePath + class_list_file))) {
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

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(filePath + equipment_list_file))) {
            //stream.forEach(System.out::println);
            equipmentList = stream
                    .filter(line -> !line.startsWith("//")) //allows comments
                    .filter(line -> !line.isEmpty())   //Removes white space lines
                    .map(String::toLowerCase)       //removes the problem of cases
                    .distinct()                     //removes duplicates
                    .collect(Collectors.toList());  //Adds it to the list

        } catch (IOException e) {
            logger.error("IOException:" + e);
            e.printStackTrace();
        }

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(filePath + feature_list_file))) {
            //stream.forEach(System.out::println);
            featureList = stream
                    .filter(line -> !line.startsWith("//")) //allows comments
                    .filter(line -> !line.isEmpty())   //Removes white space lines
                    .map(String::toLowerCase)       //removes the problem of cases
                    .distinct()                     //removes duplicates
                    .collect(Collectors.toList());  //Adds it to the list

        } catch (IOException e) {
            logger.error("IOException: " + e);
            e.printStackTrace();
        }

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(filePath + race_list_file))) {
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

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(filePath + spells_list_file))) {
            //stream.forEach(System.out::println);
            spellsList = stream
                    .filter(line -> !line.startsWith("//")) //allows comments
                    .filter(line -> !line.isEmpty())   //Removes white space lines
                    .map(String::toLowerCase)       //removes the problem of cases
                    .distinct()                     //removes duplicates
                    .collect(Collectors.toList());  //Adds it to the list

        } catch (IOException e) {
            logger.error("IOException:" + e);
            e.printStackTrace();
        }

        //TODO: Parse each and everyone of these
        logger.info("Background list: " + backgroundList);
        logger.info("Class list: " + classList);
        logger.info("Equipment list: " + equipmentList);
        logger.info("Feature list: " + featureList);
        logger.info("Race list: " + raceList);
        logger.info("Spell list: " + spellsList);

        //Check that all the names listed have related files
        int tempCount =0;
        while(tempCount < classList.size()){
            File file = new File(filePath + "\\resources\\json\\backgrounds\\" + backgroundList.get(tempCount) + ".json");
            if(!file.exists()){
                logger.error(backgroundList.get(tempCount) + ".json does not exist");
            }
            tempCount++;
        }

        tempCount =0;
        while(tempCount < classList.size()){
            File file = new File(filePath + "\\resources\\json\\classes\\" + classList.get(tempCount) + ".json");
            if(!file.exists()){
                logger.error(classList.get(tempCount) + ".json does not exist");
            }
            tempCount++;
        }

        tempCount =0;
        while(tempCount < equipmentList.size()){
            File file = new File(filePath + "\\resources\\json\\equipment\\" + equipmentList.get(tempCount) + ".json");
            if(!file.exists()){
                logger.error(equipmentList.get(tempCount) + ".json does not exist");
            }
            tempCount++;
        }

        tempCount = 0;
        while(tempCount < featureList.size()){
            File file = new File(filePath + "\\resources\\json\\features\\" + featureList.get(tempCount) + ".json");
            if(!file.exists()){
                logger.error(featureList.get(tempCount) + ".json does not exist");
            }
            tempCount++;
        }

        tempCount = 0;
        while(tempCount < raceList.size()){
            File file = new File(filePath + "\\resources\\json\\races\\" + raceList.get(tempCount) + ".json");
            if(!file.exists()){
                logger.error(raceList.get(tempCount) + ".json does not exist");
            }
            tempCount++;
        }

        tempCount = 0;
        while(tempCount < spellsList.size()){
            File file = new File(filePath + "\\resources\\json\\spells\\" + spellsList.get(tempCount) + ".json");
            if(!file.exists()){
                logger.error(spellsList.get(tempCount) + ".json does not exist");
            }
            tempCount++;
        }
    }
}
