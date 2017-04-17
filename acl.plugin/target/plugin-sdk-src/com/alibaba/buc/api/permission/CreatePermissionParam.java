package com.alibaba.buc.api.permission;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.alibaba.buc.api.common.AclParam;
import com.alibaba.buc.api.param.RiskLevel;

public class CreatePermissionParam implements AclParam {

    private static final long         serialVersionUID = -9175533812070582002L;
    /**
     * 操作人的用户id，必选，请务必传入正确的userId，所有写接口，都会校验该用户是否拥有写的权限
     * {@link principalUserId}
     */
    @Deprecated
    private String                    userId;
    
    
    /**
     * 接口调用人id，必选，请务必传入正确的userId，所有写接口，都会校验该用户是否拥有写的权限
     * 
     */
    private String                    principalUserId;
    
    /**
     * 业务操作人Id
     */
    private String                    operatorUserId;
    
    /**
     * 应用英文名，必选
     */
    private String                    appName;

    /**
     * 权限英文名，必选
     */
    private String                    name;

    /**
     * 权限中文名，必选
     */
    private String                    title;

    /**
     * 权限描述，必选
     */
    private String                    description;

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
    private String                    ownerUserId;

    /**
     * 功能效果，必选，权限控制的功能点在使用后产生的影响、效果等
     */
    private String                    info;

    /**
     * 是否匿名权限，非必选，默认false，如果是匿名权限，则所有人都拥有这个权限
     */
    private boolean                   anonymous        = false;

    /**
     * 是否激活状态，true表明激活，false表明非激活，默认激活。 不论是创建权限，还是更新权限，如果此项值为true，则触发事后审批流程，在流程审批失败时，权限将会被设置为非激活状态
     * 如果此项值设置为false，则不会触发事后审批流程
     */
    private boolean                   isActive         = true;

    /**
     * 权限关联的部门id，非必选
     */
    private List<String>              orgIds;

    /**
     * 权限功能点，请说明包含哪些功能点，必选
     */
    private String                    feature;

    /**
     * 操作路径，请说明在哪个路径（菜单）下进行操作，非必选
     */
    private String                    path;

    /**
     * 创建人的用户id，当前权限变更的发起人
     * {@link operatorUserId}
     */
    @Deprecated
    private String                    creatorUserId;

    /**
     * 风险阈值，非必选
     */
    private String                    riskThreshold;

    /**
     * 风控方案，非必选
     */
    private String                    riskPlan;


    /**
     * 权限审批规则类型
     * <ul>
     * <li>randow：随机取审批人之一</li>
     * <li>self：用户申请该权限时自行选择审批人</li>
     * <li>parallel：所有审批人均参与审批，并行审批</li>
     * <li>org:按部门审批</li>
     * </ul>
     */
    private String                    ruleType         = "random";

    /**
     * 审批人
     * <p>
     * 当ruleType为randow，self，parallel时，取审批人为approverUserIds的值。当ruleType为org时，不从approverUserIds取值。
     * </p>
     */
    private List<String>              approverUserIds;

    /**
     * 扩展Map
     * <p>
     * 当ruleType为org时，需要用到此字段来传递审批人的值。可以为userId，value为此审批人userId对应的审批部门集合orgIds。 userId和orgIds不可重复。
     * </p>
     */
    private Map<String, List<String>> extentionMap;
    
    /**
     * added by yicheng.wp
     *
     * 权限回收策略
     */
    private String            revokeRule;
    /**
     * 最长申请天数;目前支持数字;高风险权限的最大值365
     * @return
     */
    private String maxApplyDay;
    
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
    
    public String getRevokeRule() {
		return revokeRule;
	}

	public void setRevokeRule(String revokeRule) {
		this.revokeRule = revokeRule;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOwnerUserId() {
        return ownerUserId;
    }

    /**
     * 权限归属人的用户id，权限Owner，必选，权限归属人将作为权限申请流程中的审批人，如果归属人离职、转岗
     */
    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
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

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public List<String> getApproverUserIds() {
        return approverUserIds;
    }

    public void setApproverUserIds(List<String> approverUserIds) {
        this.approverUserIds = approverUserIds;
    }

    public Map<String, List<String>> getExtentionMap() {
        return extentionMap;
    }

    public void setExtentionMap(Map<String, List<String>> extentionMap) {
        this.extentionMap = extentionMap;
    }

	public String getMaxApplyDay() {
		return maxApplyDay;
	}

	public void setMaxApplyDay(String maxApplyDay) {
		this.maxApplyDay = maxApplyDay;
	}

    
    public boolean isData() {
        return isData;
    }

    
    public void setIsData(boolean isData) {
        this.isData = isData;
    }

    
    public String getPrincipalUserId() {
        return principalUserId;
    }

    
    public void setPrincipalUserId(String principalUserId) {
        this.principalUserId = principalUserId;
    }

    
    public String getOperatorUserId() {
        return operatorUserId;
    }

    
    public void setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
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
