package com.alibaba.buc.acl.api.output.menu;

import com.alibaba.buc.acl.api.common.AclResult;


/**
 * 菜单的返回对象
 * @author taigao.wjj
 *
 */
public class MenuResult extends AclResult{
	
	private static final long serialVersionUID = -8639399114139954414L;

	private String parentName;         //父菜单名称,
    private String name;               //菜单唯一标示 //如果此值为null,可以认为返回结果为null
    private String title;              //菜单的title
    private String permissionName;     //关联权限名称
    private Integer sort;              //排序序号
    private String url;                //url
    private String description;        //描述
    
    
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
