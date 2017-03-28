package com.alibaba.buc.acl.api.input.menu;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 删除菜单的入参
 *
 * @author taigao.wjj
 */
public class DeleteMenuParam extends AclParam {

    private static final long serialVersionUID = -8344602082953638351L;

    private String name;    //菜单唯一标示, 必填

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
