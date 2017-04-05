package com.alibaba.buc.acl.api.input.permission;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 删除权限的入参
 *
 * @author taigao
 */
public class DeletePermissionParam extends AclParam {

	private static final long serialVersionUID = 4135372589910768550L;

    /**
     * 权限名称
     */
    private String            name;
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
