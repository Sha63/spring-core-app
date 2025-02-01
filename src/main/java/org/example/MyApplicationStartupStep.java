package org.example;

import org.springframework.core.metrics.StartupStep;

import java.util.Collections;
import java.util.Iterator;
import java.util.function.Supplier;

public class MyApplicationStartupStep implements StartupStep {
    private String name;
    private long id;

    private final MyTags TAGS = new MyTags();

    public MyApplicationStartupStep(String name, long id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public Long getParentId() {
        return null;
    }

    @Override
    public StartupStep tag(String key, String value) {
        return this;
    }

    @Override
    public StartupStep tag(String key, Supplier<String> value) {
        return this;
    }

    @Override
    public Tags getTags() {
        return TAGS;
    }

    @Override
    public void end() {
        System.out.println(name + " step has ended!!");
    }

    static class MyTags implements StartupStep.Tags {

        @Override
        public Iterator<Tag> iterator() {
            return Collections.emptyIterator();
        }
    }
}
