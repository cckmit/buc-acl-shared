package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.input.usergroup.GetUsergroupParam;
import com.alibaba.buc.acl.api.input.usergroup.GetUsergroupUsersParam;
import com.alibaba.buc.acl.api.output.usergroup.UsergroupResult;
import com.alibaba.buc.acl.api.output.usergroup.UsergroupUsersResult;

/**
 * Usergroup Read Service
 */
public interface UsergroupReadService {

    UsergroupResult getUsergroup(GetUsergroupParam getUsergroupParam);

    UsergroupUsersResult getUsergroupUsers(GetUsergroupUsersParam getUsergroupUsersParam);
}
