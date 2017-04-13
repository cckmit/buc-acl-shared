/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.condition;

import com.alibaba.buc.api.param.ApplyContentType;
import com.alibaba.buc.api.param.ApplyStatus;

import java.io.Serializable;

/**
 * @author juan.dengj 2014-1-9 下午3:45:16
 */
public class ApplyInstanceCondition implements Serializable {

    private static final long serialVersionUID = -3205714862753112853L;

    /**
     * 必填, 查询申请内容中包含该应用权限或角色的申请单
     */
    private String           appName;

    /**
     * 可选, 申请人, 不传则不限定申请人
     */
    private String           applyUserId;
    
    /**
     * 可选, 提交人, 不传则不限定提交请人
     */
    private String           submitUserId;

    /**
     * 可选, 申请状态, 不传则不限定申请单状态
     */
    private ApplyStatus      applyStatus;

    /**
     * 可选, 申请内容的类型, 权限或角色
     */
    private ApplyContentType applyContentType;

    /**
     * 可选, 申请内容的权限或角色英文名, 中文标题关键字; 2个字符以上; 限定关键字时需限定申请内容类型{@link ApplyInstanceCondition#applyContentType}
     */
    private String           applyContentKey;

    /**
     * 可选, 关键字是否支持右模糊, 默认不右模糊
     */
    private boolean          isKeyRightLike = false;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
    }

    public ApplyStatus getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(ApplyStatus applyStatus) {
        this.applyStatus = applyStatus;
    }

    public ApplyContentType getApplyContentType() {
        return applyContentType;
    }

    public void setApplyContentType(ApplyContentType applyContentType) {
        this.applyContentType = applyContentType;
    }

    public String getApplyContentKey() {
        return applyContentKey;
    }

    public void setApplyContentKey(String applyContentKey) {
        this.applyContentKey = applyContentKey;
    }

    public boolean isKeyRightLike() {
        return isKeyRightLike;
    }

    public void setKeyRightLike(boolean isKeyRightLike) {
        this.isKeyRightLike = isKeyRightLike;
    }

    
    public String getSubmitUserId() {
        return submitUserId;
    }

    
    public void setSubmitUserId(String submitUserId) {
        this.submitUserId = submitUserId;
    }

}
