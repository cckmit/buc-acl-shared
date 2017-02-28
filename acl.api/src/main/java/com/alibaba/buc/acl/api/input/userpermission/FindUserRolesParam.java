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
                FindUserRolesParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "UserPermissionsService.findUserRoles",
        groups = {Sa1.class}
)
public class FindUserRolesParam extends AclParam{
	
	private static final long serialVersionUID = 1672338967927057928L;
	@NotNull(groups = {S3.class})
	private Integer userId;

	public Integer getUserId() {
			return userId;
	}

	public void setUserId(Integer userId) {
			this.userId = userId;
	}
}
