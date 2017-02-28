/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.result;

import java.io.Serializable;
import java.util.List;

import com.alibaba.buc.api.model.Permission;

/**
 * @author jin.tuj 2013-8-26 下午1:21:27
 */
public class UserPermissionResultModel implements Serializable {

    private static final long serialVersionUID = -3738366235013842582L;
    
    /**
     * 用户ID
     */
    private String            userId;
    private List<Permission>  permissions;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }


}
