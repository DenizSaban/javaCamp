package javacamp.thirdLessonWork.homeWork3.logging;

public class MailLogger implements Logger{

    @Override
    public void logMessage(String message) {
        System.out.println("mail atıldı loglandı : " + message);
    }
}
