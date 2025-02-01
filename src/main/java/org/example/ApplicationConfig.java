package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static java.lang.System.out;

@Configuration
@ComponentScan("org.example")
public class ApplicationConfig {

    public ApplicationConfig() {
        out.println(" --> ApplicationConfig: constructor called");
    }
}
