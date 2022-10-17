package javacamp.thirdLessonWork.homeWork2.abstractDemo;

/**
 *
 * @author seyma.deniz
 */
public class CustomerManager {
    
    BaseDatabaseManager baseDatabaseManager;
    
    public void getCustomers() {
       baseDatabaseManager.getData();
    }

}
