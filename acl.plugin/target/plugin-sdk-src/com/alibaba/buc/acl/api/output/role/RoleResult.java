package com.alibaba.buc.acl.api.output.role;

import com.alibaba.buc.acl.api.common.AclResult;

public class RoleResult extends AclResult {

    private static final long serialVersionUID = -5152728005856063940L;

    private Integer id; //id
    private String name;    //code //如果此值为null,可以认为返回结果为null
    private String title;   // title
    private Boolean isSystem;   // 类型
    private String description; //描述
    private String revokeRule;
    private String type;    //single, multi
    private String domainName;
    private String status;  // A:有效状态, E 过期冻结， M 手动冻结
    private String isActive;    // 1:有效， 0 无效
    private String maxExpireDate;   //最大申请日期。

    private Boolean isData;

    private String level;                   //自动计算出来的role's level

    private String assignLevel;       //指定的角色的level， 优先级高于 level.

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRevokeRule() {
        return revokeRule;
    }

    public void setRevokeRule(String revokeRule) {
        this.revokeRule = revokeRule;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getMaxExpireDate() {
        return maxExpireDate;
    }

    public void setMaxExpireDate(String maxExpireDate) {
        this.maxExpireDate = maxExpireDate;
    }

    public Boolean getIsData() {
        return isData;
    }

    public void setIsData(Boolean isData) {
        this.isData = isData;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAssignLevel() {
        return assignLevel;
    }

    public void setAssignLevel(String assignLevel) {
        this.assignLevel = assignLevel;
    }

}
