package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;
import service.UserServiceImpl;
import dao.UserDao;
import dao.UserDaoHibImpl;
import dao.UserInfoDao;
import dao.UserInfoDaoHibImpl;
import domain.UserTable.User;
import domain.UserTable.UserInfo;

/**
 * Created by cqx on 2016/5/18.
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    	System.out.println("username "+req.getParameter("username")+" password : "+req.getParameter("password"));	
    	UserService userService = new UserServiceImpl();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        UserDao userDao = new UserDaoHibImpl();
        User user = new User();
        user.setPassword("123");
        user.setUsername("admin01");
        userService.generateToken(user);
        UserInfo userInfo = new UserInfo();
        userInfo.setAcademy("rg");
        userInfo.setAge(22);
        userInfo.setEnrolmentDate(new Date(2013, 9, 1));
        userInfo.setInfoVisible(true);
        userInfo.setLabel("llllll哈");

        user.setUserInfo(userInfo);
//        userService.createUser(user);
//        userDao.save(user);
        UserInfoDao userInfoDao = new UserInfoDaoHibImpl();
        userInfoDao.save(userInfo);
        userService.createUser(user);
        System.out.println("done!");


    }
}
