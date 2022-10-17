package javacamp.thirdLessonWork.homeWork3.business;

import javacamp.thirdLessonWork.homeWork3.entities.Courses;

import java.util.List;
import javacamp.thirdLessonWork.homeWork3.dataAcces.course.CoursesDao;
import javacamp.thirdLessonWork.homeWork3.dataAcces.educators.EducatorsDao;
import javacamp.thirdLessonWork.homeWork3.entities.Educators;
import javacamp.thirdLessonWork.homeWork3.logging.Logger;

public class EducatorsManager {

    private EducatorsDao educatorsDao;
    private List<Logger> loggers;

    public EducatorsManager(EducatorsDao educatorsDao, List<Logger> loggers) {
        this.educatorsDao = educatorsDao;
        this.loggers = loggers;
    }

    public void save(Educators educators) throws Exception {

        educatorsDao.save(educators);

        for (Logger logger : loggers) {
            logger.logMessage(educators.getEducatorName());

        }

    }
}
