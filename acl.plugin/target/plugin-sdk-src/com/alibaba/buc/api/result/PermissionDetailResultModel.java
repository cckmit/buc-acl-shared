package com.alibaba.buc.api.result;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.alibaba.buc.api.param.PermissionFromType;

public class PermissionDetailResultModel implements ResultModel {

    /**
     * 
     */
    private static final long  serialVersionUID = -8094410574263840867L;

    private String             permissionId;

    private String             permissionName;

    private String             permissionCode;

    private String             permissionDesc;

    private String             permissionOwnerId;

    private PermissionFromType permissionFromType;

    private String             permissionFromId;

    private String             permissionFromName;

    private String             appId;

    private String             appName;

    private String             riskLevel;

    private Date               expireDate;

    private Date               grantDate;

    public List<String> getManageDomains() {
        return manageDomains;
    }

    public void setManageDomains(List<String> manageDomains) {
        this.manageDomains = manageDomains;
    }

    private List<String> manageDomains = new ArrayList<String>();

    public Date getGrantDate() {
        return grantDate;
    }

    public void setGrantDate(Date grantDate) {
        this.grantDate = grantDate;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionDesc() {
        return permissionDesc;
    }

    public void setPermissionDesc(String permissionDesc) {
        this.permissionDesc = permissionDesc;
    }

    public PermissionFromType getPermissionFromType() {
        return permissionFromType;
    }

    public void setPermissionFromType(PermissionFromType permissionFromType) {
        this.permissionFromType = permissionFromType;
    }

    public String getPermissionOwnerId() {
        return permissionOwnerId;
    }

    public void setPermissionOwnerId(String permissionOwnerId) {
        this.permissionOwnerId = permissionOwnerId;
    }

    public String getPermissionFromId() {
        return permissionFromId;
    }

    public void setPermissionFromId(String permissionFromId) {
        this.permissionFromId = permissionFromId;
    }

    public String getPermissionFromName() {
        return permissionFromName;
    }

    public void setPermissionFromName(String permissionFromName) {
        this.permissionFromName = permissionFromName;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
