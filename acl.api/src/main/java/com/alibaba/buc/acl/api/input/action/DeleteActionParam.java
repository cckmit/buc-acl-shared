package com.alibaba.buc.acl.api.input.action;

import com.alibaba.buc.acl.api.common.AclParam;

public class DeleteActionParam extends AclParam {

    private static final long serialVersionUID = 7210772998685136122L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
