/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.role;

import com.alibaba.buc.api.common.AclResult;

/**
 * 类RoleResult.java的实现描述：获取角色返回对象
 * 
 * @author taigao.wjj 2014-12-31 上午11:51:27
 */
public class RoleResult implements AclResult {

    private static final long serialVersionUID = 676086482760144773L;

    private String            name;
    private String            title;
    private Boolean           isSystem;       // 类型
    private String            description;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
