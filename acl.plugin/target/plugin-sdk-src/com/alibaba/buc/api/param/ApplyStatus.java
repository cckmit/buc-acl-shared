/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.param;

import org.apache.commons.lang.StringUtils;

/**
 * @author juan.dengj 2014-1-14 下午4:25:11
 */
public enum ApplyStatus {
    /**
     * 申请单进行中
     */
    START,

    /**
     * 申请单已完成
     */
    END,

    /**
     * 申请单异常
     */
    ERROR;
    
    public static ApplyStatus getValue(String name) {
        try {
            if (StringUtils.isBlank(name)) {
                return null;
            } else {
                return valueOf(ApplyStatus.class, name);
            }
        } catch (Exception e) {
            return null;
        }
    }
}
