package test;

import domain.CallTheRol.Course;
import domain.UserTable.User;
import service.CallTheRolService;
import service.CallTheRolServiceImpl;
import service.UserService;
import service.UserServiceImpl;

import java.util.List;

/**
 * Created by cqx on 16/5/12.
 */
public class CallTheRollTest {

    public static void main(String[] args){

        UserService userService = new UserServiceImpl();

        String hql = "";
        List<User> users = userService.getUsers(hql);
        Course course = new Course();
        course.setClassRoom("D2-202");
        CallTheRolService callTheRolService = new CallTheRolServiceImpl();

        callTheRolService.createCourse(course);

        callTheRolService.updateCourse(course);
        callTheRolService.deleteCourse(course);


    }
}
