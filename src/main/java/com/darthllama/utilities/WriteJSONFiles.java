package com.darthllama.utilities;

import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WriteJSONFiles {

    //Logging
    private final static Logger logger = Logger.getLogger(WriteJSONFiles.class);

    //Collections
    private static List<String> backgroundList = new ArrayList<>();
    private static List<String> classList = new ArrayList<>();
    private static List<String> equipmentList = new ArrayList<>();
    private static List<String> featureList = new ArrayList<>();
    private static List<String> raceList = new ArrayList<>();
    private static List<String> spellsList = new ArrayList<>();

    public void WriteDefaultJSONFiles(String filePath) {
        //logger.info(getFile("json/classes/00class_list.txt"));
        //logger.info(getFile("json/classes/cleric.json"));

        //Its all well and good having these resource files in the resources folder, but we need hard copies
        //on the users machine. This is how.

        logger.info("Resources not found. Creating...");

        //Makes the folders
        File dir = new File(filePath + "\\alex-mcdonald-fyp\\resources\\json\\backgrounds");
        dir.mkdirs();
            dir = new File(filePath + "\\alex-mcdonald-fyp\\resources\\json\\classes");
        dir.mkdirs();
            dir = new File(filePath + "\\alex-mcdonald-fyp\\resources\\json\\equipment");
        dir.mkdirs();
            dir = new File(filePath + "\\alex-mcdonald-fyp\\resources\\json\\features");
        dir.mkdirs();
            dir = new File(filePath + "\\alex-mcdonald-fyp\\resources\\json\\races");
        dir.mkdirs();
            dir = new File(filePath + "\\alex-mcdonald-fyp\\resources\\json\\spells");
        dir.mkdirs();
        //config.application
            dir = new File(filePath + "\\alex-mcdonald-fyp");
        dir.mkdirs();

        //TODO: I really have to finish creating the JSON files to be able to finish testing this
        logger.info("Copying the Class files from the resources into the user directory; starting with 00class_list");
        writeFile(filePath + "\\alex-mcdonald-fyp\\resources\\json\\backgrounds\\00background_list.txt", getFile("json/backgrounds/00background_list.txt"));
        writeFile(filePath + "\\alex-mcdonald-fyp\\resources\\json\\classes\\00class_list.txt", getFile("json/classes/00class_list.txt"));
        writeFile(filePath + "\\alex-mcdonald-fyp\\resources\\json\\equipment\\00equipment_list.txt", getFile("json/equipment/00equipment_list.txt"));
        writeFile(filePath + "\\alex-mcdonald-fyp\\resources\\json\\features\\00features_list.txt",getFile("json/features/00features_list.txt"));
        writeFile(filePath + "\\alex-mcdonald-fyp\\resources\\json\\races\\00race_list.txt",getFile("json/races/00race_list.txt"));
        writeFile(filePath + "\\alex-mcdonald-fyp\\resources\\json\\spells\\00spells_list.txt",getFile("json/spells/00spells_list.txt"));
        //writeFile(filePath + "\\alex-mcdonald-fyp\\config.properties",getFile("config.properties"));


        //TODO: Just Features and spells left boi
        //TODO: Is there a way to optimise this?
        //Backgrounds
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(filePath + "\\alex-mcdonald-fyp\\resources\\json\\backgrounds\\00background_list.txt"))) {
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

        //Check that all the names listed have related files
        int tempCount = 0;
        while (tempCount < backgroundList.size()) {
            logger.info("Going through the background list: " + backgroundList.get(tempCount) + ".json");
            writeFile(filePath + "\\alex-mcdonald-fyp\\resources\\json\\backgrounds\\" + backgroundList.get(tempCount) + ".json", getFile("json/backgrounds/" + backgroundList.get(tempCount) + ".json"));
            tempCount++;
        }

        //Classes
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(filePath + "\\alex-mcdonald-fyp\\resources\\json\\classes\\00class_list.txt"))) {
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

        //Check that all the names listed have related files
        tempCount = 0;
        while (tempCount < classList.size()) {
            logger.info("Going through the class list: " + classList.get(tempCount) + ".json");
            //getFile("C:\\Users\\Alex\\Documents\\Programming\\Projects\\alex-mcdonald-fyp\\src\\main\\resources\\json\\classes\\" + classList.get(tempCount) + ".txt");
            writeFile(filePath + "\\alex-mcdonald-fyp\\resources\\json\\classes\\" + classList.get(tempCount) + ".json", getFile("json/classes/" + classList.get(tempCount) + ".json"));
            //writeFile(filePath + "\\alex-mcdonald-fyp\\resources\\json\\classes\\00class_list.txt", getFile("json/classes/00class_list.txt"));
            tempCount++;
        }

        //Equipment
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(filePath + "\\alex-mcdonald-fyp\\resources\\json\\equipment\\00equipment_list.txt"))) {
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

        //Check that all the names listed have related files
        tempCount = 0;
        while (tempCount < equipmentList.size()) {
            logger.info("Going through the equipment list: " + equipmentList.get(tempCount) + ".json");
            writeFile(filePath + "\\alex-mcdonald-fyp\\resources\\json\\equipment\\" + equipmentList.get(tempCount) + ".json", getFile("json/equipment/" + equipmentList.get(tempCount) + ".json"));
            tempCount++;
        }
        /*TODO: Writing to the drive Features JSON
        //Features
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(filePath + "\\alex-mcdonald-fyp\\resources\\json\\features\\00features_list.txt"))) {
            //stream.forEach(System.out::println);
            featureList = stream
                    .filter(line -> !line.startsWith("//")) //allows comments
                    .filter(line -> !line.isEmpty())   //Removes white space lines
                    .map(String::toLowerCase)       //removes the problem of cases
                    .distinct()                     //removes duplicates
                    .collect(Collectors.toList());  //Adds it to the list

        } catch (IOException e) {
            logger.error("IOException:" + e);
            e.printStackTrace();
        }

        //Check that all the names listed have related files
        tempCount = 0;
        while (tempCount < featureList.size()) {
            logger.info("Going through the features list: " + featureList.get(tempCount) + ".json");
            writeFile(filePath + "\\alex-mcdonald-fyp\\resources\\json\\features\\" + featureList.get(tempCount) + ".json", getFile("json/features/" + featureList.get(tempCount) + ".json"));
            tempCount++;
        }
        */

        //Races
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(filePath + "\\alex-mcdonald-fyp\\resources\\json\\races\\00race_list.txt"))) {
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

        //Check that all the names listed have related files
        tempCount = 0;
        while (tempCount < raceList.size()) {
            logger.info("Going through the race list: " + raceList.get(tempCount) + ".json");
            writeFile(filePath + "\\alex-mcdonald-fyp\\resources\\json\\races\\" + raceList.get(tempCount) + ".json", getFile("json/races/" + raceList.get(tempCount) + ".json"));
            tempCount++;
        }

        //TODO: Write Spells JSON to the users drive
        /*
        //Equipment
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(filePath + "\\alex-mcdonald-fyp\\resources\\json\\spells\\00spell_list.txt"))) {
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

        //Check that all the names listed have related files
        tempCount = 0;
        while (tempCount < spellsList.size()) {
            logger.info("Going through the spell list: " + spellsList.get(tempCount) + ".json");
            writeFile(filePath + "\\alex-mcdonald-fyp\\resources\\json\\spells\\" + spellsList.get(tempCount) + ".json", getFile("json/spells/" + spellsList.get(tempCount) + ".json"));
            tempCount++;
        }*/
    }

    private String getFile(String fileName){
        StringBuilder result = new StringBuilder();
        //logger.info("File name: " + fileName);
        //Get file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
        logger.info("Getting file: " + classLoader.getResource(fileName));
        File file = new File(classLoader.getResource(fileName).getFile());

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

        } catch (IOException e) {
            logger.error("IOException getting " + file.getAbsolutePath() + ":" + e);
            e.printStackTrace();
        }
        catch (NullPointerException e) {
            logger.error("NullPointerException getting " + file.getAbsolutePath() + ":" + e);
            e.printStackTrace();
        }
        logger.info("File gotten: " + fileName);
        return result.toString();
    }

    private void writeFile(String filePath, String content){
        //Files writers- using this way, it'll be create the file if it doesn't exist
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            fw = new FileWriter(filePath);
            bw = new BufferedWriter(fw);
            bw.write(content);

            logger.info("File written to: " + filePath);

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();

            } catch (IOException ex) {
                logger.error("IOException:" + ex);
                ex.printStackTrace();

            }
        }
    }

}
