package com.darthllama.utilities;

import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritePropertyFile {
    //Logging
    final static Logger logger = Logger.getLogger(WritePropertyFile.class);

    private static Properties prop = new Properties();
    private static OutputStream output = null;

    public static void WriteToPropertiesFile(String filePath) throws FileNotFoundException, IOException {
        try {

            output = new FileOutputStream("config.properties");

            //Set the properties
            prop.setProperty("filePath", filePath);
            prop.setProperty("resourceFolderPath", "\\src\\main\\resources");

            // save properties to project root folder
            prop.store(output, null);

        } catch (FileNotFoundException fnfex) {
            logger.error("FileNotFoundException at writing properties file: " + fnfex);
            fnfex.printStackTrace();
        } catch (IOException ioex) {
            logger.error("IOException at writing properties file: " + ioex);
            ioex.printStackTrace();
        } finally {
            if (output == null) {
                try {
                    output.close();
                } catch (IOException ioex) {
                    logger.error("Error closing outputstream: " + ioex);
                    ioex.printStackTrace();
                }
            }
        }
    }

    public static void TestWriteToPropertiesFile(){
        try {
            WriteToPropertiesFile("C:\\Users\\Alex\\SpringbootMVC\\alex-mcdonald-fyp\\");
        }
        catch(IOException ioex){
            logger.error("IOException testing writing to the properties file: " + ioex);
            ioex.printStackTrace();
        }
    }
}
