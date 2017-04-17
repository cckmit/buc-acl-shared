package com.alibaba.buc.api.usergroup;

import com.alibaba.buc.api.common.AclParam;

/**
 * 查询用户组下的用户入参
 * <p/>
 * {@link com.alibaba.buc.api.UsergroupService#findUsergroupUsers(FindUsergroupUsersParam)}
 *
 * @author yicheng.wp
 */
public class FindUsergroupUsersParam implements AclParam {

    private static final long serialVersionUID = -5097833298331519589L;
    
    private String usergroupName; // 用户组英文名

    public String getUsergroupName() {
        return usergroupName;
    }

    public void setUsergroupName(String usergroupName) {
        this.usergroupName = usergroupName;
    }
}
