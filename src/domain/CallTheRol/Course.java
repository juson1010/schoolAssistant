package domain.CallTheRol;

import domain.UserTable.User;

import java.util.List;

public class Course {

    /*课程编号*/
    private String id;

    private User teacher;

    private List<User> students;

    /*教室*/
    private String classRoom;

    /*学生历史出勤情况*/
    private List<AttendanceSheet> historyAttendanceSheet;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public List<AttendanceSheet> getHistoryAttendanceSheet() {
        return historyAttendanceSheet;
    }

    public void setHistoryAttendanceSheet(List<AttendanceSheet> historyAttendanceSheet) {
        this.historyAttendanceSheet = historyAttendanceSheet;
    }
}
