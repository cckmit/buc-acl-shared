package com.alibaba.buc.api.userpermission;

import java.io.Serializable;

public class PageUsersByPermissionParam implements Serializable {

	private static final long serialVersionUID = 1490915822515577513L;
	
   	// 权限名
    private String            name;
 
    // 所属应用名
    private String            appName;
    
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}