package javacamp.thirdLessonWork.homeWork3.dataAcces.courseCategory;

import java.util.ArrayList;
import java.util.List;
import javacamp.thirdLessonWork.homeWork3.entities.CourseCategory;

public class HibernateCourseCategoryDao implements CourseCategoryDao{
    @Override
    public void save(CourseCategory courseCategory) {
        System.out.println("kurs kategorisi hibernate ile kaydedildi");
    }

    @Override
    public List<CourseCategory> getList() {
       
        List<CourseCategory> list = new ArrayList<>();
        list.add(new CourseCategory("software"));
        list.add(new CourseCategory("database"));
        return list;
    
    }
    
    
    }
  
