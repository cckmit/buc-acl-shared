package com.alibaba.buc.acl.api.input.datapermission;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 封装数据权限模型更新相关信息
 *
 * @author tongxu 2016年9月1日 下午2:12:33
 */
@Deprecated
public class UpdateDataPermissionModelParam extends AclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 8996278238015120614L;
    
    /**
     * 英文名，定位要修改的数据权限模型的唯一标示符
     */
    private String name;

    /**
     * 中文名
     */
    private String title;
    
    /**
     * 描述
     */
    private String description;
    
    /**
     * 归属人id列表
     */
    private List<Integer> ownerIds;
    
    /**
     * 审批人id列表
     */
    private List<Integer> approverIds;
    
    /**
     * 数据风险等级，目前分l1,l2,l3,l4
     */
    private String level;
    
    /**
     * 权限回收策略
     */
    private String revokeRule;
    
    /**
     * 是否公开可申请(1.公开可申请2.公开不可申请3.不公开)
     */
    private String publicAttri;
    
    /**
     * 适用场景
     */
    private String suitScene;
    
    /**
     * 操作效果
     */
    private String operateEffect;
    
    /**
     * 包含的数据模型name
     */
    private String dataModelName;
    
    /**
     * 包含的操作name列表
     */
    private List<String> operationNameList;

    
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

    
    public List<Integer> getOwnerIds() {
        return ownerIds;
    }

    
    public void setOwnerIds(List<Integer> ownerIds) {
        this.ownerIds = ownerIds;
    }

    
    public List<Integer> getApproverIds() {
        return approverIds;
    }

    
    public void setApproverIds(List<Integer> approverIds) {
        this.approverIds = approverIds;
    }

    
    public String getLevel() {
        return level;
    }

    
    public void setLevel(String level) {
        this.level = level;
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

    
    public String getSuitScene() {
        return suitScene;
    }

    
    public void setSuitScene(String suitScene) {
        this.suitScene = suitScene;
    }

    
    public String getOperateEffect() {
        return operateEffect;
    }

    
    public void setOperateEffect(String operateEffect) {
        this.operateEffect = operateEffect;
    }

    
    public String getDataModelName() {
        return dataModelName;
    }

    
    public void setDataModelName(String dataModelName) {
        this.dataModelName = dataModelName;
    }

    
    public List<String> getOperationNameList() {
        return operationNameList;
    }

    
    public void setOperationNameList(List<String> operationNameList) {
        this.operationNameList = operationNameList;
    }
    
    
}
