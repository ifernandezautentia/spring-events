package com.spring.events.listener;

import com.spring.events.event.UserCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedEventListener {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserCreatedEventListener.class);

    @EventListener
    public void handleUserCreatedEvent(UserCreatedEvent event){
        //do stuff with repositories and other third parties
        LOGGER.info("Event received when a user with NIF = {} has been created", event.getNif());
    }
}
