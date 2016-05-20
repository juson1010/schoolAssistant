package service;


import dao.UserDao;
import dao.UserDaoHibImpl;
import dao.UserInfoDao;
import dao.UserInfoDaoHibImpl;
import domain.UserTable.User;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import util.PageBean;

import java.util.Date;
import java.util.List;

/**
 * Created by cqx on 16/5/11.
 */
public class UserServiceImpl implements UserService {

  //  private ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    private UserDao userDao ;// ctx.getBean("userDao", UserDaoHibImpl.class) ;



    public boolean createUser(User user) {

    	System.out.println("userDao is "+(userDao==null)+" userInfoDao is ");
    	if (userDao == null) {
    		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    		 userDao = ctx.getBean("userDao",UserDaoHibImpl.class);
			
		}
    	
        System.out.println("null ? "+(userDao == null));
        userDao.save(user); 
        return true;
    }


    public boolean updateUser(User user) {

        userDao.update(user);
        return true;
    }


    public boolean deleteUser(User user) {

        userDao.delete(user);
        return true;
    }


    public User getUser(String userId) {
        return null;
    }



    public List getAllUsers(String school, String academy) {
        return null;
    }


    public List getUsers(String hql) {
        return null;
    }


    public PageBean getAllUsersByPage() {
        return null;
    }

    public void generateToken(User user) {
        user.setToken(RandomStringUtils.randomAlphanumeric(64));
        user.setTokenExpDate(DateUtils.addDays(new Date(), 30));
    }
    public boolean verifyPassword(User user, String password) {

        String hashedPassword = DigestUtils.md5Hex(password + user.getSalt());
        if (hashedPassword.equals(user.getPassword())) {
            return true;
        }
        return false;
    }

    public  void refreshToken(User user) {
        if (user != null && (user.getTokenExpDate() == null || user.getTokenExpDate().compareTo(new Date()) < 0)) {
            generateToken(user);
            userDao.update(user);
        }
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


//	public UserInfoDao getUserInfoDao() {
//		return userInfoDao;
//	}
//
//
//	public void setUserInfoDao(UserInfoDao userInfoDao) {
//		this.userInfoDao = userInfoDao;
//	}
//    
    
}

