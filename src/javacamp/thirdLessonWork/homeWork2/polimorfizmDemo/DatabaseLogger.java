package javacamp.thirdLessonWork.homework2.polimorfizmDemo;

/**
 *
 * @author seyma.deniz
 */
public class DatabaseLogger extends BaseLogger{
    public void log(String message) {
        System.out.println("Logged to database: " +message);
    }
}
