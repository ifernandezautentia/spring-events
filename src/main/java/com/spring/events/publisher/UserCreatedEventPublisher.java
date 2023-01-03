package com.spring.events.publisher;

import com.spring.events.event.UserCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedEventPublisher{

    private final ApplicationEventPublisher eventPublisher;

    @Autowired
    public UserCreatedEventPublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void publishUserCreatedEvent(String nif, String name, String surname){
        eventPublisher.publishEvent(new UserCreatedEvent(nif, name, surname));
    }
}
