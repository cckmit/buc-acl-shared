package com.alibaba.buc.acl.api.input.action;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 创建 url 的入参
 *
 * Created by baidian on 12/14/15.
 */
public class CreateActionParam extends AclParam {

    private static final long serialVersionUID = 4303167904212188154L;

    private String name;

    private String title;

    private String pattern;

    private String description;

    private String parentActionName;

    private String permissionName;

    private Integer sort;

    public String getParentActionName() {
        return parentActionName;
    }

    public void setParentActionName(String parentActionName) {
        this.parentActionName = parentActionName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
