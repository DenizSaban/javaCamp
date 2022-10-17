package javacamp.thirdLessonWork.homeWork3.business;

import javacamp.thirdLessonWork.homeWork3.entities.Courses;

import java.util.List;
import javacamp.thirdLessonWork.homeWork3.dataAcces.courseCategory.CourseCategoryDao;
import javacamp.thirdLessonWork.homeWork3.entities.CourseCategory;
import javacamp.thirdLessonWork.homeWork3.logging.Logger;

public class CourseCategoryManager {

    private CourseCategoryDao categoryDao;
    private List<Logger> loggers;

    public CourseCategoryManager(CourseCategoryDao categoryDao, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void save(CourseCategory category) throws Exception {

        List<CourseCategory> list = categoryDao.getList();
        for (CourseCategory categorys : list) {
            if (categorys.getCategoryName().equals(category.getCategoryName())) {
                System.out.println("kategori isimleri farklı olmalıdır");
                return;
            }
        }

        categoryDao.save(category);

        for (Logger logger : loggers) {
            logger.logMessage(category.getCategoryName());

        }

    }
}
