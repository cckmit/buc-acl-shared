package com.alibaba.buc.acl.api.input.permission;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.role.UnderThisDomainAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.common.AclParam;
import com.alibaba.buc.acl.api.input.role.DeleteRoleParam;

/**
 * @author baidian.zc
 */
@GroupSequence(
		value = {
					Sb1.class,
					S1.class,
					Sa1.class,
					S2.class,
					Oper.class,
					Sb3.class,
					S3.class,
					DeletePermissionParam.class
		        }
		)

@AppKeyPrivilegeAnnotation(
	    appKeyField = "accessKey",
	    keyCenterAccessKeyField="keyCenterAccessKey",
	    interfaceNameField="PermissionService.deletePermission",
		groups ={Sa1.class}
	)

@UnderThisDomainAnnotation(
	    appKeyField = "accessKey",
	    targetNameField="name",
	    type="permission",
		groups ={S3.class}
	)
public class DeletePermissionParam extends AclParam {

	private static final long serialVersionUID = 4135372589910768550L;
    
    // 权限名称
	@NotEmpty(groups ={Sb3.class})
    private String            name;
    
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
  
	
}
