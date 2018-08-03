package com.darthllama;

import com.darthllama.parsers.MasterFileReader;
import com.darthllama.utilities.LoadPropertyFile;
import com.darthllama.utilities.WriteJSONFiles;
import com.darthllama.utilities.WritePropertyFile;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class Application {

    final static Logger logger = Logger.getLogger(Application.class);

    public static Properties props = null;

    public static void main(String[] args) {
        SpringApplication.run(com.darthllama.Application.class, args);
        //Initialisation, check the JSON files exist
        logger.info("Checking the JSON files exist. Further validation will come later...");

        // For testing, we'll use something like this when we ask the user for details
        /*
        logger.info("Lets create the config.properties file...");
        WritePropertyFile.TestWriteToPropertiesFile();
        */

        logger.info("Lets read the file \"config.properties\"...");
        props = LoadPropertyFile.LoadPropertyFile();

        //Create the resources on the user's filesystem
        //TODO: If they already exist... don't do this. Create an option for the user to refresh them
        WriteJSONFiles wjf = new WriteJSONFiles();
        wjf.WriteDefaultJSONFiles(props.getProperty("filePath"));

        //TODO: Ask the user for a location to store said JSON, or as a default, find somewhere to store them
        MasterFileReader.ReadFiles();
        logger.info("Application running...");

    }

    /* For debugging, not quite needed for the most part
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
    */
}
