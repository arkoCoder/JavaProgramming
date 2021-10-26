package com.basics.java.fundamentals;

import java.util.Collection;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSetter;


/**
 * This class represent event data/payload and its context for publishing event
 * @author Anshu Gupta
 * @since 1.0
 */
public class EventData {

    private Context context;
    @JsonInclude(Include.NON_NULL)
    private Map<Object,Object> event;
    private Collection<?> data;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Collection<?> getData() {
        return data;
    }

    public void setData(Collection<?> data) {
        this.data = data;
    }

    @JsonSetter("Records")
    public void setRecords(Collection<?> data) {
        this.data = data;
    }

    public Map<Object, Object> getEvent() {
        return event;
    }

    public void setEvent(Map<Object, Object> event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "EventData [context=" + context + ", event=" + event + ", data="
                + data + "]";
    }

}
