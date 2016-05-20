package domain.Questionnaire;

import domain.Resource.ResourceBase;
import domain.Unit;

import java.util.Date;
import java.util.List;


public class Questionnaire extends ResourceBase {

	/*�ʾ�����*/
	private QuestionnaireType typeofQuestionnaireType;
	
	/*��ֹ����*/
	private Date deadline;
	
	/*��Ԫ�񼯺�*/
	private List<Unit> units;

	
	public Questionnaire(){}
	
	public QuestionnaireType getType() {
		return typeofQuestionnaireType;
	}

	public void setType(QuestionnaireType type) {
		this.typeofQuestionnaireType = type;
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
