package com.alibaba.buc.api.condition;

import java.util.List;

public class UsersPermissionCondition implements Condition {

    private static final long serialVersionUID     = -7991665810766665666L;
    /**
     * 查询多个用户的权限，每次最多100个用户
     */
    private List<String>      userIds;
    /**
     * 应用英文名
     */
    private String            appName;
    /**
     * 是否包含来自组织的权限，默认包含
     */
    private Boolean           includeFromOrg       = true;
    /**
     * 是否包含来自用户组的权限，默认包含
     */
    private Boolean           includeFromUsergroup = true;

    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Boolean getIncludeFromOrg() {
        return includeFromOrg;
    }

    public void setIncludeFromOrg(Boolean includeFromOrg) {
        this.includeFromOrg = includeFromOrg;
    }

    public Boolean getIncludeFromUsergroup() {
        return includeFromUsergroup;
    }

    public void setIncludeFromUsergroup(Boolean includeFromUsergroup) {
        this.includeFromUsergroup = includeFromUsergroup;
    }

}
