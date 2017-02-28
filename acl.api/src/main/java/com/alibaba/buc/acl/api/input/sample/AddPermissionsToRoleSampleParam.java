package com.alibaba.buc.acl.api.input.sample;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.ArraySizeAnnotation;
import com.alibaba.buc.acl.api.annotation.role.BothNeedAnnotation;
import com.alibaba.buc.acl.api.annotation.role.RoleAddPermissionsIsInApplyingAnnotation;
import com.alibaba.buc.acl.api.annotation.role.SameDomainOrSharedAnnotation;
import com.alibaba.buc.acl.api.annotation.role.UnderThisDomainAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.S4;
import com.alibaba.buc.acl.api.annotation.sequence.S5;
import com.alibaba.buc.acl.api.annotation.sequence.S6;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sa4;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.annotation.sequence.Sb4;
import com.alibaba.buc.acl.api.common.AclParam;

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "RoleService.addPermissionsToRole",
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

@RoleAddPermissionsIsInApplyingAnnotation(
        roleNameField = "roleName",
        permissionNamesField = "permissionNames",
        groups = {S5.class}
)


@BothNeedAnnotation(
        firstField = "isFlow",
        secondField = "applyUserId",
        groups = {S6.class}
)

public class AddPermissionsToRoleSampleParam extends AclParam {

    private static final long serialVersionUID = 8753841699756081098L;

    @NotEmpty(groups = {Sb3.class})
    private String roleName; // 角色名

    @NotNull(groups = {Sb4.class})
    @ArraySizeAnnotation(size = 100, groups = {S4.class})
    private List<String> permissionNames;   // 权限名列表

    private Boolean isFlow = false; //是否走流程，默认不走，如果为true，则会走角色流程：角色归属人--应用/部门权限管理员--角色归属人主管--权限归属人--安全部终审

    private Integer applyUserId;    //流程发起人userId,当isFlow=true时必填

    private String applyReason = "";    //流程申请的原因

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

    public Boolean getIsFlow() {
        return isFlow;
    }

    public void setIsFlow(Boolean isFlow) {
        this.isFlow = isFlow;
    }

    public Integer getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(Integer applyUserId) {
        this.applyUserId = applyUserId;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

}
