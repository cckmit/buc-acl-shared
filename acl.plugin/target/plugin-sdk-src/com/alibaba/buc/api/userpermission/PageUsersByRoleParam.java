package com.alibaba.buc.api.userpermission;

import java.io.Serializable;

public class PageUsersByRoleParam implements Serializable {

	private static final long serialVersionUID = 7583640562840610616L;
	
	// 角色名
	private String            name;
	
	// 应用名
    private String            appName;
    
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
	
}