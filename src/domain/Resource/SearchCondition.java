package domain.Resource;

import java.util.Date;

/**
 * Created by cqx on 16/5/11.
 */

enum OrderType{
    ORDER_BY_RELIABILITY,ORDER_BY_DATE,ORDER_BY_POINTS,ORDER_BY_DOWNLOADS,ORDER_BY_LIKES;

}

/*搜索时的限制条件*/
public class SearchCondition {

    public Date createdDateFrom;
    public Date createdDateTo;

    public ResourceType resourceType;

    /*资源结果排序方式*/
    public OrderType orderType;


    /*查找数据库中资源名包含下面字符串的或者近似的*/
    public String resourceName;

}
