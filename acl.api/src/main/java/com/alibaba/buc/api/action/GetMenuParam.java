package com.alibaba.buc.api.action;

import com.alibaba.buc.api.common.AclParam;

/**
 * 获取单个菜单的入参
 *
 * @author taigao.wjj
 */
public class GetMenuParam implements AclParam{
	
	private static final long serialVersionUID = -6112860282799961341L;

	private String appName;  //应用名称,                    必填

    private String name;  //菜单唯一标示                                         必填
    
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
