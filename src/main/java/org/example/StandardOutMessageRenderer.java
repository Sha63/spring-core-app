package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.lang.System.out;

@Service
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;
    public StandardOutMessageRenderer(){
        out.println(" --> StandardOutMessageRenderer: constructor called");
    }
    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        }
        out.println(messageProvider.getMessage());
    }
    @Autowired
    @Override
    public void setMessageProvider(MessageProvider provider) {
        out.println(" --> StandardOutMessageRenderer: setting the provider");
        this.messageProvider = provider;
    }
    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
