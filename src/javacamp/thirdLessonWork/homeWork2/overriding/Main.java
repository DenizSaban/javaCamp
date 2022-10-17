package javacamp.thirdLessonWork.homework2.overriding;

/**
 *
 * @author seyma.deniz
 */

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<BaseKrediManager> baseKrediManagers=new ArrayList<>();
        baseKrediManagers.add(new OgretmenKrediManager());
        baseKrediManagers.add(new TarimKrediManager());
        
        for (BaseKrediManager baseKrediManager : baseKrediManagers) {
            System.out.println(baseKrediManager.hesapla(1000));
        }
    }
}
