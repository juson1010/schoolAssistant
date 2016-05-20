package domain.Form;

import domain.Resource.ResourceBase;
import domain.Unit;

import java.util.Date;
import java.util.List;

public class Form extends ResourceBase {

	/*�������*/
	private FormType typeOFormType;
	
	/*��ֹ����*/
	private Date deadline;
	
	/*��Ԫ�񼯺�*/
	private List<Unit> units;

	public Form(){}
	public FormType getType() {
		return typeOFormType;
	}

	public void setType(FormType type) {
		this.typeOFormType = type;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public List<Unit> getUnits() {
		return units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}
		
	
	
}
