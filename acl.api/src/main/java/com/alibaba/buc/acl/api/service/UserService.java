package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.input.user.FindUsersParam;
import com.alibaba.buc.acl.api.output.user.FindUsersResult;

public interface UserService {
	
	//查询某个部门下面拥有某个角色的人员, 查询的是人和角色的直接关系,部门也是
	//本部门，不支持部门上下级的关系。
	FindUsersResult findUsersByDepIdAndRoleName(FindUsersParam param);
	
	 
}
