package javacamp.thirdLessonWork.homeWork3.dataAcces.educators;

import javacamp.thirdLessonWork.homeWork3.entities.Educators;

public class HibernateEducatorsDao implements EducatorsDao{
    @Override
    public void save(Educators educators) {
        System.out.println("eğitmen kategorisi hibernate ile kaydedildi");
    }
}
