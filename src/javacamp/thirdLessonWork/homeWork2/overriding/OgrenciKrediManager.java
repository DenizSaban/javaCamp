package javacamp.thirdLessonWork.homework2.overriding;

/**
 *
 * @author seyma.deniz
 */
public class OgrenciKrediManager extends BaseKrediManager {

    @Override
    public double hesapla(double tutar) {
        return tutar * 1.1;
    }

}
