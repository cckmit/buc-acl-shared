package com.alibaba.buc.api.action;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;

import com.alibaba.buc.api.annotation.BucPrincipalUserPrivilegeAnnotation;
import com.alibaba.buc.api.annotation.BucUserAnnotation;
import com.alibaba.buc.api.annotation.ExistInDbAnnotation;
import com.alibaba.buc.api.annotation.menuAnnotation.MenuNotExistAnnotation;
import com.alibaba.buc.api.annotation.sequence.S1;
import com.alibaba.buc.api.annotation.sequence.S2;
import com.alibaba.buc.api.annotation.sequence.S3;
import com.alibaba.buc.api.annotation.sequence.Sb1;
import com.alibaba.buc.api.annotation.sequence.Sb2;
import com.alibaba.buc.api.annotation.sequence.Sb4;
import com.alibaba.buc.api.annotation.sequence.Sb5;
import com.alibaba.buc.api.common.AclParam;

/**
 * 删除菜单的入参
 * @author taigao.wjj
 *
 */
@GroupSequence(
		value = {
				Sb1.class,
				S1.class,
				Sb2.class,
				S2.class,
				S3.class,
				Sb4.class,
				Sb5.class,
				DeleteMenuParam.class
			}
		)
@BucPrincipalUserPrivilegeAnnotation(
			principalUserIdField = "principalUserId", 
			appNameField = "appName", 
			permissionName="MenuService.deleteMenu",
			message = "this principal user don't have the delete menu privilege!",
			groups ={Sb4.class}
		)
@MenuNotExistAnnotation(
			appNameField="appName",
			nameField="name",
			message="this menu has exits under this app!",
			groups ={Sb5.class}
		)
//并不需要验证这个对象是否为null, 框架do this.
public class DeleteMenuParam implements AclParam{
	
	private static final long serialVersionUID = 5102942754586093140L;
	
	@NotNull(groups ={Sb1.class})
	@BucUserAnnotation( groups ={S1.class})
	private Integer principalUserId;  //公共账号,           必填
	
	@NotNull(groups ={Sb2.class})
	@BucUserAnnotation( groups ={S2.class})
    private Integer operatorUserId; //操作者id,             必填
    
	@ExistInDbAnnotation(type="app",groups ={S3.class})
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
