/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.param;

import java.io.Serializable;
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
     *  1 : 用户组，0： 岗位
     */
    private Integer  type = Integer.valueOf(1);

    /**
     * 权限回收策略（设置值请使用{@link RevokeRuleConstant}
     */
    private String revokeRule = RevokeRuleConstant.TRANSFER_REVOKE;

    /**
     * 是否要求用户组成员同一部门，开启会定时发邮件统计用户组的成员部门情况
     */
    private Boolean isMemberSameOrg = false;

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
}
