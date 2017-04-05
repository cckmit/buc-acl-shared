package com.alibaba.buc.acl.api.input.role;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 添加权限到角色的入参
 *
 * @author taigao
 */
public class AddPermissionsToRoleParam extends AclParam {

    private static final long serialVersionUID = 9081234491980006957L;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 权限名列表
     */
    private List<String> permissionNames;

    /**
     * 是否走流程，默认不走，如果为true，则会走角色流程：角色归属人--应用/部门权限管理员--角色归属人主管--权限归属人--安全部终审
     */
    private Boolean isFlow = false;

    /**
     * 流程发起人userId,当isFlow=true时必填
     */
    private Integer applyUserId;

    /**
     * 流程申请的原因
     */
    private String applyReason = "";

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
