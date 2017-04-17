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
 * @author juan.dengj 2014-2-11 上午10:49:06
 */
public enum ApplyContentStatus {
    /**
     * 申请内容处理中
     */
    RAW,

    /**
     * 申请内容已通过
     */
    PASS,

    /**
     * 申请内容已拒绝
     */
    REJECT,
    
    /**
     * 申请内容已撤回或无效
     */
    INVALID;
    
    public static ApplyContentStatus getValue(String name) {
        try {
            if (StringUtils.isBlank(name)) {
                return null;
            } else {
                return valueOf(ApplyContentStatus.class, name);
            }
        } catch (Exception e) {
            return null;
        }
    }
}
