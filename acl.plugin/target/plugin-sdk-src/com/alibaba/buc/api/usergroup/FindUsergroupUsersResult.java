package com.alibaba.buc.api.usergroup;

import com.alibaba.buc.api.common.AclResult;

import java.util.List;

/**
 * 查询用户组下的用户出参
 * <p/>
 * {@link com.alibaba.buc.api.UsergroupService#findUsergroupUsers(FindUsergroupUsersParam)}
 *
 * @author yicheng.wp
 */
public class FindUsergroupUsersResult implements AclResult {

    private static final long serialVersionUID = -8550408835159480986L;

    private List<Integer> userIds; // 用户组下的用户userId列表

    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }
}
