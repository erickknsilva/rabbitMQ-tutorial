package net.javaguides;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class RabbitmqTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqTutorialApplication.class, args);
    }

}
