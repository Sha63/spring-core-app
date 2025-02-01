package org.example;

import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.core.metrics.StartupStep;

import java.util.Random;
import java.util.UUID;

public class MyApplicationStartup implements ApplicationStartup {

    @Override
    public StartupStep start(String name) {
        System.out.println(name + " step has started!!");
        return new MyApplicationStartupStep(name, new Random().nextLong());
    }
}
