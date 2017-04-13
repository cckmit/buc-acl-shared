package com.alibaba.buc.api.usergroup;

import com.alibaba.buc.api.common.AclResult;

import java.util.List;

/**
 * 根据用户组名查询用户组出参
 * <p/>
 * {@link com.alibaba.buc.api.UsergroupService#getUsergroup(GetUsergroupParam)}
 *
 * @author yicheng.wp
 */
public class UsergroupResult implements AclResult {

    private static final long serialVersionUID = -5318534917662370642L;

    private String usergroupName; // 用户组英文名

    private String usergroupTitle; // 用户组中文标题

    private String usergroupDescription; // 用户组描述

    private List<Integer> usergroupAdminIdList; // 用户组管理员Id列表

    public String getUsergroupName() {
        return usergroupName;
    }

    public void setUsergroupName(String usergroupName) {
        this.usergroupName = usergroupName;
    }

    public String getUsergroupTitle() {
        return usergroupTitle;
    }

    public void setUsergroupTitle(String usergroupTitle) {
        this.usergroupTitle = usergroupTitle;
    }

    public String getUsergroupDescription() {
        return usergroupDescription;
    }

    public void setUsergroupDescription(String usergroupDescription) {
        this.usergroupDescription = usergroupDescription;
    }

    public List<Integer> getUsergroupAdminIdList() {
        return usergroupAdminIdList;
    }

    public void setUsergroupAdminIdList(List<Integer> usergroupAdminIdList) {
        this.usergroupAdminIdList = usergroupAdminIdList;
    }
}
