package org.example;

import org.springframework.stereotype.Service;

import static java.lang.System.out;

@Service
public class HelloWorldMessageProvider implements MessageProvider {
    public HelloWorldMessageProvider(){
        out.println(" --> HelloWorldMessageProvider: constructor called");
    }

    @Override
    public String getMessage() {
        return "Hello World";
    }
}
