package com.alibaba.buc.acl.api.output.permission;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclResult;

public class PermissionResult extends AclResult {

    private static final long serialVersionUID = -5968254945371024964L;

    private String permissionName; // 权限英文名称 //如果此值为null,可以认为返回结果为null

    private String permissionTitle; // 权限中文标题

    private String riskLevel; // 风险等级

    private String maxExpireDate; // 最长申请天数

    private List<Integer> permissionOwnerIdList; // 权限ownerId列表

    private Boolean isAnonymous; // 授权生效方式

    private String permissionFeature; // 权限分类

    private String permissionInfo; // 功能效果

    private String permissionDescription; // 适用场景

    private String path; // 操作路径

    private String riskThreshold; // 风险阈值

    private String riskPlan; // 风控方案

    private Boolean isActive; // 权限状态

    private String revokeRule; // 权限回收策略

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

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getMaxExpireDate() {
        return maxExpireDate;
    }

    public void setMaxExpireDate(String maxExpireDate) {
        this.maxExpireDate = maxExpireDate;
    }

    public List<Integer> getPermissionOwnerIdList() {
        return permissionOwnerIdList;
    }

    public void setPermissionOwnerIdList(List<Integer> permissionOwnerIdList) {
        this.permissionOwnerIdList = permissionOwnerIdList;
    }

    public Boolean getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public String getPermissionFeature() {
        return permissionFeature;
    }

    public void setPermissionFeature(String permissionFeature) {
        this.permissionFeature = permissionFeature;
    }

    public String getPermissionInfo() {
        return permissionInfo;
    }

    public void setPermissionInfo(String permissionInfo) {
        this.permissionInfo = permissionInfo;
    }

    public String getPermissionDescription() {
        return permissionDescription;
    }

    public void setPermissionDescription(String permissionDescription) {
        this.permissionDescription = permissionDescription;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRiskThreshold() {
        return riskThreshold;
    }

    public void setRiskThreshold(String riskThreshold) {
        this.riskThreshold = riskThreshold;
    }

    public String getRiskPlan() {
        return riskPlan;
    }

    public void setRiskPlan(String riskPlan) {
        this.riskPlan = riskPlan;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getRevokeRule() {
        return revokeRule;
    }

    public void setRevokeRule(String revokeRule) {
        this.revokeRule = revokeRule;
    }

}
