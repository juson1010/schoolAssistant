package service;

import dao.CourseDao;
import domain.CallTheRol.Course;
import util.PageBean;

import java.util.List;

/**
 * Created by cqx on 16/5/11.
 */
public class CallTheRolServiceImpl implements CallTheRolService {

    private CourseDao courseDao;

    @Override
    public boolean createCourse(Course course) {

        courseDao.save(course);
        return true;
    }

    @Override
    public boolean updateCourse(Course course) {

        courseDao.update(course);
        return true;
    }

    @Override
    public boolean deleteCourse(Course course) {
        courseDao.delete(course);
        return true;
    }

    @Override
    public Course getCourse(String courseId) {
        return null;
    }

    @Override
    public PageBean getCoursesByuserId(String userId) {
        return null;
    }

    @Override
    public List<Course> getAllCoursesByUserId(String userId) {
        return null;
    }
}
