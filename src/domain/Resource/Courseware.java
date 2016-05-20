package domain.Resource;

public class Courseware extends ResourceBase {

    /*课程 行业*/
    private String course;

    /*可选 */
    private String author;

    /*课件时间\可选*/
    private String time;


    public Courseware(){}

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
