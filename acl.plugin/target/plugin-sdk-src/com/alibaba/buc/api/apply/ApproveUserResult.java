package com.alibaba.buc.api.apply;

import com.alibaba.buc.api.common.AclResult;

import java.util.List;

/**
 * 审批人
 *
 * @author yicheng.wp
 */
public class ApproveUserResult implements AclResult {

    private static final long serialVersionUID = -1278759445477757845L;

    private String roleName;// 角色英文名

    private List<Integer> userIds; // 审批人 userId 列表

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }
}
