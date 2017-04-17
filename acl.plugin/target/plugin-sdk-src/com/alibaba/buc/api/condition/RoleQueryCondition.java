package com.alibaba.buc.api.condition;

public class RoleQueryCondition implements Condition {

    /**
     * 
     */
    private static final long serialVersionUID = -928236810032647038L;

    private String            roleName;
    private String            roleTitle;
    private String            appName;
    
	public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getRoleTitle() {
        return roleTitle;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }
}
