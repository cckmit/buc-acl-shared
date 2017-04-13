/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.result;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.alibaba.buc.api.param.ApplyStatus;

/**
 * @author juan.dengj 2014-1-9 下午3:44:43
 */
public class ApplyInstanceResultModel implements Serializable {

    private static final long serialVersionUID = 1489256693670546581L;
    
    private String                                  applyUserId;     // 申请用户
    private String                                  applyReason;     // 申请理由
    private ApplyStatus                             applyStatus;     // 申请单状态
    private Date                                    applyDate;       // 申请时间
    private Integer                                 applyInstanceId; // 申请单id, 可以通过拼接申请单链接访问

    /**
     * 申请单的申请内容, 一个申请单有多个申请内容
     */
    private List<ApplyPermissionContentResultModel> applyPermissions; // 只有name和level
    private List<ApplyRoleContentResultModel>       applyRoles;      // 只有name和title

    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
    }

    public List<ApplyPermissionContentResultModel> getApplyPermissions() {
        return applyPermissions;
    }

    public void setApplyPermissions(List<ApplyPermissionContentResultModel> applyPermissions) {
        this.applyPermissions = applyPermissions;
    }

    public List<ApplyRoleContentResultModel> getApplyRoles() {
        return applyRoles;
    }

    public void setApplyRoles(List<ApplyRoleContentResultModel> applyRoles) {
        this.applyRoles = applyRoles;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public ApplyStatus getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(ApplyStatus applyStatus) {
        this.applyStatus = applyStatus;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Integer getApplyInstanceId() {
        return applyInstanceId;
    }

    public void setApplyInstanceId(Integer applyInstanceId) {
        this.applyInstanceId = applyInstanceId;
    }

}
