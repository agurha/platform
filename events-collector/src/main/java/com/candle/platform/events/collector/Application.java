package com.candle.platform.events.collector;

import com.mangofactory.swagger.plugin.EnableSwagger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by agurha on 16/06/2016.
 */
@SpringBootApplication
@EnableSwagger
public class Application {

    private static final Class<Application> appClass = Application.class;

    private static final Logger log = LoggerFactory.getLogger(appClass);

    public static void main(String[] args) {
        SpringApplication.run(appClass, args);
    }
}
