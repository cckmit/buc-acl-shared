package com.alibaba.buc.api.condition;

public class UserRoleDetailCondition implements Condition {

    private static final long serialVersionUID = -8073556048502927015L;

    /**
     * 是否右模糊
     */
    private boolean           isRightLike      = false;

    /**
     * 用户ID
     */
    private String            userId;

    /**
     * 角色英文名称, 支持右模糊查询
     */
    private String            roleName;

    /**
     * 角色中文名称, 支持右模糊查询
     */
    private String            roleTitle;

    /**
     * 应用名称
     */
    private String            appName;

    /**
     * 用户角色关系是否冻结
     */
    private Boolean           isActive;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleTitle() {
        return roleTitle;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

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

    public boolean isRightLike() {
        return isRightLike;
    }

    public void setRightLike(boolean isRightLike) {
        this.isRightLike = isRightLike;
    }

}
