package com.alibaba.buc.acl.api.input.menu;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 创建菜单的入参
 *
 * @author taigao.wjj 2015/12/03
 */
public class CreateMenuParam extends AclParam {

    private static final long serialVersionUID = -4273288861491676786L;

    private String parentName;    //父菜单名称, 选填

    private String name;    //菜单唯一标示, 必填

    private String title;  //菜单的title, 必填

    private String permissionName;  //关联权限名称, 选填

    private Integer sort;   //排序序号, 选填

    private String url;     //url, 选填

    private String description; //描述, 必填

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
