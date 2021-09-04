package com.week.one;

import java.io.File;

public class LogEventObserver implements EventObserver {
    private File log;

    public LogEventObserver(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void updateEvent(String eventNotificationType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventNotificationType + " operation with the following file: " + file.getName());
    }
}