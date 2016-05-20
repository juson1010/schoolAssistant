package service;

import dao.*;
import domain.Form.Form;
import domain.Questionnaire.Questionnaire;
import domain.Resource.*;
import domain.UserTable.User;
import util.PageBean;

/**
 * Created by cqx on 16/5/11.
 */
public class ResourceServiceImpl implements ResourceService {

    private FormDao formDao;
    private QuestionnaireDao questionnaireDao;
    private EBookDao eBookDao;
    private PaperDao paperDao;
    private CoursewareDao coursewareDao;



    @Override
    public boolean createResource(ResourceBase resource, ResourceType resourceType) {

        switch (resourceType){

            case ResourceType_COURSEWARE:

                coursewareDao.save((Courseware) resource);
                break;
            case ResourceType_EBOOK:

                eBookDao.save((EBook) resource);
                break;
            case ResourceType_FORM:

                formDao.save((Form) resource);
                break;
            case ResourceType_QUESTIONNAIRE:

                questionnaireDao.save((Questionnaire) resource);
                break;
        }
        return true;

    }


    /*
    * 查询资源是否由用户创建
    *
    * */
    @Override
    public boolean deleteResource(ResourceBase resource, User user) {

        ResourceType type = resource.getTypeOfResourceType();
        User creator = resource.getCreator();
        if (creator.getId() != user.getId()) return false;
        switch (type){

            case ResourceType_COURSEWARE:
                coursewareDao.delete((Courseware) resource);
                break;
            case ResourceType_EBOOK:

                eBookDao.delete((EBook) resource);
                break;
            case ResourceType_FORM:

                formDao.delete((Form) resource);
                break;
            case ResourceType_QUESTIONNAIRE:

                questionnaireDao.delete((Questionnaire) resource);
                break;
        }
        return true;

    }

    @Override
    public boolean updateResource(ResourceBase resource, ResourceType resourceType) {


        switch (resourceType){

            case ResourceType_COURSEWARE:

                coursewareDao.update((Courseware) resource);
                break;
            case ResourceType_EBOOK:

                eBookDao.update((EBook) resource);
                break;
            case ResourceType_FORM:

                formDao.update((Form) resource);
                break;
            case ResourceType_QUESTIONNAIRE:

                questionnaireDao.update((Questionnaire) resource);
                break;
        }
        return true;
    }

    @Override
    public PageBean getResource(SearchCondition searchCondition) {
        /*补充 */

        return null;
    }


    public FormDao getFormDao() {
        return formDao;
    }

    public void setFormDao(FormDao formDao) {
        this.formDao = formDao;
    }

    public QuestionnaireDao getQuestionnaireDao() {
        return questionnaireDao;
    }

    public void setQuestionnaireDao(QuestionnaireDao questionnaireDao) {
        this.questionnaireDao = questionnaireDao;
    }

    public EBookDao geteBookDao() {
        return eBookDao;
    }

    public void seteBookDao(EBookDao eBookDao) {
        this.eBookDao = eBookDao;
    }

    public PaperDao getPaperDao() {
        return paperDao;
    }

    public void setPaperDao(PaperDao paperDao) {
        this.paperDao = paperDao;
    }
}
