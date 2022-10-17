package javacamp.thirdLessonWork.homeWork2.abstractClases;

/**
 *
 * @author seyma.deniz
 */
public abstract class GameCalculator {
    public abstract void hesapla();
    
    public final void gameOver(){
        System.out.println("Oyun Bitti");
    }
}
