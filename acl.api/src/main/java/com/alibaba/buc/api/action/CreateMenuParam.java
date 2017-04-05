package com.alibaba.buc.api.action;

import com.alibaba.buc.api.common.AclParam;

public class CreateMenuParam implements AclParam{

	private static final long serialVersionUID = -5532780754317198868L;

	private Integer principalUserId;  //公共账号,            必填

    private Integer operatorUserId; //操作者id,              必填

    private String appName;  //应用名称,                     必填

    private String parentName;    //父菜单名称,              选填

    private String name;  //菜单唯一标示                                           必填

    private String title;  //菜单的title                     必填

    private String permissionName;  //关联权限名称                         选填
    
    private Integer sort;    //排序序号                                            选填

    private String url;     //url                           选填

    private String description; //描述                                             选填

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
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
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

	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
    

}
