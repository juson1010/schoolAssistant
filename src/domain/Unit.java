
package domain;

enum UnitType{
	UnitType_OPTIONAL,UnitType_REQUIRED
}

public class Unit {
	
	/**/
	private Integer index;
	
	/*��Ԫ���ͣ�ѡ��|����*/
	private UnitType type;
	/*��Ԫ����*/
	private String content;
	
	/*��ʽ�޶���������ʽ����web������*/
	private String regEx;

	
	
	
	
	public Unit(){
		
	}
	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	
	public UnitType getType() {
		return type;
	}
	public void setType(UnitType type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegEx() {
		return regEx;
	}

	public void setRegEx(String regEx) {
		this.regEx = regEx;
	}
	
	

}
