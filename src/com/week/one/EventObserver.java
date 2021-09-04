package com.week.one;

import java.io.File;

public interface EventObserver {
    void updateEvent(String eventType, File file);
}
