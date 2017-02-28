package com.alibaba.buc.api.condition;

public class CheckPermissionCondition extends PermissionCondition {

    private static final long serialVersionUID = 2912824020138289283L;

    private String            userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
