package com.alibaba.buc.api.action;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;

import com.alibaba.buc.api.annotation.BucPrincipalUserPrivilegeAnnotation;
import com.alibaba.buc.api.annotation.BucUserAnnotation;
import com.alibaba.buc.api.annotation.ExistInDbAnnotation;
import com.alibaba.buc.api.annotation.ExistSize;
import com.alibaba.buc.api.annotation.menuAnnotation.MenuNotExistAnnotation;
import com.alibaba.buc.api.annotation.menuAnnotation.UrlCanUpdateAnnotation;
import com.alibaba.buc.api.annotation.sequence.S1;
import com.alibaba.buc.api.annotation.sequence.S10;
import com.alibaba.buc.api.annotation.sequence.S2;
import com.alibaba.buc.api.annotation.sequence.S3;
import com.alibaba.buc.api.annotation.sequence.S4;
import com.alibaba.buc.api.annotation.sequence.S5;
import com.alibaba.buc.api.annotation.sequence.S6;
import com.alibaba.buc.api.annotation.sequence.S9;
import com.alibaba.buc.api.annotation.sequence.Sb1;
import com.alibaba.buc.api.annotation.sequence.Sb10;
import com.alibaba.buc.api.annotation.sequence.Sb2;
import com.alibaba.buc.api.annotation.sequence.Sb4;
import com.alibaba.buc.api.annotation.sequence.Sb5;
import com.alibaba.buc.api.annotation.sequence.Sb6;
import com.alibaba.buc.api.common.AclParam;

/**
 * 更新菜单的入参
 * @author taigao.wjj
 *
 */
@GroupSequence(
		value = 
			{
				Sb1.class,
				S1.class,
				Sb2.class,
				S2.class,
				S3.class,
				Sb4.class,
				S4.class,
				Sb5.class,
				S5.class,
				Sb6.class,
				S6.class,
				S9.class,
				Sb10.class,
				S10.class,
				UpdateMenuParam.class
			}
		)
@BucPrincipalUserPrivilegeAnnotation(
			principalUserIdField = "principalUserId", 
			appNameField = "appName", 
			permissionName="MenuService.updateMenu",
			message = "this principal user don't have the update menu privilege!",
			groups ={Sb4.class}
		)
@MenuNotExistAnnotation(
			appNameField="appName",
			nameField="name",
			message="this menu has not exits under this app!",
			groups ={S5.class}
		)
@UrlCanUpdateAnnotation(
			appNameField="appName", 
			urlField="url",
			nameField ="name", 
			message="this url has exits under this app!",
			groups ={Sb10.class} 
		)
//并不需要验证这个对象是否为null, 框架do this.
public class UpdateMenuParam implements AclParam{
	
	private static final long serialVersionUID = -2567912750806286005L;
	
	@NotNull(groups ={Sb1.class})
	@BucUserAnnotation( groups ={S1.class})
	private Integer principalUserId;  //公共账号,           必填
	
	
	@NotNull(groups ={Sb2.class})
	@BucUserAnnotation( groups ={S2.class})
	private Integer operatorUserId; //操作者id,             必填
	
	@ExistInDbAnnotation(type="app",groups ={S3.class})
	private String appName;  //应用名称,                    必填
	
	private String parentName;    //父菜单名称,             选填  ""是表示去掉父菜单， null不修改
	
	@NotNull(groups ={Sb5.class})
	private String name;  //菜单唯一标示                                         必填
	
	@ExistSize(min=1,max=200, groups={S6.class})
	private String title;  //菜单的title                    选填
	
	private String permissionName;  //关联权限名称                        选填  ""表示去掉，null不修改
	
	private Integer sort;    //排序序号                                           选填
	
	@ExistSize(min=1,max=500, groups={S9.class})
	private String url;     //url                          选填
	
	@ExistSize(min=1,max=2000, groups={S10.class})
	private String description; //描述                                            选填
	
	
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
