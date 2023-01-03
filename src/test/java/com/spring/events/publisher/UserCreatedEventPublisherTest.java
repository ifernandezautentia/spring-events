package com.spring.events.publisher;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserCreatedEventPublisherTest {

    @Autowired
    private UserCreatedEventPublisher publisher;

    @Test
    void shouldPublicAnEvent(){
        publisher.publishUserCreatedEvent("45673451A", "Ismael", "Fernandez");
    }

}