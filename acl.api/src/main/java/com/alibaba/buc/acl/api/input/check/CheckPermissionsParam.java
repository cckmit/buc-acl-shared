package com.alibaba.buc.acl.api.input.check;

import java.util.List;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.ArrayNotNullAndLimitSizeAnnotation;
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
                // Sa1.class,
                S2.class,
                //  Oper.class,
                Sb3.class,
                S3.class,
                S4.class,
                CheckPermissionsParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "AccessControlService.checkPermissions",
        groups = {Sa1.class}
)

/**
 * Created by baidian on 12/21/15.
 */
public class CheckPermissionsParam extends AclParam {

    private static final long serialVersionUID = -2148468421035987610L;

    @NotNull(groups = {Sb3.class})
    // @BucUserAnnotation(groups = {S3.class})  //不需要
    private Integer userId; // UC中的userId

    @ArrayNotNullAndLimitSizeAnnotation(size = 100, groups = {S4.class})
    private List<String> permissionNames; // 权限名列表

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<String> getPermissionNames() {
        return permissionNames;
    }

    public void setPermissionNames(List<String> permissionNames) {
        this.permissionNames = permissionNames;
    }

}
