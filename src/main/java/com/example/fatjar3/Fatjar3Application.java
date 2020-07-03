package com.example.fatjar3;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({PropertiesWithJavaConfig.class})
public class Fatjar3Application {

    private static final Logger logger = Logger.getLogger(Fatjar3Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Fatjar3Application.class, args);
        logger.info("Started!!");
    }

}
