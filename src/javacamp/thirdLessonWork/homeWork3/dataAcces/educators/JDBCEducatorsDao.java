package javacamp.thirdLessonWork.homeWork3.dataAcces.educators;

import javacamp.thirdLessonWork.homeWork3.entities.Educators;

public class JDBCEducatorsDao implements EducatorsDao{
    @Override
    public void save(Educators educators) {
        System.out.println("eğitmenler JDBC ile veritabanına kaydedildi" );
    }
}
