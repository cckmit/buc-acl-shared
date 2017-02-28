package com.alibaba.buc.acl.api.input.permission;

import java.util.List;
import java.util.Map;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.alibaba.buc.acl.api.annotation.AclEnumAnnotation;
import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.CronExpressionAnnotation;
import com.alibaba.buc.acl.api.annotation.HasExistInDbAnnotation;
import com.alibaba.buc.acl.api.annotation.NameFormatAnnotation;
import com.alibaba.buc.acl.api.annotation.OfficialBucUserSingleAnnotation;
import com.alibaba.buc.acl.api.annotation.permission.BucOrgListAnnotation;
import com.alibaba.buc.acl.api.annotation.permission.CaseMaxApplyDayAnnotation;
import com.alibaba.buc.acl.api.annotation.role.OfficialBucUserListAnnotation;
import com.alibaba.buc.acl.api.annotation.role.UserOrgBindingAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S12;
import com.alibaba.buc.acl.api.annotation.sequence.S16;
import com.alibaba.buc.acl.api.annotation.sequence.S17;
import com.alibaba.buc.acl.api.annotation.sequence.S18;
import com.alibaba.buc.acl.api.annotation.sequence.S19;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S20;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.S4;
import com.alibaba.buc.acl.api.annotation.sequence.S5;
import com.alibaba.buc.acl.api.annotation.sequence.S6;
import com.alibaba.buc.acl.api.annotation.sequence.S7;
import com.alibaba.buc.acl.api.annotation.sequence.S8;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sa3;
import com.alibaba.buc.acl.api.annotation.sequence.Saa3;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb12;
import com.alibaba.buc.acl.api.annotation.sequence.Sb16;
import com.alibaba.buc.acl.api.annotation.sequence.Sb19;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.annotation.sequence.Sb4;
import com.alibaba.buc.acl.api.annotation.sequence.Sb5;
import com.alibaba.buc.acl.api.annotation.sequence.Sb6;
import com.alibaba.buc.acl.api.annotation.sequence.Sb7;
import com.alibaba.buc.acl.api.annotation.sequence.Sb8;
import com.alibaba.buc.acl.api.common.AclParam;
import com.alibaba.buc.api.annotation.sequence.S11;

@GroupSequence(
        value = {
                Sb1.class,
                S1.class,
                Sa1.class,
                S2.class,
                Oper.class,
                Sb3.class,
                S3.class,
                Sa3.class,
                Saa3.class,
                Sb4.class,
                S4.class,
                Sb5.class,
                S5.class,
                Sb6.class,
                S6.class,
                Sb7.class,
                S7.class,
                Sb8.class,
                S8.class,
                S11.class,
                Sb12.class,
                S12.class,
                Sb16.class,
                S16.class,
                S17.class,
                S18.class,
                Sb19.class,
                S19.class,
                S20.class,
                CreatePermissionParam.class
        }
)
@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "PermissionService.createPermission",
        groups = {Sa1.class}
)


@UserOrgBindingAnnotation(
        ruleTypeField = "ruleType",
        extentionMapField = "extentionMap",
        groups = {S18.class}
)

@CaseMaxApplyDayAnnotation(
        levelField = "riskLevelName",
        maxApplyDayField = "maxApplyDay",
        groups = {S20.class}
)


public class CreatePermissionParam extends AclParam {

    private static final long serialVersionUID = -3114177970774303580L;

    /**
     * 权限英文名，必选
     */
    @NotNull(groups = {Sb3.class})
    @Size(min = 1, max = 200, groups = {S3.class})
    @HasExistInDbAnnotation(type = "permission", groups = {Sa3.class})
    @NameFormatAnnotation(groups = {Saa3.class})
    private String name;

    /**
     * 权限中文名，必选
     */
    @NotNull(groups = {Sb4.class})
    @Size(min = 1, max = 200, groups = {S4.class})
    private String title;

    /**
     * 权限描述，必选
     */
    @NotNull(groups = {Sb5.class})
    @Size(min = 1, max = 2000, groups = {S5.class})
    private String description;


    /**
     * 权限风险等级，必选, 默认值为高风险；风险等级关系到申请流程，请根据实际情况选择
     */
    @NotNull(groups = {Sb6.class})
    @AclEnumAnnotation(scope = "L,M,H", groups = {S6.class})
    private String riskLevelName;

    /**
     * 权限归属人的用户id，权限Owner，必选，权限归属人将作为权限申请流程中的审批人，如果归属人离职、转岗，请重新设置
     */
    @NotNull(groups = {Sb7.class})
    @OfficialBucUserSingleAnnotation(groups = {S7.class}, type = "create")
    private Integer ownerUserId;

    /**
     * 功能效果，必选，权限控制的功能点在使用后产生的影响、效果等
     */
    @NotNull(groups = {Sb8.class})
    @Size(min = 1, max = 2000, groups = {S8.class})
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
    @BucOrgListAnnotation(groups = {S11.class}, type = "create")
    private List<Integer> orgIds;

    /**
     * 权限功能点，请说明包含哪些功能点，必选
     */
    @NotNull(groups = {Sb12.class})
    @Size(min = 1, max = 2000, groups = {S12.class})
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
    @NotNull(groups = {Sb16.class})
    @AclEnumAnnotation(scope = "random,self,org", groups = {S16.class})
    private String ruleType = "random";

    /**
     * 审批人
     * <p>
     * 当ruleType为randow，self，parallel时，取审批人为approverUserIds的值。当ruleType为org时，不从approverUserIds取值。
     * </p>
     */
    @OfficialBucUserListAnnotation(groups = {S17.class})
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
    @NotNull(groups = {Sb19.class})
    @AclEnumAnnotation(scope = "TRANSFER_REVOKE,RESERVE,REVOKE", groups = {S19.class})
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
    private String publicAttri = "1";

    /**
     * quartz 表达式 生效时间
     *
     * 比如 * * 22-1 * * ? *
     * 表示每天22点至次日凌晨1:59:59点生效
     */
    @CronExpressionAnnotation(groups = {S2.class})
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

    public Integer getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Integer ownerUserId) {
        this.ownerUserId = ownerUserId;
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

    public List<Integer> getApproverUserIds() {
        return approverUserIds;
    }

    public void setApproverUserIds(List<Integer> approverUserIds) {
        this.approverUserIds = approverUserIds;
    }


    public String getRevokeRule() {
        return revokeRule;
    }

    public void setRevokeRule(String revokeRule) {
        this.revokeRule = revokeRule;
    }

    public Integer getMaxApplyDay() {
        return maxApplyDay;
    }

    public void setMaxApplyDay(Integer maxApplyDay) {
        this.maxApplyDay = maxApplyDay;
    }

    public boolean getIsData() {
        return isData;
    }

    public void setIsData(boolean isData) {
        this.isData = isData;
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
