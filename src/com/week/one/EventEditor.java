package com.week.one;

import java.io.File;

public class EventEditor {
    public EventNotifier eventNotifier;
    private File file;

    public EventEditor() {
        this.eventNotifier = new EventNotifier("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        eventNotifier.notifyEventsToSubscribers("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            eventNotifier.notifyEventsToSubscribers("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}