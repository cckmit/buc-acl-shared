package com.alibaba.buc.acl.api.input.menu;

import javax.validation.GroupSequence;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.SameDomainSingleAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.common.AclParam;

@GroupSequence(
        value = {
        		  Sb1.class,
                  S1.class,
                  Sa1.class,
                  S2.class,
                  Oper.class,
                  Sb3.class,
                  S3.class,
                  ListRoleTreeMenuParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "MenuService.listRoleTreeMenu",
        groups = {Sa1.class}
)

@SameDomainSingleAnnotation(
        appKeyField = "accessKey",
        singleObjectField = "roleName",
        type = "role",
        groups = {S3.class}
)

public class ListRoleTreeMenuParam extends AclParam{
	
	@NotEmpty(groups = {Sb3.class})
	private String roleName;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	

}
