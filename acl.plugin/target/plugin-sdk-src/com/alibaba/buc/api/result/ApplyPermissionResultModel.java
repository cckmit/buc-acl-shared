package com.alibaba.buc.api.result;

import java.io.Serializable;
import java.util.Date;

public class ApplyPermissionResultModel implements Serializable {

    private static final long        serialVersionUID = 2006040751215029210L;

    /**
     * 权限名称
     */
    private String                   permissionName;
    /**
     * 申请时间
     */
    private Date                     applyDate;

    /**
     * 状态
     */
    private String                   applyStatus;

    /**
     * 申请中的权限的来源
     */
    private ApplyingPermissionSource applySource;

    /**
     * 申请单单号
     */
    private Integer                  applyInstanceId;

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    public ApplyingPermissionSource getApplySource() {
        return applySource;
    }

    public void setApplySource(ApplyingPermissionSource applySource) {
        this.applySource = applySource;
    }

    public Integer getApplyInstanceId() {
        return applyInstanceId;
    }

    public void setApplyInstanceId(Integer applyInstanceId) {
        this.applyInstanceId = applyInstanceId;
    }

}
