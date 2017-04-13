package com.alibaba.buc.api.condition;


/**
 * 类UserRolePermissionCondition.java的实现描述：TODO 类实现描述
 * 
 * @author tongxu.ay 2014-1-9 下午12:51:46
 */
public class UserOperationCondition implements Condition {

    private static final long serialVersionUID = -7991665810754465666L;

    private String            userId;

    private String            operationName;

    private String            appName;                                 // 限定应用英文名

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

}
