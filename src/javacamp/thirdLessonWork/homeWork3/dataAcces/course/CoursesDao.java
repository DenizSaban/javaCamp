package javacamp.thirdLessonWork.homeWork3.dataAcces.course;

import java.util.List;
import javacamp.thirdLessonWork.homeWork3.entities.Courses;

public interface CoursesDao {
    void save(Courses course);
    List<Courses> getList ();
}
