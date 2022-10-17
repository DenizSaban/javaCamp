package javacamp.thirdLessonWork.homeWork2.interfaces;

/**
 *
 * @author seyma.deniz
 */
public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal=customerDal;
    }

    public void add() {
        customerDal.add();
    }
}
