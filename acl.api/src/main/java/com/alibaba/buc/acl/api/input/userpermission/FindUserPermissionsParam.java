package com.alibaba.buc.acl.api.input.userpermission;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.common.AclParam;
@GroupSequence(
        value = {
                Sb1.class,
                S1.class,
                Sa1.class,
                S2.class,
                S3.class,
                FindUserPermissionsParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "UserPermissionsService.findUserPermissions",
        groups = {Sa1.class}
)
/**
 * 获取某个人在某个应用下面获取的权限
 * @author taigao.wjj
 *
 */
public class FindUserPermissionsParam extends AclParam{
	
	private static final long serialVersionUID = 8469308079589963237L;
	  @NotNull(groups = {S3.class})
	private Integer userId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	


}
