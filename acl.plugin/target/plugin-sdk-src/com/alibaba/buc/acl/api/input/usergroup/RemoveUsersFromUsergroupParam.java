package com.alibaba.buc.acl.api.input.usergroup;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 从用户组删除用户的入参
 *
 * @author taigao
 */
public class RemoveUsersFromUsergroupParam extends AclParam {

    private static final long serialVersionUID = -7068230715576112639L;

    /**
     * 用户组名
     */
    private String usergroupName;

    /**
     * 用户 userId 列表
     */
    private List<Integer> userIds;

    /**
     * 理由
     */
    private String reason;

    public String getUsergroupName() {
        return usergroupName;
    }

    public void setUsergroupName(String usergroupName) {
        this.usergroupName = usergroupName;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
