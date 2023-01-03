package com.spring.events.publisher;

import com.spring.events.event.UserCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedEventPublisher{

    private final static Logger LOGGER = LoggerFactory.getLogger(UserCreatedEventPublisher.class);

    private final ApplicationEventPublisher eventPublisher;

    @Autowired
    public UserCreatedEventPublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void publishUserCreatedEvent(String nif, String name, String surname){
        UserCreatedEvent event = new UserCreatedEvent(nif, name, surname);
        LOGGER.info("Event {} published", event);
        eventPublisher.publishEvent(event);
    }
}
