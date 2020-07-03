package com.example.fatjar3;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

//https://www.baeldung.com/spring-properties-file-outside-jar

@Configuration
//@PropertySources({
//        @PropertySource("classpath:application.properties"),
//        @PropertySource("classpath:log4j.properties")
//})
@ConfigurationProperties(prefix = "jdbc")
public class PropertiesWithJavaConfig {

    protected static final Logger logger
            = Logger.getLogger(PropertiesWithJavaConfig.class);
//    java -jar app.jar --spring.config.location=classpath:/another-location.properties
//    java -jar app.jar --spring.config.location=config/*
//    java -jar fatjar3-0.0.1-SNAPSHOT.jar --spring.config.location=C:\Users\ADMIN\Documents\spring\fatjar\config\application.properties -Dlog4j.configuration=C:\Users\ADMIN\Documents\spring\fatjar\config\log4j.properties

    @Value( "${jdbc.url}" )
    private String jdbcUrl;

    @Bean
    public Handler handler(){
        logger.info(jdbcUrl);
        return new Handler();
    }
}
