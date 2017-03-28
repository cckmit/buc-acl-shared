package com.alibaba.buc.acl.api.input.role;

import com.alibaba.buc.acl.api.common.AclParam;


/**
 * 根据角色 name 来获取 角色包含数据权限模型的入参。
 *
 * @author tongxu 2016年4月25日 上午11:20:21
 */
public class PageRoleDataPermissionModelParam extends AclParam {

    private static final long serialVersionUID = 8544782005254653337L;

    /**
     * 角色名称
     */
    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
