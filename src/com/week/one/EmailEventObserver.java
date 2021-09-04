package com.week.one;

import java.io.File;

public class EmailEventObserver implements EventObserver {
    private String eventEmail;

    public EmailEventObserver(String eventEmail) {
        this.eventEmail = eventEmail;
    }

    @Override
    public void updateEvent(String eventNotificationType, File file) {
        System.out.println("Event email to " + eventEmail + ": the one performed " + eventNotificationType + " process with the following file: " + file.getName());
    }
}