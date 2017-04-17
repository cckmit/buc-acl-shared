package com.alibaba.buc.acl.api.input.user;

import com.alibaba.buc.acl.api.common.AclParam;

public class FindUsersParam extends AclParam {

    private static final long serialVersionUID = 8547270628295040015L;

    private String depId;

    private String roleName;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
