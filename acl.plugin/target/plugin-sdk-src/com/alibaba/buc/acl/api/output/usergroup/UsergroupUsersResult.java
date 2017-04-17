package com.alibaba.buc.acl.api.output.usergroup;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclResult;

/**
 * Created by baidian on 12/18/15.
 */
public class UsergroupUsersResult extends AclResult {
	
	private static final long serialVersionUID = 4835751991494602603L;
	
	private List<Integer> userIds; // 用户组下的用户userId列表

	public List<Integer> getUserIds() {
		return userIds;
	}

	public void setUserIds(List<Integer> userIds) {
		this.userIds = userIds;
	}

}
