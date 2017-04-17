package com.alibaba.buc.api.condition;

import com.alibaba.buc.api.param.RiskLevel;

/**
 * @author tongxu.ay
 */
public class UserPermissionDetailCondition implements Condition {

    private static final long serialVersionUID = -7991665810766665666L;

    /**
     * 是否右模糊
     */
    private boolean           isRightLike      = false;

    /**
     * 用户id
     */
    private String            userId;

    /**
     * 权限中文名字 支持模糊查询
     */
    private String            permissionTitle;

    /**
     * 权限英文名字 支持模糊查询
     */
    private String            permissionName;

    /**
     * 权限风险等级。
     */
    private RiskLevel         riskLevel;

    /**
     * 用户权限关系是否冻结
     */
    private Boolean           isActive;

    /**
     * 应用英文名
     */
    private String            appName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPermissionTitle() {
        return permissionTitle;
    }

    public void setPermissionTitle(String permissionTitle) {
        this.permissionTitle = permissionTitle;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(RiskLevel riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isRightLike() {
        return isRightLike;
    }

    public void setRightLike(boolean isRightLike) {
        this.isRightLike = isRightLike;
    }

}
