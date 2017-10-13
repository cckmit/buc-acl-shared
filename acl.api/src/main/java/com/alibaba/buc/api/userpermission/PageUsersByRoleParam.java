package com.alibaba.buc.api.userpermission;

import java.io.Serializable;

public class PageUsersByRoleParam implements Serializable {

	private static final long serialVersionUID = 7583640562840610616L;
	
	// 角色名
	private String            name;
	
	// 应用名
    private String            appName;
    
    /**
     * 接口默认返回应用下做的授权，如果角色生态化过程中在部门下做的授权则查不到
     * 
     * 设置为true则包含应用下创建角色在部门中做的授权
     * 
     * 默认为false
     */
    private Boolean includingAllAppCreateRoleGrantInfo;
    
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

    
    public Boolean getIncludingAllAppCreateRoleGrantInfo() {
        return includingAllAppCreateRoleGrantInfo;
    }
    
    public void setIncludingAllAppCreateRoleGrantInfo(Boolean includingAllAppCreateRoleGrantInfo) {
        this.includingAllAppCreateRoleGrantInfo = includingAllAppCreateRoleGrantInfo;
    }
    
}