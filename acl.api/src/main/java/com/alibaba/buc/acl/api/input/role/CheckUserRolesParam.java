package com.alibaba.buc.acl.api.input.role;

import java.util.List;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.ArrayNotNullAndLimitSizeAnnotation;
import com.alibaba.buc.acl.api.annotation.BucUserAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.S4;
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
                S4.class,
                CheckUserRolesParam.class
        }
)
@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "RoleService.checkUserRoles",
        groups = {Sa1.class}
)

public class CheckUserRolesParam extends AclParam {

    private static final long serialVersionUID = -3345139065164912413L;

    @NotNull(groups = {Sb3.class})
    @BucUserAnnotation(groups = {S3.class})
    private Integer userId;

    @ArrayNotNullAndLimitSizeAnnotation(size = 100, groups = {S4.class})
    private List<String> roleNames;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<String> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
    }

}
