package com.darthllama.parsers;

import com.darthllama.Application;
import org.apache.log4j.Logger;

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

    static List<String> classList = new ArrayList<>();
    static List<String> featureList = new ArrayList<>();
    static List<String> raceList = new ArrayList<>();
    static List<String> spellsList = new ArrayList<>();

    public static void ReadFiles(){
        //File path
        //TODO: Provide a way for the user to set up this value

        //Alex's PC
        //String filePath = "C:\\Users\\Alex\\Documents\\Programming\\Projects\\" + "alex-mcdonald-fyp\\src\\main\\resources\\json";
        //ICE Work Laptop location
        String filePath = Application.props.getProperty("filePath") + Application.props.getProperty("resourceFolderPath") + "\\json";

        //each of these files contains a list of files that have a corresponding JSON file
        String class_list_file = "\\classes\\00class_list.txt";
        String feature_list_file = "\\features\\00features_list.txt";
        String race_list_file = "\\races\\00race_list.txt";
        String spells_list_file = "\\spells\\00spells_list.txt";

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
            logger.error("IOException:");
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
            logger.error("IOException:");
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
            logger.error("IOException:");
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
            logger.error("IOException:");
            e.printStackTrace();
        }

        //TODO: Parse each and everyone of these
        logger.info(classList);
        logger.info(featureList);
        logger.info(raceList);
        logger.info(spellsList);

        //Check that all the names listed have related files
        int tempCount =0;
        while(tempCount < classList.size()){
            File file = new File(filePath + "\\classes\\" + classList.get(tempCount) + ".txt");
            if(!file.exists()){
                logger.error(classList.get(tempCount) + ".txt does not exist");
            }
            tempCount++;
        }

        tempCount = 0;
        while(tempCount < featureList.size()){
            File file = new File(filePath + "\\features\\" + featureList.get(tempCount) + ".txt");
            if(!file.exists()){
                logger.error(featureList.get(tempCount) + ".txt does not exist");
            }
            tempCount++;
        }

        tempCount = 0;
        while(tempCount < raceList.size()){
            File file = new File(filePath + "\\features\\" + raceList.get(tempCount) + ".txt");
            if(!file.exists()){
                logger.error(raceList.get(tempCount) + ".txt does not exist");
            }
            tempCount++;
        }

        tempCount = 0;
        while(tempCount < spellsList.size()){
            File file = new File(filePath + "\\features\\" + spellsList.get(tempCount) + ".txt");
            if(!file.exists()){
                logger.error(spellsList.get(tempCount) + ".txt does not exist");
            }
            tempCount++;
        }
    }
}
