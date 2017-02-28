package com.alibaba.buc.acl.api.input.grant;

import java.util.Date;
import java.util.List;

import javax.validation.GroupSequence;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.buc.acl.api.annotation.AclEnumAnnotation;
import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.ArraySizeAnnotation;
import com.alibaba.buc.acl.api.annotation.MustExistInDbAnnotation;
import com.alibaba.buc.acl.api.annotation.grant.GrantExpireDateAnnotation;
import com.alibaba.buc.acl.api.annotation.grant.SameDomainAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.S4;
import com.alibaba.buc.acl.api.annotation.sequence.S5;
import com.alibaba.buc.acl.api.annotation.sequence.S6;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sa4;
import com.alibaba.buc.acl.api.annotation.sequence.Sa5;
import com.alibaba.buc.acl.api.annotation.sequence.Sa6;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.annotation.sequence.Sb4;
import com.alibaba.buc.acl.api.annotation.sequence.Sb6;
import com.alibaba.buc.acl.api.common.AclParam;
import com.alibaba.buc.api.param.Action;

/**
 * 授予/冻结/移除用户组角色入参
 * <p/>
 * {@link com.alibaba.buc.api.GrantService#grantRolesToUsergroup(GrantRolesToUsergroupParam)}
 *
 * @author yicheng.wp
 * @author taigao.wjj update on 2015/12/03
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
                S5.class,
                S6.class,
                Sa6.class,
                GrantRolesToUsergroupParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "GrantService.grantRolesToUsergroup",
        groups = {Sa1.class}
)

@SameDomainAnnotation(
        appKeyField = "accessKey",
        namesField = "roleNames",
        type = "role",
        groups = {Sa4.class}
)

@GrantExpireDateAnnotation(
        appKeyField = "accessKey",
        permissionNamesField = "roleNames",
        expireDateField = "expireDate",
        actionField = "action",
        type = "ROLE",
        groups = {S5.class}
)

public class GrantRolesToUsergroupParam extends AclParam {

    private static final long serialVersionUID = 6726764788823144357L;

    @NotEmpty(groups = {Sb3.class})
    @MustExistInDbAnnotation(type = "usergroup", groups = {S3.class})
    private String usergroupName; // 用户组名

    @NotNull(groups = {Sb4.class})
    @ArraySizeAnnotation(size = 100, groups = {S4.class})
    private List<String> roleNames; // 权限名列表

    private Date expireDate; // 过期时间

    @NotNull(groups = {S6.class})
    @AclEnumAnnotation(scope = "Grant,Freeze,Revoke", groups = {Sa6.class})
    private String action; // 授予动作

    private String reason; // 理由

    public String getUsergroupName() {
        return usergroupName;
    }

    public void setUsergroupName(String usergroupName) {
        this.usergroupName = usergroupName;
    }

    public List<String> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
