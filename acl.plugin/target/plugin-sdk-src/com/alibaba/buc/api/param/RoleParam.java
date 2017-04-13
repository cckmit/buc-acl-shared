package com.alibaba.buc.api.param;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class RoleParam implements Serializable {

    private static final long serialVersionUID = 8057674275185776540L;

    /**
     * 应用英文名，必选
     */
    private String            appName;

    /**
     * 角色英文名，必选
     */
    private String            name;

    /**
     * 角色中文标题，必选
     */
    private String            title;

    /**
     * 角色描述，必选
     */
    private String            description;

    /**
     * 角色归属人的用户id，角色Owner，必选，角色Owner将作为权限申请流程中的审批人，如果归属人离职、转岗，请重新设置
     */
    private List<String>      ownerUserIds;

    /**
     * 创建人的用户id，当前角色变更的发起人
     */
    private String            creatorUserId;

    /**
     * 权限回收策略（设置值请使用{@link RevokeRuleConstant}
     */
    private String            revokeRule;
    /**
     * 是否数据权限角色，是数据权限角色为true，不是为false，只有数据权限应用需要使用到此属性
     * 
     * 需要使用的用户最好找acl值班人员确认使用逻辑、影响，乱设可能导致验权不通过等问题
     * 
     * 默认为功能权限，即false
     */
    private boolean isData = false;

    /**
     * 1.公开可申请
     * 2.公开不可申请
     * 3.不公开
     */
    private String publicAttri = "1";
    

    public String getAppName() {
        return appName;
    }

    /**
     * 应用英文名，必选
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

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

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public boolean isData() {
        return isData;
    }
    
    public void setIsData(boolean isData) {
        this.isData = isData;
    }


    public String getPublicAttri() {
        return publicAttri;
    }

    public void setPublicAttri(String publicAttri) {
        this.publicAttri = publicAttri;
    }
}
