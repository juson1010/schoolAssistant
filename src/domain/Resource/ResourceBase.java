package domain.Resource;

import domain.Comment;
import domain.UserTable.User;

import java.util.List;


public class ResourceBase {
	
	/*��Դ���*/
	private String id;
	
	private String filename;

	private String createTime;
	
	/*��Դ����*/
	private ResourceType typeOfResourceType;
	
	/*������֤��Դ�Ƿ��ظ�*/
	private String md5;
	
	/*����*/
	private Integer points;
	
	/*���ش���*/
	private Integer downloads;
	
	/*�ļ���С*/
	private double fileSize;
	
	/*���Ŷ�*/
	private Integer reliability;
	
	/*������*/
	private Integer like;
	
	/*����*/
	private Integer dislike;
	
	/*����*/
	private List<Comment> comments;

	private User creator;
	
	/*���*/
	private String description;

	/*资源所在链接*/
	private String url;
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}


	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getDownloads() {
		return downloads;
	}

	public void setDownloads(Integer downloads) {
		this.downloads = downloads;
	}

	public double getFileSize() {
		return fileSize;
	}

	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}

	public Integer getReliability() {
		return reliability;
	}

	public void setReliability(Integer reliability) {
		this.reliability = reliability;
	}

	public Integer getLike() {
		return like;
	}

	public void setLike(Integer like) {
		this.like = like;
	}

	public Integer getDislike() {
		return dislike;
	}

	public void setDislike(Integer dislike) {
		this.dislike = dislike;
	}

	

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ResourceType getTypeOfResourceType() {
		return typeOfResourceType;
	}

	public void setTypeOfResourceType(ResourceType typeOfResourceType) {
		this.typeOfResourceType = typeOfResourceType;
	}


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
