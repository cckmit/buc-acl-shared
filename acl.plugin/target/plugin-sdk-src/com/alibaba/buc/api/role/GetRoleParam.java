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
 * 根据角色id 或者name 来获取 单个角色的入参。
 * 
 * @author taigao.wjj 2014-12-30 上午10:02:39
 */
public class GetRoleParam implements AclParam {

    private static final long serialVersionUID = 7843957278797777887L;

    public GetRoleParam(String name){
        super();
        this.name = name;
    }

    public GetRoleParam(){
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
