package com.darthllama;

import com.darthllama.parsers.MasterFileReader;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    final static Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(com.darthllama.Application.class, args);
        //Initialisation, check the JSON files exist
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
