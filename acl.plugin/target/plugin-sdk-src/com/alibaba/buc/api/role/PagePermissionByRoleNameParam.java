/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.role;

import com.alibaba.buc.api.common.AclParam;

/**
 * 类PagePermissionByRoleNameParam.java的实现描述： 根据角色名称来找权限的入参类
 * 
 * @author taigao.wjj 2014-12-30 下午4:44:31
 */
public class PagePermissionByRoleNameParam implements AclParam {

    private static final long serialVersionUID = -6148599424283878777L;

    public PagePermissionByRoleNameParam(String name){
        super();
        this.name = name;
    }

    public PagePermissionByRoleNameParam(){
        super();
    }

    /**
     * 角色名称
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
