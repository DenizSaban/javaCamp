package javacamp.thirdLessonWork.homeWork3.logging;

import java.util.List;

public class DatabaseLogger implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("veritabanına loglandı : " + message);
    }
}
