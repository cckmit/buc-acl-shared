package com.alibaba.buc.acl.api.input.role;

import com.alibaba.buc.acl.api.common.AclParam;


/**
 * 根据角色 name 来获取 单个角色的入参。
 *
 * @author taigao.wjj 2014-12-30 上午10:02:39
 */
public class GetRoleParam extends AclParam {

    private static final long serialVersionUID = 8544782005254653337L;

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
