package com.darthllama.utilities;

import com.darthllama.parsers.MasterFileReader;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadPropertyFile {
    //Logging
    final static Logger logger = Logger.getLogger(LoadPropertyFile.class);

    public static Properties LoadPropertyFile() {
        //The properties file to load
        Properties prop = new Properties();

        //We're going to read it
        InputStream input = null;

        try {
            input = new FileInputStream("config.properties");
            prop.load(input);
            logger.info(prop.getProperty("filePath"));
            return prop;
        } catch (IOException ioex) {
            logger.error("IOException at loading properties file: " + ioex);
            ioex.printStackTrace();
        } finally {
            if (input == null) {
                try {
                    input.close();
                } catch (IOException ioex) {
                    logger.error("Error closing inputstream: " + ioex);
                    ioex.printStackTrace();
                }
            }
        }
        return prop;
    }
}
