package domain.CallTheRol;

import domain.UserTable.User;

import java.util.Date;
import java.util.List;

/**
 * Created by cqx on 16/5/10.
 */


class UserAttendance{


    private User user;

    /*到达时间*/
    private Date arriveDate;

}

/*出勤表
* UserAttendance 记录了每个用户到达时间,通过与deadlineDate比较可以得出迟到\未到的学生
*
* 超过lateDate 未到 nonArrivalDate 的算作 迟到
* */
public class AttendanceSheet {

    /*此次点名已到截止时间*/
    private Date lateDate;

    /*此次点名未到截止时间*/
    private Date nonArrivalDate;

    private List<UserAttendance> users;


}
