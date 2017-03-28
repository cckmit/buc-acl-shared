package com.alibaba.buc.acl.api.input.role;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.buc.acl.api.common.AclParam;

public class UpdateRoleParam extends AclParam {

    private static final long serialVersionUID = 7115082483567508273L;

    /**
     * 英文名，必选
     */
    private String name;

    /**
     * 角色中文标题，必选
     */
    private String title;

    /**
     * 角色描述，必选
     */
    private String description;

    /**
     * 角色归属人的用户id，角色Owner，必选，角色Owner将作为权限申请流程中的审批人，如果归属人离职、转岗，请重新设置
     */
    private Integer ownerUserId;

    /**
     * 权限审批规则类型
     * <ul>
     * <li>random：随机取审批人之一</li>
     * <li>self：用户申请该权限时自行选择审批人</li>
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
}
    
    
    
	