package com.alibaba.buc.acl.api.input.permission;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;

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

/**
 * 根据权限名查询权限入参
 * <p/>
 * {@link com.alibaba.buc.api.PermissionService#getPermission(GetPermissionParam)}
 *
 * @author yicheng.wp
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
                GetPermissionParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "PermissionService.getPermission",
        groups = {Sa1.class}
)

@UnderThisDomainAnnotation(
        appKeyField = "accessKey",
        targetNameField = "permissionName",
        type = "permission",
        groups = {S3.class}
)
public class GetPermissionParam extends AclParam {

    private static final long serialVersionUID = -2318038530185580860L;

    @NotEmpty(groups = {Sb3.class})
    private String permissionName;

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

}
