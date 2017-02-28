package com.alibaba.buc.acl.api.output.usergroup;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclResult;

/**
 * Created by baidian on 12/18/15.
 */
public class UsergroupResult extends AclResult {
	
	private static final long serialVersionUID = -6034129264595073904L;

	private String usergroupName; // 用户组英文名 //如果此值为null,可以认为返回结果为null

    private String usergroupTitle; // 用户组中文标题

    private String usergroupDescription; // 用户组描述

    private List<Integer> usergroupAdminIdList; // 用户组管理员Id列表

	public String getUsergroupName() {
		return usergroupName;
	}

	public void setUsergroupName(String usergroupName) {
		this.usergroupName = usergroupName;
	}

	public String getUsergroupTitle() {
		return usergroupTitle;
	}

	public void setUsergroupTitle(String usergroupTitle) {
		this.usergroupTitle = usergroupTitle;
	}

	public String getUsergroupDescription() {
		return usergroupDescription;
	}

	public void setUsergroupDescription(String usergroupDescription) {
		this.usergroupDescription = usergroupDescription;
	}

	public List<Integer> getUsergroupAdminIdList() {
		return usergroupAdminIdList;
	}

	public void setUsergroupAdminIdList(List<Integer> usergroupAdminIdList) {
		this.usergroupAdminIdList = usergroupAdminIdList;
	}

}
