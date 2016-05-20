package domain.UserTable;

import javax.persistence.*;

import java.util.Date;



@Entity
@Table(name="UserInfo")
public class UserInfo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="userInfo_id")
    private Integer id;


    @Column(name="name")
    private String name;


 //   @Enumerated(EnumType.ORDINAL)
    @Column(name="sex")
    private String sex;

    @Column(name="age")
    private Integer age;

    /*入学时间*/
    @Column(name="enrolmentDate")
    private Date enrolmentDate;

    /*学号,学工号等*/
    @Column(name="snoId")
    private String snoId;

    /*个人标签*/
    @Column(name="label")
    private String label;

    @Column(name="school")
    private String school;

    @Column(name="academy")
    private String academy;

    @Column(name="nickname")
    private String nickname;

    /*信息可见*/
    @Column(name="infoVisible")
    private boolean infoVisible;

    public UserInfo(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//
//
//    public SexType getSex() {
//		return sex;
//	}
//
//	public void setSex(SexType sex) {
//		this.sex = sex;
//	}

    
	public Integer getAge() {
        return age;
    }

    public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAge(Integer age) {
        this.age = age;
    }

    public Date getEnrolmentDate() {
        return enrolmentDate;
    }

    public void setEnrolmentDate(Date enrolmentDate) {
        this.enrolmentDate = enrolmentDate;
    }

    public String getSnoId() {
        return snoId;
    }

    public void setSnoId(String snoId) {
        this.snoId = snoId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isInfoVisible() {
        return infoVisible;
    }

    public void setInfoVisible(boolean infoVisible) {
        this.infoVisible = infoVisible;
    }
}
