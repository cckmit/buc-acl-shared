/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.result;

import com.alibaba.buc.api.model.Role;

/**
 * @author juan.dengj 2014-2-11 上午11:01:03
 */
public class ApplyRoleContentResultModel extends ApplyInstanceContentResultModel {

    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
