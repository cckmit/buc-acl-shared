/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.param;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author juan.dengj 2013-8-29 下午4:43:46
 */
public class UsergroupParam implements Serializable {

    private static final long serialVersionUID = 7403710596215582557L;

    /*
     * 用户组英文名
     */
    private String            name;

    /*
     * 用户组中文名
     */
    private String            title;

    /*
     * 用户组描述
     */
    private String            description;

    /*
     * 用户组管理员的userId
     */
    private List<String>      adminUserIds;
    
    /**
     * 是否通知管理员
     */
    private boolean isNotify = true;
    
    /**
     * 适用范围
     */
    private List<String> orgIds;
    
    /**
     * 1 : 用户组, 2 : 岗位, 3 : 外包, 4 : 项目, 5 : 登录 (默认是1)
     */
    private Integer  type = 1;

    /**
     * 权限回收策略（设置值请使用{@link RevokeRuleConstant}
     */
    private String revokeRule = RevokeRuleConstant.TRANSFER_REVOKE;

    /**
     * 是否要求用户组成员同一部门，开启会定时发邮件统计用户组的成员部门情况
     */
    private Boolean isMemberSameOrg = false;

    /**
     * 当组权限闲置时通知管理员
     */
    private Boolean isElementIdleNotify = false;

    /**
     * 当组权限闲置时自动移出
     */
    private Boolean isElementIdleRemove = false;

    /**
     * 当组权限闲置时自动冻结
     */
    private Boolean isElementIdleFreeze = false;

    /**
     * 当组成员闲置时通知管理员
     */
    private Boolean isMemberIdleNotify = false;

    /**
     * 当组成员限闲置时自动移出
     */
    private Boolean isMemberIdleRemove = false;

    /**
     * 如果是type = 4 必填, 项目有效期
     */
    private Date expireDate;

    /**
     * 如果是type = 4 必填, 自动解散用户组
     */
    private Boolean isAutoDisbandUsergroup = false;

    /**
     * 如果是type = 4 必填, 提前3天通知管理员
     */
    private Boolean isExpirationNotify = false;

    /**
     * 如果是type = 3 必填, 项目信息
     */
    private List<String> projectIds;

    /**
     * 如果是type = 3 非必填, 用户组子管理员的 userId
     */
    private List<Integer> subAdminUserIds;

    /**
     * 如果是type = 3 必填, 用户组子管理员是否可以管理组成员
     */
    private Boolean isSubManageUser = false;

    /**
     * 如果是type = 3 必填, 用户组子管理员是否可以管理组权限
     */
    private Boolean isSubManageElement = false;

    /**
     * 如果是type = 3 或者 2 非必填, 职位描述
     */
    private List<String> jobIds;

    /**
     * 如果是type = 3 或者 2 必填, 当用户与用户组不匹配时通知
     */
    private Boolean isMismatchNotify= false;

    /**
     * 如果是type = 3 或者 2 必填, 当用户与用户组不匹配时自动移出
     */
    private Boolean isMismatchRemoveUser = false;

    /**
     * 如果是type = 3 或者 2 必填, 当用户符合岗位时通知
     */
    private Boolean isNewNotify = false;

    /**
     * 如果是type = 3 或者 2 必填, 当用户符合岗位时自动加入
     */
    private Boolean isNewJoin = false;

    /**
     * 如果是type = 2 必填, type = 3, 非必填 用户组关联岗位
     */
    private List<Integer> relateOrgIds;

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

    public List<String> getAdminUserIds() {
        return adminUserIds;
    }

    public void setAdminUserIds(List<String> adminUserIds) {
        this.adminUserIds = adminUserIds;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public boolean isNotify() {
        return isNotify;
    }

    public void setNotify(boolean isNotify) {
        this.isNotify = isNotify;
    }

	public List<String> getOrgIds() {
		return orgIds;
	}

	public void setOrgIds(List<String> orgIds) {
		this.orgIds = orgIds;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

    public String getRevokeRule() {
        return revokeRule;
    }

    public void setRevokeRule(String revokeRule) {
        this.revokeRule = revokeRule;
    }

    public Boolean getIsMemberSameOrg() {
        return isMemberSameOrg;
    }

    public void setIsMemberSameOrg(Boolean isMemberSameOrg) {
        this.isMemberSameOrg = isMemberSameOrg;
    }

    public Boolean getIsElementIdleNotify() {
        return isElementIdleNotify;
    }

    public void setIsElementIdleNotify(Boolean isElementIdleNotify) {
        this.isElementIdleNotify = isElementIdleNotify;
    }

    public Boolean getIsElementIdleRemove() {
        return isElementIdleRemove;
    }

    public void setIsElementIdleRemove(Boolean isElementIdleRemove) {
        this.isElementIdleRemove = isElementIdleRemove;
    }

    public Boolean getIsMemberIdleNotify() {
        return isMemberIdleNotify;
    }

    public void setIsMemberIdleNotify(Boolean isMemberIdleNotify) {
        this.isMemberIdleNotify = isMemberIdleNotify;
    }

    public Boolean getIsMemberIdleRemove() {
        return isMemberIdleRemove;
    }

    public void setIsMemberIdleRemove(Boolean isMemberIdleRemove) {
        this.isMemberIdleRemove = isMemberIdleRemove;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Boolean getIsAutoDisbandUsergroup() {
        return isAutoDisbandUsergroup;
    }

    public void setIsAutoDisbandUsergroup(Boolean isAutoDisbandUsergroup) {
        this.isAutoDisbandUsergroup = isAutoDisbandUsergroup;
    }

    public Boolean getIsExpirationNotify() {
        return isExpirationNotify;
    }

    public void setIsExpirationNotify(Boolean isExpirationNotify) {
        this.isExpirationNotify = isExpirationNotify;
    }

    public List<String> getProjectIds() {
        return projectIds;
    }

    public void setProjectIds(List<String> projectIds) {
        this.projectIds = projectIds;
    }

    public List<Integer> getSubAdminUserIds() {
        return subAdminUserIds;
    }

    public void setSubAdminUserIds(List<Integer> subAdminUserIds) {
        this.subAdminUserIds = subAdminUserIds;
    }

    public Boolean getIsSubManageUser() {
        return isSubManageUser;
    }

    public void setIsSubManageUser(Boolean isSubManageUser) {
        this.isSubManageUser = isSubManageUser;
    }

    public Boolean getIsSubManageElement() {
        return isSubManageElement;
    }

    public void setIsSubManageElement(Boolean isSubManageElement) {
        this.isSubManageElement = isSubManageElement;
    }

    public List<String> getJobIds() {
        return jobIds;
    }

    public void setJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
    }

    public Boolean getIsMismatchNotify() {
        return isMismatchNotify;
    }

    public void setIsMismatchNotify(Boolean isMismatchNotify) {
        this.isMismatchNotify = isMismatchNotify;
    }

    public Boolean getIsMismatchRemoveUser() {
        return isMismatchRemoveUser;
    }

    public void setIsMismatchRemoveUser(Boolean isMismatchRemoveUser) {
        this.isMismatchRemoveUser = isMismatchRemoveUser;
    }

    public Boolean getIsNewNotify() {
        return isNewNotify;
    }

    public void setIsNewNotify(Boolean isNewNotify) {
        this.isNewNotify = isNewNotify;
    }

    public Boolean getIsNewJoin() {
        return isNewJoin;
    }

    public void setIsNewJoin(Boolean isNewJoin) {
        this.isNewJoin = isNewJoin;
    }

    public List<Integer> getRelateOrgIds() {
        return relateOrgIds;
    }

    public void setRelateOrgIds(List<Integer> relateOrgIds) {
        this.relateOrgIds = relateOrgIds;
    }

    public Boolean getIsElementIdleFreeze() {
        return isElementIdleFreeze;
    }

    public void setIsElementIdleFreeze(Boolean isElementIdleFreeze) {
        this.isElementIdleFreeze = isElementIdleFreeze;
    }
}
