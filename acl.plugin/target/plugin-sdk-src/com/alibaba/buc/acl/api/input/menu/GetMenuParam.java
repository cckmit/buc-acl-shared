package com.alibaba.buc.acl.api.input.menu;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 获取单个菜单的入参
 *
 * @author taigao.wjj
 */
public class GetMenuParam extends AclParam {

    private static final long serialVersionUID = 1069746530784792021L;

    /**
     * 菜单名，英文，唯一标识
     */
    private String name;

    /**
     * 菜单模式
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
