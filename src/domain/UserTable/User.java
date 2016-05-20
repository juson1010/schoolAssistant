package domain.UserTable;



import javax.persistence.*;

import org.hibernate.annotations.Cascade;

import java.util.Date;


@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="salt")
    private String salt;

    @Column(name="token")
    private String token;

    @OneToOne(targetEntity=UserInfo.class)
    @JoinTable(name="user_userInfo",
    		joinColumns = @JoinColumn(name="user_id",referencedColumnName="user_id",unique=true),
    		inverseJoinColumns=@JoinColumn(name="userInfo_id",referencedColumnName="userInfo_id"))
    private UserInfo userInfo;

    /*token 有效日期*/
    @Column(name="tokenExpDate")
    private Date tokenExpDate;

    public User(){}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getSalt() {
        return salt;
    }


    public void setSalt(String salt) {
        this.salt = salt;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }



//
    public Date getTokenExpDate() {
        return tokenExpDate;
    }


    public void setTokenExpDate(Date tokenExpDate) {
        this.tokenExpDate = tokenExpDate;
    }


    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
