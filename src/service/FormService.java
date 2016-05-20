package service;

import domain.Form.Form;
import domain.Form.FormType;
import util.PageBean;

/**
 * Created by cqx on 16/5/10.
 */
public interface FormService {

   public boolean createForm(Form form);

    public Form getForm(String formNo);

    public boolean updateForm(Form form);

    public boolean deleteForm(Form form);

    /*分页返回属于某用户的表格*/
    public  PageBean getFormsByUserId(String userId);

    /*分页返回属于某用户的表格 并且对表格类型进行限制*/
    public  PageBean getFormsByUserId(String userId, FormType type);


    /*分页返回表格名包含 formName的 所有表格*/
    public  PageBean getFormsByFormName(String formName);

    /*分页返回表格名包含 formName的 所有表格,并且对表格类型进行限制*/
    public PageBean getFormsByFormName(String formName, FormType type);


}
