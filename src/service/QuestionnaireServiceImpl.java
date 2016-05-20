package service;

import dao.QuestionnaireDao;
import domain.Questionnaire.Questionnaire;
import domain.Questionnaire.QuestionnaireType;
import util.PageBean;

/**
 * Created by cqx on 16/5/11.
 */
public class QuestionnaireServiceImpl implements QuestionnaireService {

    private QuestionnaireDao questionnaireDao;

    @Override
    public boolean createQuestionnaire(Questionnaire questionnaire) {

        questionnaireDao.save(questionnaire);

        return true;
    }

    @Override
    public Questionnaire getQuestionnaire(String questionnaireNo) {
        return null;
    }

    @Override
    public boolean updateQuestionnaire(Questionnaire questionnaire) {

        questionnaireDao.update(questionnaire);
        return true;
    }

    @Override
    public boolean deleteQuestionnaire(Questionnaire questionnaire) {

        questionnaireDao.delete(questionnaire);
        return true;
    }

    @Override
    public PageBean getQuestionnairesByUserId(String userId) {
        return null;
    }

    @Override
    public PageBean getQuestionnairesByUserId(String userId, QuestionnaireType type) {
        return null;
    }

    @Override
    public PageBean getQuestionnairesByQuestionnaireName(String questionnaireName) {
        return null;
    }

    @Override
    public PageBean getQuestionnairesByQuestionnaireName(String questionnaireName, QuestionnaireType type) {
        return null;
    }
}
