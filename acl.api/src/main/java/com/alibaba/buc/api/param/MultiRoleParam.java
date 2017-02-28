package com.alibaba.buc.api.param;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class MultiRoleParam implements Serializable {

    private static final long serialVersionUID = 8057690275185776540L;


    /**
     * 角色英文名，必选
     */
    private String            name;

    /**
     * 角色中文标题，必选
     */
    private String            title;

    /**
     * 角色描述
     */
    private String            description;

    /**
     * 角色归属人的用户id，角色Owner，必选，角色Owner将作为权限申请流程中的审批人，如果归属人离职、转岗，请重新设置
     */
    private List<String>      ownerUserIds;
    
    /**
     * 权限来源，新增时必选，不能修改
     */
    private String           permissionSourceName;   
    
    /**
     * 归属部门，必选
     */
    private String            orgIds;                                   
        
    /**
     * 创建人的用户id，当前角色创建或变更的发起人，必选
     */
    private String            creatorUserId;

    /**
     * 权限回收策略（设置值请使用{@link RevokeRuleConstant}
     */
    private String            revokeRule;

    /**
     * 1.公开可申请
     * 2.公开不可申请
     * 3.不公开
     */
    private String publicAttri = "1";

    public String getName() {
        return name;
    }

    /**
     * 角色英文名，必选
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    /**
     * 角色中文标题，必选
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    /**
     * 角色描述，必选
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getOwnerUserIds() {
        return ownerUserIds;
    }

    public void setOwnerUserIds(List<String> ownerUserIds) {
        this.ownerUserIds = ownerUserIds;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    
    public String getOrgIds() {
        return orgIds;
    }

    
    public void setOrgIds(String orgIds) {
        this.orgIds = orgIds;
    }

    
    public String getPermissionSourceName() {
        return permissionSourceName;
    }

    
    public void setPermissionSourceName(String permissionSourceName) {
        this.permissionSourceName = permissionSourceName;
    }

    
    public String getCreatorUserId() {
        return creatorUserId;
    }

    
    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public String getRevokeRule() {
        return revokeRule;
    }

    public void setRevokeRule(String revokeRule) {
        this.revokeRule = revokeRule;
    }

    public String getPublicAttri() {
        return publicAttri;
    }

    public void setPublicAttri(String publicAttri) {
        this.publicAttri = publicAttri;
    }
}
