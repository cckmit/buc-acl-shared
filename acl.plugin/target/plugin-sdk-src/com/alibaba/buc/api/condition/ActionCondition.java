package com.alibaba.buc.api.condition;

import java.util.ArrayList;
import java.util.List;

public class ActionCondition extends BaseActionCondition {

    private static final long serialVersionUID = -7545505064705424422L;

    private String            appName;

    private String            userId;

    private List<String>      patterns         = new ArrayList<String>();

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getPatterns() {
        return patterns;
    }

    public void setPatterns(List<String> patterns) {
        this.patterns = patterns;
    }

}
