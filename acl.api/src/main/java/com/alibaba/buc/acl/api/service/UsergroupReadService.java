package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.usergroup.GetUsergroupParam;
import com.alibaba.buc.acl.api.input.usergroup.GetUsergroupUsersParam;
import com.alibaba.buc.acl.api.input.usergroup.SearchUsergroupParam;
import com.alibaba.buc.acl.api.output.usergroup.UsergroupResult;
import com.alibaba.buc.acl.api.output.usergroup.UsergroupUsersResult;
import com.alibaba.buc.api.common.AclPageResult;
import com.alibaba.buc.api.common.AclPagination;
import com.alibaba.buc.api.datapermission.result.DataPermissionModelResult;

/**
 * Usergroup Read Service
 */
public interface UsergroupReadService {

    UsergroupResult getUsergroup(GetUsergroupParam getUsergroupParam);

    UsergroupUsersResult getUsergroupUsers(GetUsergroupUsersParam getUsergroupUsersParam);

    AclResult<AclPageResult<UsergroupResult>> searchUsergroup(SearchUsergroupParam searchUsergroupParam, AclPagination page);
}
