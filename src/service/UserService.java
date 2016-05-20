package service;



import domain.UserTable.User;
import util.PageBean;

import java.util.List;

/**
 * Created by cqx on 16/5/10.
 */
public interface UserService {

    public boolean createUser(User user);

    public boolean updateUser(User user);

    public boolean deleteUser(User user);

    public User getUser(String userId);

    public List getAllUsers(String school, String academy);
    public List getUsers(String hql);

    public PageBean getAllUsersByPage();
    public void generateToken(User user) ;
    public boolean verifyPassword(User user, String password) ;
    public  void refreshToken(User user) ;

}
