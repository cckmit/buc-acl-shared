package com.alibaba.buc.acl.api.input.usergroup;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

public class RemoveUsersFromUsergroupParam extends AclParam {

    private static final long serialVersionUID = -7068230715576112639L;

    private String usergroupName;   // 用户组名

    private List<Integer> userIds;  // 用户userId列表

    private String reason; // 理由

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
