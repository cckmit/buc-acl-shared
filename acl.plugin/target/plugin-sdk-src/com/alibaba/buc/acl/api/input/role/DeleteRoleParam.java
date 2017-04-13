package com.alibaba.buc.acl.api.input.role;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 删除角色的入参
 *
 * @author taigao
 */
public class DeleteRoleParam extends AclParam {

    private static final long serialVersionUID = -1470681457235511451L;

    /**
     * 角色名称
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
