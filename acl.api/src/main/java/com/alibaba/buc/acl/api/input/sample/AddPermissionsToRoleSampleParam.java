package com.alibaba.buc.acl.api.input.sample;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

public class AddPermissionsToRoleSampleParam extends AclParam {

    private static final long serialVersionUID = 8753841699756081098L;

    private String roleName; // 角色名

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
