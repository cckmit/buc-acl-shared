package com.alibaba.buc.acl.api.input.role;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.GroupSequence;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.buc.acl.api.annotation.AclEnumAnnotation;
import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.ExistSize;
import com.alibaba.buc.acl.api.annotation.MustExistInDbAnnotation;
import com.alibaba.buc.acl.api.annotation.OfficialBucUserSingleAnnotation;
import com.alibaba.buc.acl.api.annotation.role.OfficialBucUserListAnnotation;
import com.alibaba.buc.acl.api.annotation.role.UserOrgBindingAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S10;
import com.alibaba.buc.acl.api.annotation.sequence.S12;
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
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.common.AclParam;


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
                S5.class,
                S6.class,
                S7.class,
                S8.class,
                S9.class,
                S10.class,
                S12.class,
                UpdateRoleParam.class
        }
)
@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "RoleService.updateRole",
        groups = {Sa1.class}
)

@UserOrgBindingAnnotation(
        ruleTypeField = "ruleType",
        extentionMapField = "extentionMap",
        groups = {S9.class}
)

public class UpdateRoleParam extends AclParam {

    private static final long serialVersionUID = 7115082483567508273L;

    /**
     * 英文名，必选
     */
    @NotEmpty(groups = {Sb3.class})
    @MustExistInDbAnnotation(type = "role", groups = {S3.class})
    private String name;

    /**
     * 角色中文标题，必选
     */
    @ExistSize(min = 1, max = 200, groups = {S4.class})
    private String title;

    /**
     * 角色描述，必选
     */
    @ExistSize(min = 1, max = 2000, groups = {S5.class})
    private String description;

    /**
     * 角色归属人的用户id，角色Owner，必选，角色Owner将作为权限申请流程中的审批人，如果归属人离职、转岗，请重新设置
     */
    @OfficialBucUserSingleAnnotation(groups = {S6.class}, type = "update")
    private Integer ownerUserId;

    /**
     * 权限审批规则类型
     * <ul>
     * <li>random：随机取审批人之一</li>
     * <li>self：用户申请该权限时自行选择审批人</li>
     * <li>org:按部门审批</li>
     * </ul>
     */
    @AclEnumAnnotation(scope = "random,self,org", groups = {S7.class})
    private String ruleType = "random";

    /**
     * 审批人
     * <p>
     * 当ruleType为randow，self，parallel时，取审批人为approverUserIds的值。当ruleType为org时，不从approverUserIds取值。
     * </p>
     */
    @OfficialBucUserListAnnotation(groups = {S8.class})
    private List<Integer> approverUserIds = new ArrayList<Integer>(8);

    /**
     * 角色关联的数据权限模型name列表，已废弃，关联使用 dataPermissionModelNameMap
     */
    @Deprecated
    private List<String> dataPermissionModelNameList;

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

    @AclEnumAnnotation(scope = "TRANSFER_REVOKE,RESERVE,REVOKE", groups = {S10.class})
    private String revokeRule;

    /**
     * 是否数据权限角色，是数据权限角色为true，不是为false，只有数据权限应用需要使用到此属性
     * <p/>
     * 需要使用的用户最好找acl值班人员确认使用逻辑、影响，乱设可能导致验权不通过等问题
     * <p/>
     * 默认为功能权限，即false
     */
    private boolean isData = false;

    /**
     * 关联的数据权限模型map，key是模型name，
     * <p/>
     * value指定是否在授权和申请角色的时候一定要同时授予和申请模型对应的数据权限,true为必须，false不必须
     */
    private Map<String, Boolean> dataPermissionModelNameMap;

    /**
     * 角色指定的风险等级，角色的风险等级展示--> assignLevel 优先于 level
     */
//    @AclEnumAnnotation(scope="L,M,H",groups ={S12.class})
//    private String assignLevel ;

    /**
     * 1.公开可申请
     * 2.公开不可申请
     * 3.不公开
     */
    private String publicAttri;

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

    public Integer getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Integer ownerUserId) {
        this.ownerUserId = ownerUserId;
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

    public List<String> getDataPermissionModelNameList() {
        return dataPermissionModelNameList;
    }

    public void setDataPermissionModelNameList(List<String> dataPermissionModelNameList) {
        this.dataPermissionModelNameList = dataPermissionModelNameList;
    }

    public Map<String, Boolean> getDataPermissionModelNameMap() {
        return dataPermissionModelNameMap;
    }

    public void setDataPermissionModelNameMap(Map<String, Boolean> dataPermissionModelNameMap) {
        this.dataPermissionModelNameMap = dataPermissionModelNameMap;
    }

    public String getPublicAttri() {
        return publicAttri;
    }

    public void setPublicAttri(String publicAttri) {
        this.publicAttri = publicAttri;
    }

//	public String getAssignLevel() {
//		return assignLevel;
//	}
//
//
//	public void setAssignLevel(String assignLevel) {
//		this.assignLevel = assignLevel;
//	}

}
    
    
    
	