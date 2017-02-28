package com.alibaba.buc.acl.api.input.usergroup;

import com.alibaba.buc.acl.api.annotation.AclEnumAnnotation;
import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.ExistSize;
import com.alibaba.buc.acl.api.annotation.role.BucUserWithWBListAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S19;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.S4;
import com.alibaba.buc.acl.api.annotation.sequence.S5;
import com.alibaba.buc.acl.api.annotation.sequence.S6;
import com.alibaba.buc.acl.api.annotation.sequence.S7;
import com.alibaba.buc.acl.api.annotation.sequence.S8;
import com.alibaba.buc.acl.api.annotation.sequence.S9;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb19;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.annotation.sequence.Sb5;
import com.alibaba.buc.acl.api.annotation.sequence.Sb6;
import com.alibaba.buc.acl.api.annotation.sequence.Sb7;
import com.alibaba.buc.acl.api.annotation.sequence.Sb8;
import com.alibaba.buc.acl.api.annotation.sequence.Sb9;
import com.alibaba.buc.acl.api.annotation.usergroup.UsergroupAlreadyExistAnnotation;
import com.alibaba.buc.acl.api.common.AclParam;
import com.alibaba.buc.api.param.RevokeRuleConstant;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

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
                Sb5.class,
                S5.class,
                Sb6.class,
                S6.class,
                Sb7.class,
                S7.class,
                Sb8.class,
                S8.class,
                Sb9.class,
                S9.class,
                CreateUsergroupParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "UsergroupService.createUsergroup",
        groups = {Sa1.class}
)

/**
 * Created by baidian on 12/18/15.
 */
public class CreateUsergroupParam extends AclParam {

    private static final long serialVersionUID = -2476002815205391300L;

    @NotNull(groups = {Sb3.class})
    @Size(min = 1, max = 200, groups = {S3.class})
    @UsergroupAlreadyExistAnnotation(groups = {S4.class})
    private String name;    // 用户组英文名

    @NotNull(groups = {Sb5.class})
    @Size(min = 1, max = 200, groups = {S5.class})
    private String title;   // 用户组中文名

    @ExistSize(min = 1, max = 2000, groups = {S6.class})
    private String description; // 用户组描述

    @NotNull(groups = {Sb7.class})
    @BucUserWithWBListAnnotation(groups = {S7.class})
    private List<Integer> adminUserIds;  // 用户组管理员的 userId

    private boolean isNotify = true;    // 是否通知管理员

    private List<String> orgIds;    // 适用范围

    private Integer type = Integer.valueOf(1);  // 1:用户组, 0:岗位

    private String publicAttri = "1";   // 1:公开可申请 2 公开不可申请 3 不公开 4.使用范围内看见可申请

    /**
     * 权限回收策略（设置值请使用{@link RevokeRuleConstant}
     */
    @NotNull(groups = {Sb8.class})
    @AclEnumAnnotation(scope = "TRANSFER_REVOKE,RESERVE,REVOKE", groups = {S8.class})
    private String revokeRule = "TRANSFER_REVOKE";

    /**
     * 是否要求用户组成员同一部门，开启会定时发邮件统计用户组的成员部门情况
     */
    private Boolean isMemberSameOrg = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Integer> getAdminUserIds() {
        return adminUserIds;
    }

    public void setAdminUserIds(List<Integer> adminUserIds) {
        this.adminUserIds = adminUserIds;
    }

    public boolean getIsNotify() {
        return isNotify;
    }

    public void setIsNotify(boolean isNotify) {
        this.isNotify = isNotify;
    }

    public List<String> getOrgIds() {
        return orgIds;
    }

    public void setOrgIds(List<String> orgIds) {
        this.orgIds = orgIds;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPublicAttri() {
        return publicAttri;
    }

    public void setPublicAttri(String publicAttri) {
        this.publicAttri = publicAttri;
    }

    public String getRevokeRule() {
        return revokeRule;
    }

    public void setRevokeRule(String revokeRule) {
        this.revokeRule = revokeRule;
    }

    public Boolean getIsMemberSameOrg() {
        return isMemberSameOrg;
    }

    public void setIsMemberSameOrg(Boolean isMemberSameOrg) {
        this.isMemberSameOrg = isMemberSameOrg;
    }
}
