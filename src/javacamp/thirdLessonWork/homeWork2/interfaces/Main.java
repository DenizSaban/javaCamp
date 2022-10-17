package javacamp.thirdLessonWork.homeWork2.interfaces;

/**
 *
 * @author seyma.deniz
 */
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();
        
    }
}
