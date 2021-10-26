package com.basics.java.fundamentals;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Base class which contains Event details. Every event class has a Name and
 * EventData against which the event is generated.
 *
 * @author Anshu Gupta
 * @since 1.0
 */
@JsonDeserialize(as = App.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Event {

    private String eventName;

    private EventData eventData;

    /**
     * Return Event type of class implementing this class [this is require for
     * event feature toggle]
     *
     * @return
     */
    public abstract String getEventType();

    public Event(String eventName, EventData eventData) {
        super();
        this.eventName = eventName;
        this.eventData = eventData;
    }

    public String getEventName() {
        return eventName;
    }

    public Event() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public EventData getEventData() {
        return eventData;
    }

    public void setEventData(EventData eventData) {
        this.eventData = eventData;
    }

    @Override
    public String toString() {
        return "Event [eventName=" + eventName + ", eventData="
                + eventData.toString() + "]";
    }
}
