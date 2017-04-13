/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.result;

/**
 * 用户在申请权限的来源
 * 
 * @author meimei.limm 2013-9-5 下午1:57:07
 */
public enum ApplyingPermissionSource {

    /**
     * 在申请权限来自权限申请
     */
    FROM_PERMISSION_APPLY,

    /**
     * 在申请权限来自角色申请
     */
    FROM_ROLE_APPLY
}
