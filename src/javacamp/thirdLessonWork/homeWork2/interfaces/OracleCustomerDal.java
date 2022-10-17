package javacamp.thirdLessonWork.homeWork2.interfaces;

/**
 *
 * @author seyma.deniz
 */
public class OracleCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("Oracle ile eklendi.");
    }
    
}
