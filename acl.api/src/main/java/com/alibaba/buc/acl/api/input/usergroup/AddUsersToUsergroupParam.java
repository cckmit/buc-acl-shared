package com.alibaba.buc.acl.api.input.usergroup;

import java.util.Date;
import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

public class AddUsersToUsergroupParam extends AclParam {

    private static final long serialVersionUID = 1508135524033294029L;

    private String usergroupName; // 用户组名

    private List<Integer> userIds; // 用户userId列表

    private Date expiredDate;

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

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
