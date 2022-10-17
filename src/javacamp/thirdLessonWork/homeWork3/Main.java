package javacamp.thirdLessonWork.homeWork3;

import javacamp.thirdLessonWork.homeWork3.business.CourseManager;
import javacamp.thirdLessonWork.homeWork3.dataAcces.course.HibernateCourseDao;
import javacamp.thirdLessonWork.homeWork3.entities.Courses;
import javacamp.thirdLessonWork.homeWork3.entities.Educators;
import javacamp.thirdLessonWork.homeWork3.logging.FileLogger;
import javacamp.thirdLessonWork.homeWork3.logging.DatabaseLogger;
import javacamp.thirdLessonWork.homeWork3.logging.MailLogger;

import java.util.*;
import javacamp.thirdLessonWork.homeWork3.business.CourseCategoryManager;
import javacamp.thirdLessonWork.homeWork3.business.EducatorsManager;
import javacamp.thirdLessonWork.homeWork3.dataAcces.course.JDBCCourseDao;
import javacamp.thirdLessonWork.homeWork3.dataAcces.courseCategory.HibernateCourseCategoryDao;
import javacamp.thirdLessonWork.homeWork3.dataAcces.courseCategory.JDBCCourseCategoryDao;
import javacamp.thirdLessonWork.homeWork3.dataAcces.educators.HibernateEducatorsDao;
import javacamp.thirdLessonWork.homeWork3.dataAcces.educators.JDBCEducatorsDao;
import javacamp.thirdLessonWork.homeWork3.entities.CourseCategory;
import javacamp.thirdLessonWork.homeWork3.logging.Logger;

public class Main {
    public static void main(String[] args) throws Exception {


        
        Educators educator1 = new Educators(1, "Ergün");
        Educators educator2 = new Educators(2, "Şeyma");

        Courses course1 = new Courses(1, "java eğitimi", 10);
        Courses course2 = new Courses(2,"c eğitimi", 0);
        Courses course3 = new Courses(3,"c eğitimi", 36);


        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());
        
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.save(course1);
        courseManager.save(course2);
        courseManager.save(course3);
        
        courseManager=new CourseManager(new JDBCCourseDao(), loggers);
        courseManager.save(course1);
        courseManager.save(course2);
        courseManager.save(course3);
        
        
        CourseCategory category1= new CourseCategory("software");
        CourseCategory category2= new CourseCategory("yazılım");
        CourseCategory category3= new CourseCategory("donanım");
        
        CourseCategoryManager categoryManager=new CourseCategoryManager(new JDBCCourseCategoryDao(), loggers);
        categoryManager.save(category1);
        categoryManager.save(category2);
        categoryManager.save(category3);
        
        categoryManager=new CourseCategoryManager(new HibernateCourseCategoryDao(), loggers);
        categoryManager.save(category1);
        categoryManager.save(category2);
        categoryManager.save(category3);
        
        
        EducatorsManager educatorsManager= new EducatorsManager(new JDBCEducatorsDao(), loggers);
        educatorsManager.save(educator1);
        educatorsManager.save(educator2);
        
        educatorsManager= new EducatorsManager(new HibernateEducatorsDao(), loggers);
        educatorsManager.save(educator1);
        educatorsManager.save(educator2);
    }
}
