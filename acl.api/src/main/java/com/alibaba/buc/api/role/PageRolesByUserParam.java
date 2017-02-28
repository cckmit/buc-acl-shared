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
 * 类pageRoleByUserParam.java的实现描述： 根据用户来找角色的入参类
 * 
 * @author baidain.zc 2015-01-26 下午6:02:31
 */
public class PageRolesByUserParam implements AclParam {

	private static final long serialVersionUID = -449527179121822271L;
	
	private Integer           userId;  // 用户id
    
    private String            appName; // 应用名称

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    public void setAppName(String appName) {
    	this.appName = appName;
    }
    
    public String getAppName() {
    	return appName;
    }
    
}
