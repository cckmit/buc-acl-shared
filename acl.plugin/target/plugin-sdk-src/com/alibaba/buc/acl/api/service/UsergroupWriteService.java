package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.usergroup.AddUsersToUsergroupParam;
import com.alibaba.buc.acl.api.input.usergroup.CreateUsergroupParam;
import com.alibaba.buc.acl.api.input.usergroup.RemoveUsersFromUsergroupParam;

/**
 * Usergroup Write Service
 */
public interface UsergroupWriteService {

    AclResult createUsergroup(CreateUsergroupParam createUsergroupParam);

    AclResult addUsersToUsergroup(AddUsersToUsergroupParam addUsersToUsergroupParam);

    AclResult removeUsersFromUsergroup(RemoveUsersFromUsergroupParam removeUsersFromUsergroupParam);
}
