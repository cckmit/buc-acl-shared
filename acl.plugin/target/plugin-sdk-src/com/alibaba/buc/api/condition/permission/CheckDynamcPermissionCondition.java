package com.alibaba.buc.api.condition.permission;

import java.util.List;

import com.alibaba.buc.api.condition.Condition;

/**
 * 动态权限校验条件
 * @author huihua.zhh 2014-5-14 下午3:29:06
 */
public class CheckDynamcPermissionCondition implements Condition{

    private static final long serialVersionUID = 2112556419119780077L;

    /**
     * 需要校验用户的id，必填项。
     */
    private String userId;
    
    /**
     * 动态权限查询条件列表，一次最多查询20个。
     * 
     * <ul>
     * <li>动态查询条件 = 资源条件(ResourceCondition) + 操作条件(OperationCondition)</li>
     * <ul>
     * <li>资源条件(ResourceCondition)：</li>
     * <ul>
     * <li>资源名(resource)，必填项。</li>
     * <li>资源类型(resourceType)，可选项。</li>
     * <li>父资源条件(ResourceCondition)，可选项，最多传5层。</li>
     * </ul>
     * <li>操作条件(OperationCondition)：</li>
     * <ul>
     * <li>操作名称(operationName),必填项。</li>
     * </ul>
     * </ul></ul>
     * @return 返回Map<DynamicPermissionCondition, CheckPermissionResultModel>
     * <ul>
     * <li>key为入参时的动态查询条件</li>
     * <li>value为CheckPermissionResultModel</li>
     * <ul>
     * <li>accessible即表示是否有权限。</li>
     * </ul>
     * </ul>
     */
    private List<DynamicPermissionCondition> permissionConditionList;

    
    public String getUserId() {
        return userId;
    }

    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    
    public List<DynamicPermissionCondition> getPermissionConditionList() {
        return permissionConditionList;
    }

    
    public void setPermissionConditionList(List<DynamicPermissionCondition> permissionConditionList) {
        this.permissionConditionList = permissionConditionList;
    }
}
