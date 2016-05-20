package service;


import domain.Questionnaire.Questionnaire;
import domain.Questionnaire.QuestionnaireType;
import util.PageBean;

/**
 * Created by cqx on 16/5/10.
 */
public interface QuestionnaireService {

    boolean createQuestionnaire(Questionnaire questionnaire);

    Questionnaire getQuestionnaire(String questionnaireNo);

    boolean updateQuestionnaire(Questionnaire questionnaire);

    boolean deleteQuestionnaire(Questionnaire questionnaire);

    /*分页返回属于某用户的问卷*/
    PageBean getQuestionnairesByUserId(String userId);

    /*分页返回属于某用户的表格 并且对表格类型进行限制*/
    PageBean getQuestionnairesByUserId(String userId, QuestionnaireType type);

    /*分页返回问卷名包含 questionnaireName的 所有问卷*/
    PageBean getQuestionnairesByQuestionnaireName(String questionnaireName);

    /*分页返回问卷名包含 questionnaireName的 所有问卷,并且对问卷类型进行限制*/
    PageBean getQuestionnairesByQuestionnaireName(String questionnaireName, QuestionnaireType type);




}
