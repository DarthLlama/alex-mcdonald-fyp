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
    final static Logger logger = Logger.getLogger(WriteJSONFiles.class);

    //Collections
    static List<String> classList = new ArrayList<>();
    static List<String> featureList = new ArrayList<>();
    static List<String> raceList = new ArrayList<>();
    static List<String> spellsList = new ArrayList<>();

    public void WriteDefaultJSONFiles(String filePath) {
        //logger.info(getFile("json/classes/00class_list.txt"));

        //Its all well and good having these resource files in the resources folder, but we need hard copies
        //on the users machine. This is how.

        logger.info("Resources not found. Creating...");

        //Makes the folders
        File dir = new File(filePath + "\\alex-mcdonald-fyp\\classes");
        dir.mkdirs();
            dir = new File(filePath + "\\alex-mcdonald-fyp\\features");
        dir.mkdirs();
            dir = new File(filePath + "\\alex-mcdonald-fyp\\races");
        dir.mkdirs();
            dir = new File(filePath + "\\alex-mcdonald-fyp\\spells");
        dir.mkdirs();

        //TODO: I really have to finish creating hte JSON files to be able to finish testing this
        writeFile(filePath + "\\alex-mcdonald-fyp\\classes\\00class_list.txt", getFile("json/classes/00class_list.txt"));
        //writeFile(getFile(filePath + "\\alex-mcdonald-fyp\\features\\00features_list.txt"),"json/features/00features_list.txt"));
        //writeFile(getFile(filePath + "\\alex-mcdonald-fyp\\races\\00race_list.txt"),"json/races/00race_list.txt"));
        //writeFile(getFile(filePath + "\\alex-mcdonald-fyp\\spells\\00spells_list.txt"),"json/spells/00spells_list.txt"));


        //TODO: Do this for Races, Features & Spells
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(filePath + "\\alex-mcdonald-fyp\\classes\\00class_list.txt"))) {
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

        //Check that all the names listed have related files
        int tempCount = 0;
        while (tempCount < classList.size()) {
            getFile("json/classes/" + classList.get(tempCount) + ".txt");
            writeFile(filePath + "\\alex-mcdonald-fyp\\classes\\" + classList.get(tempCount) + ".txt", getFile("json/classes/" + classList.get(tempCount) + ".txt"));
            tempCount++;
        }

    }

    private String getFile(String fileName){
        StringBuilder result = new StringBuilder();

        //Get file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

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

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }
    }

}
