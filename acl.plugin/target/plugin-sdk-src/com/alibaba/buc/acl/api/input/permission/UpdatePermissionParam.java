package com.alibaba.buc.acl.api.input.permission;

import java.util.List;
import java.util.Map;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 更新权限的入参
 *
 * @author taigao
 */
public class UpdatePermissionParam extends AclParam {

    private static final long serialVersionUID = 1938244712669660605L;

    /**
     * 权限英文名，必选
     */
    private String name;

    /**
     * 权限中文名，必选
     */
    private String title;

    /**
     * 权限描述，必选
     */
    private String description;

    /**
     * 权限风险等级，必选, 默认值为高风险；风险等级关系到申请流程，请根据实际情况选择
     */
    private String riskLevelName;

    /**
     * 权限归属人的用户id，权限Owner，必选，权限归属人将作为权限申请流程中的审批人，如果归属人离职、转岗，请重新设置
     */
    private Integer ownerUserId;

    /**
     * 功能效果，必选，权限控制的功能点在使用后产生的影响、效果等
     */
    private String info;

    /**
     * 是否匿名权限，非必选，默认false，如果是匿名权限，则所有人都拥有这个权限
     */
    private boolean anonymous = false;

    /**
     * 是否激活状态，true表明激活，false表明非激活，默认激活。 不论是创建权限，还是更新权限，如果此项值为true，则触发事后审批流程，在流程审批失败时，权限将会被设置为非激活状态
     * 如果此项值设置为false，则不会触发事后审批流程
     */
    private boolean isActive = true;

    /**
     * 权限关联的部门id，非必选
     */
    private List<Integer> orgIds;

    /**
     * 权限功能点，请说明包含哪些功能点，必选
     */
    private String feature;

    /**
     * 操作路径，请说明在哪个路径（菜单）下进行操作，非必选
     */
    private String path;


    /**
     * 风险阈值，非必选
     */
    private String riskThreshold;

    /**
     * 风控方案，非必选
     */
    private String riskPlan;

    /**
     * 权限审批规则类型
     * <ul>
     * <li>randow：随机取审批人之一</li>
     * <li>self：用户申请该权限时自行选择审批人</li>
     * <li>parallel：所有审批人均参与审批，并行审批</li>
     * <li>org:按部门审批</li>
     * </ul>
     */
    private String ruleType = "random";

    /**
     * 审批人
     * <p>
     * 当ruleType为randow，self，parallel时，取审批人为approverUserIds的值。当ruleType为org时，不从approverUserIds取值。
     * </p>
     */
    private List<Integer> approverUserIds;

    /**
     * 扩展Map
     * <p>
     * 当ruleType为org时，需要用到此字段来传递审批人的值。可以为userId，value为此审批人userId对应的审批部门集合orgIds。 userId和orgIds不可重复。
     * </p>
     */
    private Map<Integer, List<Integer>> extentionMap;

    /**
     * added by yicheng.wp
     * <p/>
     * 权限回收策略
     */
    private String revokeRule;
    /**
     * 最长申请天数;目前支持数字;高风险权限的最大值365
     *
     * @return
     */
    private Integer maxApplyDay;

    /**
     * 是否数据权限，是数据权限为true，不是为false，只有数据权限应用需要使用到此属性
     * <p/>
     * 需要使用的用户最好找acl值班人员确认使用逻辑、影响，乱设可能导致验权不通过等问题
     * <p/>
     * 默认为功能权限，即false
     */
    private boolean isData = false;

    /**
     * 1.公开可申请
     * 2.公开不可申请
     * 3.不公开
     */
    private String publicAttri;

    /**
     * quartz 表达式 生效时间
     *
     * 比如 * * 22-1 * * ? *
     * 表示每天22点至次日凌晨1:59:59点生效
     */
    private String effectiveTime;

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

    public String getRiskLevelName() {
        return riskLevelName;
    }

    public void setRiskLevelName(String riskLevelName) {
        this.riskLevelName = riskLevelName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
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

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public List<Integer> getOrgIds() {
        return orgIds;
    }

    public void setOrgIds(List<Integer> orgIds) {
        this.orgIds = orgIds;
    }

    public Map<Integer, List<Integer>> getExtentionMap() {
        return extentionMap;
    }

    public void setExtentionMap(Map<Integer, List<Integer>> extentionMap) {
        this.extentionMap = extentionMap;
    }

    public String getRevokeRule() {
        return revokeRule;
    }

    public void setRevokeRule(String revokeRule) {
        this.revokeRule = revokeRule;
    }

    public boolean getIsData() {
        return isData;
    }

    public void setIsData(boolean isData) {
        this.isData = isData;
    }

    public Integer getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Integer ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public List<Integer> getApproverUserIds() {
        return approverUserIds;
    }

    public void setApproverUserIds(List<Integer> approverUserIds) {
        this.approverUserIds = approverUserIds;
    }

    public Integer getMaxApplyDay() {
        return maxApplyDay;
    }

    public void setMaxApplyDay(Integer maxApplyDay) {
        this.maxApplyDay = maxApplyDay;
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
