package com.alibaba.buc.api.usergroup;

import com.alibaba.buc.api.common.AclParam;

import java.util.List;

/**
 * 用户组添加用户入参
 * <p/>
 * {@link com.alibaba.buc.api.UsergroupService#addUsersToUsergroup(AddUsersToUsergroupParam)}
 *
 * @author yicheng.wp
 */
public class AddUsersToUsergroupParam implements AclParam {

    private static final long serialVersionUID = -3012305906428201151L;

    private Integer principalUserId; // 接口操作主体，公共账号userId，须先授予公共账号接口操作权限，调用时会校验该公共账号是否拥权限（注意：不是当前登录人的userId）

    private String usergroupName; // 用户组名

    private List<Integer> userIds; // 用户userId列表

    private String reason; // 理由

    public Integer getPrincipalUserId() {
        return principalUserId;
    }

    public void setPrincipalUserId(Integer principalUserId) {
        this.principalUserId = principalUserId;
    }

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
