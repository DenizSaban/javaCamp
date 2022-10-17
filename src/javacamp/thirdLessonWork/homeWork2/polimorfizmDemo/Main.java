package javacamp.thirdLessonWork.homework2.polimorfizmDemo;

/**
 *
 * @author seyma.deniz
 */
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
