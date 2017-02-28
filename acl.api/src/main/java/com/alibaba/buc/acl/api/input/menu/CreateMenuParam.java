package com.alibaba.buc.acl.api.input.menu;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.ExistSize;
import com.alibaba.buc.acl.api.annotation.NameFormatAnnotation;
import com.alibaba.buc.acl.api.annotation.menu.MenuAlreadyExistAnnotation;
import com.alibaba.buc.acl.api.annotation.menu.MenuParentNameAnnotation;
import com.alibaba.buc.acl.api.annotation.menu.MenuPermissionAnnotation;
import com.alibaba.buc.acl.api.annotation.menu.UrlAlreadyExistAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S10;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.S4;
import com.alibaba.buc.acl.api.annotation.sequence.S5;
import com.alibaba.buc.acl.api.annotation.sequence.S6;
import com.alibaba.buc.acl.api.annotation.sequence.S7;
import com.alibaba.buc.acl.api.annotation.sequence.S9;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sa5;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb10;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.annotation.sequence.Sb5;
import com.alibaba.buc.acl.api.annotation.sequence.Sb6;
import com.alibaba.buc.acl.api.annotation.sequence.Sb9;
import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 创建菜单的入参
 *
 * @author taigao.wjj update 2015/12/03
 */


@GroupSequence(
        value = {
                Sb1.class,
                S1.class,
                Sa1.class,
                S2.class,
                Oper.class,
                Sb3.class,
                S3.class,
                S4.class,
                Sb5.class,
                Sa5.class,
                S5.class,
                Sb6.class,
                S6.class,
                S7.class,
                Sb9.class,
                S9.class,
                Sb10.class,
                S10.class,
                CreateMenuParam.class
        }
)
@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField="keyCenterAccessKey",
        interfaceNameField = "MenuService.createMenu",
        groups = {Sa1.class}
)


@MenuParentNameAnnotation(
        appKeyField = "accessKey",
        parentNameField = "parentName",
        groups = {S4.class}
)

@MenuAlreadyExistAnnotation(
        appKeyField = "accessKey",
        nameField = "name",
        groups = {S5.class}
)


@MenuPermissionAnnotation(
        appKeyField = "accessKey",
        permissionNameField = "permissionName",
        groups = {S7.class}
)

@UrlAlreadyExistAnnotation(
        appKeyField = "accessKey",
        urlField = "url",
        groups = {S9.class}
)
//并不需要验证这个对象是否为null, 框架do this.
public class CreateMenuParam extends AclParam {

    private static final long serialVersionUID = -4273288861491676786L;

    private String parentName;    //父菜单名称, 选填

    @NotNull(groups = {Sb5.class})
    @Size(min = 1, max = 200, groups = {S5.class})
    @NameFormatAnnotation(groups = {Sa5.class})
    private String name;    //菜单唯一标示, 必填

    @NotNull(groups = {Sb6.class})
    @Size(min = 1, max = 200, groups = {S6.class})
    private String title;  //菜单的title, 必填

    private String permissionName;  //关联权限名称, 选填

    private Integer sort;   //排序序号, 选填

    @ExistSize(min = 1, max = 500, groups = {Sb9.class})
    private String url;     //url, 选填

    @NotNull(groups = {Sb10.class})
    @Size(min = 1, max = 2000, groups = {S10.class})
    private String description; //描述, 必填                                             选填

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
