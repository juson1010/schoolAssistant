package service;

import domain.CallTheRol.Course;
import util.PageBean;

import java.util.List;

/**
 * Created by cqx on 16/5/10.
 */
public interface CallTheRolService {

    boolean createCourse(Course course);

    boolean updateCourse(Course course);

    boolean deleteCourse(Course course);

    Course getCourse(String courseId);


    PageBean getCoursesByuserId(String userId);
    List<Course> getAllCoursesByUserId(String userId);


}
