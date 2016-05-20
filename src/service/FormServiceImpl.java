package service;

import dao.FormDao;
import domain.Form.Form;
import domain.Form.FormType;
import util.PageBean;

/**
 * Created by cqx on 16/5/11.
 */
public class FormServiceImpl implements FormService {

    private FormDao formDao;

    @Override
    public boolean createForm(Form form) {

        formDao.save(form);

        return true;
    }

    @Override
    public Form getForm(String formNo) {
        return null;
    }

    @Override
    public boolean updateForm(Form form) {

        formDao.update(form);
        return true;
    }

    @Override
    public boolean deleteForm(Form form) {

        formDao.delete(form);
        return true;
    }

    @Override
    public PageBean getFormsByUserId(String userId) {
        return null;
    }

    @Override
    public PageBean getFormsByUserId(String userId, FormType type) {
        return null;
    }

    @Override
    public PageBean getFormsByFormName(String formName) {
        return null;
    }

    @Override
    public PageBean getFormsByFormName(String formName, FormType type) {
        return null;
    }
}
