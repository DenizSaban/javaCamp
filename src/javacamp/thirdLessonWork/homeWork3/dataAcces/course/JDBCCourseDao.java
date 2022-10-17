package javacamp.thirdLessonWork.homeWork3.dataAcces.course;

import java.util.ArrayList;
import java.util.List;
import javacamp.thirdLessonWork.homeWork3.entities.Courses;

public class JDBCCourseDao implements CoursesDao{
    @Override
    public void save(Courses course) {
        System.out.println("kurs JDBC ile veritabanına kaydedildi" );
    }

   @Override
    public List<Courses> getList() {
        
        //veritabanından listeyi çekemediğimiz için kullandım
        List<Courses> list = new ArrayList<>();
        list.add(new Courses(1, "java eğitimi", 10));
        list.add(new Courses(5, "php eğitimi", 15));
        return list;
    
    }
}
