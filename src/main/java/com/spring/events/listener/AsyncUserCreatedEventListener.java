package com.spring.events.listener;

import com.spring.events.event.UserCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncUserCreatedEventListener {

    private final static Logger LOGGER = LoggerFactory.getLogger(AsyncUserCreatedEventListener.class);

    @Async
    @EventListener
    public void handleUserCreatedEvent(UserCreatedEvent event){
        //do stuff with repositories and other third parties
        LOGGER.info("Event received when a user with NIF = {} has been created", event.getNif());
    }
}
