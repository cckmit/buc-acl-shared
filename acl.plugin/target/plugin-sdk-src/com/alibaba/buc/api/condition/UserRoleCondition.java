package com.alibaba.buc.api.condition;

import java.util.List;

public class UserRoleCondition implements Condition {

    private static final long serialVersionUID = -7991665810766665666L;

    private String            userId;
    private List<String>      appNames;                                // 限定应用英文名

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getAppNames() {
        return appNames;
    }

    public void setAppNames(List<String> appNames) {
        this.appNames = appNames;
    }

}
