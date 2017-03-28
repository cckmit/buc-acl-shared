package com.alibaba.buc.acl.api.input.action;

import com.alibaba.buc.acl.api.common.AclParam;

public class GetActionParam extends AclParam {

    private static final long serialVersionUID = -8218944381893663085L;

    private String name;

    private String pattern;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

}
