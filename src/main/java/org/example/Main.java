package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.setApplicationStartup(new MyApplicationStartup());
        applicationContext.register(ApplicationConfig.class);
        applicationContext.refresh();
        MessageRenderer mr = applicationContext.getBean(MessageRenderer.class);
        mr.render();
    }
}