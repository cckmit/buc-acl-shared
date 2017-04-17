package com.alibaba.buc.api.param;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author shenwujie
 */
public class PermissionParam implements Serializable {

    private static final long serialVersionUID = 3984551184252933526L;

    /**
     * 应用英文名，必选
     */
    private String            appName;

    /**
     * 权限英文名，必选
     */
    private String            name;

    /**
     * 权限中文名，必选
     */
    private String            title;

    /**
     * 权限描述，必选
     */
    private String            description;

    /**
     * 权限风险等级，必选, 默认值为高风险；风险等级关系到申请流程，请根据实际情况选择
     * {@link riskLevelName}
     */
    @Deprecated
    private RiskLevel         riskLevel        = RiskLevel.H;
    
    /**
     * 权限风险等级，必选, 默认值为高风险；风险等级关系到申请流程，请根据实际情况选择
     */
    private String            riskLevelName;
    
    /**
     * 权限归属人的用户id，权限Owner，必选，权限归属人将作为权限申请流程中的审批人，如果归属人离职、转岗，请重新设置
     */
    private List<String>      ownerUserIds;

    /**
     * 功能效果，必选，权限控制的功能点在使用后产生的影响、效果等
     */
    private String            info;

    /**
     * 是否匿名权限，非必选，默认false，如果是匿名权限，则所有人都拥有这个权限
     */
    private boolean           anonymous        = false;

    /**
     * 是否激活状态，true表明激活，false表明非激活，默认激活。 不论是创建权限，还是更新权限，如果此项值为true，则触发事后审批流程，在流程审批失败时，权限将会被设置为非激活状态
     * 如果此项值设置为false，则不会触发事后审批流程
     */
    private boolean           isActive         = true;

    /**
     * 权限关联的部门id，非必选
     */
    private List<String>      orgIds;

    /**
     * 权限功能点，请说明包含哪些功能点，必选
     */
    private String            feature;

    /**
     * 操作路径，请说明在哪个路径（菜单）下进行操作，非必选
     */
    private String            path;

    /**
     * 创建人的用户id，当前权限变更的发起人
     */
    private String            creatorUserId;

    /**
     * 风险阈值，非必选
     */
    private String            riskThreshold;

    /**
     * 风控方案，非必选
     */
    private String            riskPlan;

    /**
     * 操作英文名，非必填，但如果填了资源名，就必填
     */
    private String            operationName;

    /**
     * 资源英文名，非必填，但如果填了操作名，就必填
     */
    private String            resourceName;

    private String            oldOperationName;

    private String            oldResourceName;

    /**
     * 权限回收策略（设置值请使用{@link RevokeRuleConstant}
     */
    private String            revokeRule;
    
    /**
     * 是否数据权限，是数据权限为true，不是为false，只有数据权限应用需要使用到此属性
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

    /**
     * quartz 表达式 生效时间
     *
     * 比如 * * 22-1 * * ? *
     * 表示每天22点至次日凌晨1:59:59点生效
     */
    private String effectiveTime;

    public String getOldOperationName() {
        return oldOperationName;
    }

    public void setOldOperationName(String oldOperationName) {
        this.oldOperationName = oldOperationName;
    }

    public String getOldResourceName() {
        return oldResourceName;
    }

    public void setOldResourceName(String oldResourceName) {
        this.oldResourceName = oldResourceName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceName() {
        return resourceName;
    }

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
     * 权限name，必选
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    /**
     * 权限中文名，必选
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    /**
     * 权限描述，必选
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    /**
     * 权限风险等级，必选, 默认值为高风险；风险等级关系到申请流程，请根据实际情况选择
     */
    public void setRiskLevel(RiskLevel riskLevel) {
        this.riskLevel = riskLevel;
    }

    public List<String> getOwnerUserIds() {
        return ownerUserIds;
    }

    /**
     * 权限归属人的用户id，权限Owner，必选，权限归属人将作为权限申请流程中的审批人，如果归属人离职、转岗
     */
    public void setOwnerUserIds(List<String> ownerUserIds) {
        this.ownerUserIds = ownerUserIds;
    }

    public String getInfo() {
        return info;
    }

    /**
     * 操作效果，必选，权限控制的功能点在使用后产生的影响、效果等
     */
    public void setInfo(String info) {
        this.info = info;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    /**
     * 是否匿名权限，非必选，默认false，如果是匿名权限，则所有人都拥有这个权限
     * 
     * @param anonymous
     */
    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public List<String> getOrgIds() {
        return orgIds;
    }

    public void setOrgIds(List<String> orgIds) {
        this.orgIds = orgIds;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public String getRiskThreshold() {
        return riskThreshold;
    }

    public void setRiskThreshold(String riskThreshold) {
        this.riskThreshold = riskThreshold;
    }

    public String getRiskPlan() {
        return riskPlan;
    }

    public void setRiskPlan(String riskPlan) {
        this.riskPlan = riskPlan;
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

    
    public String getRiskLevelName() {
        return riskLevelName;
    }

    
    public void setRiskLevelName(String riskLevelName) {
        this.riskLevelName = riskLevelName;
    }

    public String getPublicAttri() {
        return publicAttri;
    }

    public void setPublicAttri(String publicAttri) {
        this.publicAttri = publicAttri;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }
}
