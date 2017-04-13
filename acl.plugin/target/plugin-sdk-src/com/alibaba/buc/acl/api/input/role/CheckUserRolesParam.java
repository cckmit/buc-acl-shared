package com.alibaba.buc.acl.api.input.role;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

public class CheckUserRolesParam extends AclParam {

    private static final long serialVersionUID = -3345139065164912413L;

    private Integer userId;

    private List<String> roleNames;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<String> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
    }

}
