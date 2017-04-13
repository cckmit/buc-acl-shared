package com.alibaba.buc.acl.api.output.action;

import com.alibaba.buc.acl.api.common.AclResult;

/**
 * Created by baidian on 12/14/15.
 */
public class ActionResult extends AclResult {

    private static final long serialVersionUID = 9006766392165107115L;

    /**
     * 应用名称
     * 如果此值为null,可以认为返回结果为null
     */
    private String appName;

    /**
     * url name
     */
    private String name;

    /**
     * url title
     */
    private String title;

    /**
     * url 模式
     * for example : https://www.tmall.com
     */
    private String pattern;

    /**
     * url 序号
     */
    private Integer sort;

    /**
     * url  描述
     */
    private String description;

    /**
     * 父亲url name
     */
    private String parentActionName;

    /**
     * url 关联权限 name
     */
    private String permissionName;

    public ActionResult(String appName, String name, String title, String pattern,
                        Integer sort, String description,
                        String parentActionName, String permissionName) {
        this.appName = appName;
        this.name = name;
        this.title = title;
        this.pattern = pattern;
        this.sort = sort;
        this.description = description;
        this.parentActionName = parentActionName;
        this.permissionName = permissionName;
    }

    public ActionResult() {
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

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
