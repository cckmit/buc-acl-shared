/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.result;

import com.alibaba.buc.api.model.Permission;

/**
 * @author juan.dengj 2014-2-11 上午11:00:44
 */
public class ApplyPermissionContentResultModel extends ApplyInstanceContentResultModel {

    private Permission permission;

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

}
