package javacamp.thirdLessonWork.homeWork3.dataAcces.courseCategory;

import java.util.List;
import javacamp.thirdLessonWork.homeWork3.entities.CourseCategory;

public interface CourseCategoryDao {
    void save(CourseCategory category);
     List<CourseCategory> getList ();
}
