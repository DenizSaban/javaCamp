package javacamp.thirdLessonWork.homeWork3.business;

import javacamp.thirdLessonWork.homeWork3.entities.Courses;

import java.util.List;
import javacamp.thirdLessonWork.homeWork3.dataAcces.course.CoursesDao;
import javacamp.thirdLessonWork.homeWork3.logging.Logger;

public class CourseManager {

    private CoursesDao coursesDao;
    private List<Logger> loggers;

    public CourseManager(CoursesDao coursesDao, List<Logger> loggers) {
        this.coursesDao = coursesDao;
        this.loggers = loggers;
    }

    public void save(Courses course) throws Exception {

        List<Courses> list = coursesDao.getList();
        for (Courses courses : list) {
            if (courses.getCourseName().equals(course.getCourseName())) {
                System.out.println("kurs isimleri farklı olmalıdır");
                return;
            }
        }

        if (course.getCoursePrice() <= 0) {
            System.out.println("kurs fiyatı sıfırdan büyük olmalıdır");
            return;
        }

        coursesDao.save(course);

        for (Logger logger : loggers) {
            logger.logMessage(course.getCourseName());

        }

    }
}
