package com.alibaba.buc.acl.api.input.role;

import java.util.List;
import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.ArraySizeAnnotation;
import com.alibaba.buc.acl.api.annotation.grant.SameDomainAnnotation;
import com.alibaba.buc.acl.api.annotation.role.SameDomainOrSharedAnnotation;
import com.alibaba.buc.acl.api.annotation.role.UnderThisDomainAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.S4;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sa4;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.annotation.sequence.Sb4;
import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 从角色中移除权限入参
 * <p/>
 * {@link com.alibaba.buc.api.RoleService#removePermissionsFromRole(RemovePermissionsFromRoleParam)}
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
                Sb4.class,
                S4.class,
                Sa4.class,
                RemovePermissionsFromRoleParam.class
        }
)
@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "RoleService.removePermissionsFromRole",
        groups = {Sa1.class}
)

@UnderThisDomainAnnotation(
        appKeyField = "accessKey",
        targetNameField = "roleName",
        type = "role",
        groups = {S3.class}
)

@SameDomainOrSharedAnnotation(
        appKeyField = "accessKey",
        namesField = "permissionNames",
        type = "permission",
        groups = {Sa4.class}
)

public class RemovePermissionsFromRoleParam extends AclParam {

    private static final long serialVersionUID = -4670211202150323840L;

    @NotEmpty(groups = {Sb3.class})
    private String roleName; // 角色名

    @NotNull(groups = {Sb4.class})
    @ArraySizeAnnotation(size = 100, groups = {S4.class})
    private List<String> permissionNames; // 权限名列表

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<String> getPermissionNames() {
        return permissionNames;
    }

    public void setPermissionNames(List<String> permissionNames) {
        this.permissionNames = permissionNames;
    }

}
