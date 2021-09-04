package com.week.one;
public class EventTriggerApp {
    public static void main(String[] args) {
        EventEditor editor = new EventEditor();
        editor.eventNotifier.subscribeEvent("open", new LogEventObserver("C:\\Users\\Rohith\\OneDrive\\Documents\\Masters\\OOP\\observable_file_test.txt"));
        editor.eventNotifier.subscribeEvent("save", new EmailEventObserver("test@test.com"));

        try {
            editor.openFile("observable_file_test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}