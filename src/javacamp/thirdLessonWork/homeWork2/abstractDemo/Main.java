package javacamp.thirdLessonWork.homeWork2.abstractDemo;

/**
 *
 * @author seyma.deniz
 */
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        customerManager.baseDatabaseManager= new OracleDatabaseManager();
        customerManager.getCustomers();
    }
}
