package javacamp.thirdLessonWork.homework2.polimorfizmDemo;

/**
 *
 * @author seyma.deniz
 */
public class FileLogger extends BaseLogger{
    public void log(String message) {
        System.out.println("Logged to file: " +message);
    }
}