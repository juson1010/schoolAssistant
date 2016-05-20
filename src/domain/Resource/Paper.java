package domain.Resource;

/**
 * Created by cqx on 16/5/10.
 */

/*
* 试卷
*
* */
public class Paper extends ResourceBase {

    private String school;

    private String course;

    private String time;

    public Paper(){}

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
