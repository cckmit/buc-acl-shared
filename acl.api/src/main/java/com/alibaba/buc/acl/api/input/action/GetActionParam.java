package com.alibaba.buc.acl.api.input.action;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 获取 url 的入参
 *
 * @author baidian
 */
public class GetActionParam extends AclParam {

    private static final long serialVersionUID = -8218944381893663085L;

    /**
     * url 名称
     */
    private String name;

    /**
     * url 模式
     * 例如：/apply/permission.htm
     */
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
