package com.alibaba.buc.acl.api.input.usergroup;

import com.alibaba.buc.acl.api.common.AclParam;

public class GetUsergroupUsersParam extends AclParam {

    private static final long serialVersionUID = 5404876725236625136L;

    private String usergroupName;   // 用户组英文名

    public String getUsergroupName() {
        return usergroupName;
    }

    public void setUsergroupName(String usergroupName) {
        this.usergroupName = usergroupName;
    }

}
