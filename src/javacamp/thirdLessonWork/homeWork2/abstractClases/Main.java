package javacamp.thirdLessonWork.homeWork2.abstractClases;

/**
 *
 * @author seyma.deniz
 */
public class Main {

    public static void main(String[] args) {
        WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
        womenGameCalculator.hesapla();
        womenGameCalculator.gameOver();

        GameCalculator gameCalculator = new WomenGameCalculator();
    }
}
