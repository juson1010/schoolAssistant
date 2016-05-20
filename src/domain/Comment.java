package domain;

import java.util.Date;

import domain.UserTable.User;


public class Comment {

	/*��Դ���-�ڼ�������*/
	private String id;

	/*评论者*/
	private User user;
	/*��������*/
	private Date commentDate;
	
	/*��������*/
	private String commentBody;

	
	public Comment(){}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public String getCommentBody() {
		return commentBody;
	}

	public void setCommentBody(String commentBody) {
		this.commentBody = commentBody;
	}
	
	
	
}
