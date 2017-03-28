package com.alibaba.buc.acl.api.input.usergroup;

import com.alibaba.buc.acl.api.common.AclParam;

public class GetUsergroupParam extends AclParam {

    private static final long serialVersionUID = 3166459772329094478L;

    private String usergroupName;   // 用户组英文名

    public String getUsergroupName() {
        return usergroupName;
    }

    public void setUsergroupName(String usergroupName) {
        this.usergroupName = usergroupName;
    }

}
