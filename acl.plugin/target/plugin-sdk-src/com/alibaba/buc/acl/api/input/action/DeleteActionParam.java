package com.alibaba.buc.acl.api.input.action;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 删除 url 的入参
 *
 * @author baidian
 */
public class DeleteActionParam extends AclParam {

    private static final long serialVersionUID = 7210772998685136122L;

    /**
     * url 名称
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
