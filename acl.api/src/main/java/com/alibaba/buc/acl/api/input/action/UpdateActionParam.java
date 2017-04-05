package com.alibaba.buc.acl.api.input.action;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 更新 url 的入参
 *
 * @author baidian
 */
public class UpdateActionParam extends AclParam {

    private static final long serialVersionUID = 3735300054394735178L;

    /**
     * url 名称
     */
    private String name;

    /**
     * url 标题
     */
    private String title;

    /**
     * url 模式
     * 例如：/apply/permission.htm
     */
    private String pattern;

    /**
     * url 描述
     */
    private String description;

    /**
     * 父 url 名称
     */
    private String parentActionName;

    /**
     * 关联权限名
     */
    private String permissionName;

    /**
     * 排序
     */
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
