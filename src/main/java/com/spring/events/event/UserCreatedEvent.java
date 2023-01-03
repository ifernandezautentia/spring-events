package com.spring.events.event;

import lombok.Data;

@Data
public class UserCreatedEvent {
    private final String nif;
    private final String name;
    private final String surname;
}
