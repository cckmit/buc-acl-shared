package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.input.user.FindUsersParam;
import com.alibaba.buc.acl.api.output.user.FindUsersResult;

public interface UserService {

	/**
	 * 已废弃，请勿调用
	 */
	@Deprecated
	FindUsersResult findUsersByDepIdAndRoleName(FindUsersParam param);
	
	 
}
