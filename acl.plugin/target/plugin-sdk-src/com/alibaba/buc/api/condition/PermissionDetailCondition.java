package com.alibaba.buc.api.condition;

import com.alibaba.buc.api.param.RiskLevel;

/**
 * 封装权限查询基本参数
 * 
 * @author tongxu.ay
 */
public class PermissionDetailCondition implements Condition {

    private static final long serialVersionUID = -5352286937290162658L;

    /**
     * 应用英文名
     */
    private String            appName;

    /**
     * 权限英文名
     */
    private String            permissionName;

    /**
     * 权限中文名
     */
    private String            permissionTitle;

    /**
     * 权限风险等级
     */
    private RiskLevel         riskLevel;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionTitle() {
        return permissionTitle;
    }

    public void setPermissionTitle(String permissionTitle) {
        this.permissionTitle = permissionTitle;
    }

    public RiskLevel getRiskLevel() {
        return riskLevel;
    }
    
    public void setRiskLevel(RiskLevel riskLevel) {
        this.riskLevel = riskLevel;
    }
}
