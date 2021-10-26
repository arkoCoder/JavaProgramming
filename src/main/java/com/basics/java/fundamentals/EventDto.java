package com.basics.java.fundamentals;

public class EventDto extends Event {

    public EventDto(String eventName, EventData eventData) {
        super(eventName, eventData);
    }

    @Override
    public String getEventType() {
        return null;
    }
}