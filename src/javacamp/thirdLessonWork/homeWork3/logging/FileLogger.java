package javacamp.thirdLessonWork.homeWork3.logging;

public class FileLogger implements Logger{


    @Override
    public void logMessage(String message) {
        System.out.println("dosyaya loglandı : " + message);

    }
}
