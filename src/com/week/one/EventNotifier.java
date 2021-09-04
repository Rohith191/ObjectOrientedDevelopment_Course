package com.week.one;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventNotifier {
    Map<String, List<EventObserver>> eventAccepters = new HashMap<>();

    public EventNotifier(String... operations) {
        for (String operation : operations) {
            this.eventAccepters.put(operation, new ArrayList<>());
        }
    }

    public void subscribeEvent(String eventType, EventObserver eventAccepter) {
        List<EventObserver> users = eventAccepters.get(eventType);
        users.add(eventAccepter);
    }

    public void unsubscribeEvent(String eventType, EventObserver eventyAccepter) {
        List<EventObserver> eventers = eventAccepters.get(eventType);
        eventers.remove(eventyAccepter);
    }

    public void notifyEventsToSubscribers(String organoizedEventType, File file) {
        List<EventObserver> events = eventAccepters.get(organoizedEventType);
        for (EventObserver accepter : events) {
            accepter.updateEvent(organoizedEventType, file);
        }
    }
}