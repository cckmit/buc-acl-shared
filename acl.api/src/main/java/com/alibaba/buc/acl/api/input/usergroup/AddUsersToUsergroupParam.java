package com.alibaba.buc.acl.api.input.usergroup;

import java.util.Date;
import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 添加用户到用户组的入参
 *
 * @author taigao
 */
public class AddUsersToUsergroupParam extends AclParam {

    private static final long serialVersionUID = 1508135524033294029L;

    /**
     * 用户组名
     */
    private String usergroupName;

    /**
     * 用户 userId 列表
     */
    private List<Integer> userIds;

    /**
     * 过期时间
     */
    private Date expiredDate;

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
