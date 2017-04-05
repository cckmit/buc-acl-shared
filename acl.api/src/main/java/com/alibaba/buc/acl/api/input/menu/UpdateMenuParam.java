package com.alibaba.buc.acl.api.input.menu;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 更新菜单的入参
 *
 * @author taigao.wjj
 */
public class UpdateMenuParam extends AclParam {

    private static final long serialVersionUID = 6848568153409681830L;

    /**
     * 父菜单名称, 选填
     * 填写不存在的 menu name 是表示去掉父菜单
     * 填 null 不修改
     */
    private String parentName;

    /**
     * 菜单唯一标示, 必填
     */
    private String name;

    /**
     * 菜单的title, 选填
     */
    private String title;

    /**
     * 关联权限名称,选填
     * 填写不存在的权限名, 表示去掉
     * 填 null 不修改
     */
    private String permissionName;

    /**
     * 排序序号, 选填
     */
    private Integer sort;

    /**
     * url, 选填
     */
    private String url;

    /**
     * 描述, 选填
     */
    private String description;

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
