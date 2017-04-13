/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.result;

import com.alibaba.buc.api.param.ApplyContentStatus;
import com.alibaba.buc.api.param.ApplyContentType;

import java.util.Date;

/**
 * @author juan.dengj 2014-2-11 上午10:55:22
 */
public class ApplyInstanceContentResultModel {

    private ApplyContentType   applyContentType;
    private ApplyContentStatus applyContentStatus;

    private Date               expireDate; // 申请的有效期

    public ApplyContentType getApplyContentType() {
        return applyContentType;
    }

    public void setApplyContentType(ApplyContentType applyContentType) {
        this.applyContentType = applyContentType;
    }

    public ApplyContentStatus getApplyContentStatus() {
        return applyContentStatus;
    }

    public void setApplyContentStatus(ApplyContentStatus applyContentStatus) {
        this.applyContentStatus = applyContentStatus;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
}
