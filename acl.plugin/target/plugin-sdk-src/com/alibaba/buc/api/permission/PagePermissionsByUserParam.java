package com.alibaba.buc.api.permission;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.alibaba.buc.api.common.AclParam;
import com.alibaba.buc.api.param.Action;
import com.alibaba.buc.api.param.DataPermissionParam;

public class PagePermissionsByUserParam implements AclParam {

	private static final long serialVersionUID = -8261833440418156176L;
	
     // UC中的userId
    private Integer            userId;
    
     // 权限name
    private String            appName;                 

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    public String getAppName() {
    	return appName;
    }
    
    public void setAppName(String appName) {
    	this.appName = appName;
    }
	
}