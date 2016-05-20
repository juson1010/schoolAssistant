package service;

import domain.Resource.ResourceBase;
import domain.Resource.ResourceType;
import domain.Resource.SearchCondition;
import domain.UserTable.User;
import util.PageBean;

/**
 * Created by cqx on 16/5/10.
 */
public interface ResourceService {

    boolean createResource(ResourceBase resource, ResourceType resourceType);

    /*确认有删除资源权限(资源拥有者)*/
    boolean deleteResource(ResourceBase resource, User user);

    boolean updateResource(ResourceBase resource, ResourceType resourceType);


    PageBean getResource(SearchCondition searchCondition);


}
