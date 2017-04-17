package com.alibaba.buc.api.param;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class UsergroupUserParam implements Serializable {

    private static final long serialVersionUID = 8578645148260804902L;

    private String            usergroupName;

    private List<String>      userIds;

    private String            reason; // 理由

    public String getUsergroupName() {
        return usergroupName;
    }

    public void setUsergroupName(String usergroupName) {
        this.usergroupName = usergroupName;
    }

    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
