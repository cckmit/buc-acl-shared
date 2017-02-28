package com.alibaba.buc.acl.api.input.grant;

import java.util.Date;
import java.util.List;
import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;

import com.alibaba.buc.acl.api.annotation.AclEnumAnnotation;
import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.ArraySizeAnnotation;
import com.alibaba.buc.acl.api.annotation.BucUserAnnotation;
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
import com.alibaba.buc.acl.api.annotation.sequence.Sa6;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.annotation.sequence.Sb4;
import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 授予/冻结/移除用户角色入参
 * <p/>
 * {@link com.alibaba.buc.api.GrantService#grantRolesToUser(GrantRolesToUserParam)}
 * only grant your app's role to user
 *
 * @author yicheng.wp
 * @author taigao.wjj update 2015/12/03
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
                GrantRolesToUserParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "GrantService.grantRolesToUser",
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

public class GrantRolesToUserParam extends AclParam {

    private static final long serialVersionUID = 7203776587877535392L;

    @NotNull(groups = {Sb3.class})
    @BucUserAnnotation(groups = {S3.class})
    private Integer userId; // UC中的userId

    @NotNull(groups = {Sb4.class})
    @ArraySizeAnnotation(size = 100, groups = {S4.class})
    private List<String> roleNames; // 角色名列表

    private Date expireDate; // 过期时间

    @NotNull(groups = {S6.class})
    @AclEnumAnnotation(scope = "Grant,Freeze,Revoke", groups = {Sa6.class})
    private String action; // 授予动作

    private String reason; // 理由

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
