package com.alibaba.buc.api.action;

import com.alibaba.buc.api.common.AclParam;

/**
 * 删除菜单的入参
 *
 * @author taigao.wjj
 */
public class DeleteMenuParam implements AclParam{
	
	private static final long serialVersionUID = 5102942754586093140L;

	private Integer principalUserId;  //公共账号,           必填

    private Integer operatorUserId; //操作者id,             必填

    private String appName;  //应用名称,                    必填
	
    private String name;  //菜单唯一标示                                          必填
    
	public Integer getPrincipalUserId() {
		return principalUserId;
	}
	public void setPrincipalUserId(Integer principalUserId) {
		this.principalUserId = principalUserId;
	}
	public Integer getOperatorUserId() {
		return operatorUserId;
	}
	public void setOperatorUserId(Integer operatorUserId) {
		this.operatorUserId = operatorUserId;
	}
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
