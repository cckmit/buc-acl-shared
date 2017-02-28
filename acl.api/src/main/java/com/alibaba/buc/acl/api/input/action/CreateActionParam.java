package com.alibaba.buc.acl.api.input.action;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.ExistSize;
import com.alibaba.buc.acl.api.annotation.NameFormatAnnotation;
import com.alibaba.buc.acl.api.annotation.action.ActionAlreadyExistAnnotation;
import com.alibaba.buc.acl.api.annotation.action.ActionParentNameAnnotation;
import com.alibaba.buc.acl.api.annotation.action.PatternAlreadyExistAnnotation;
import com.alibaba.buc.acl.api.annotation.menu.MenuPermissionAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.S4;
import com.alibaba.buc.acl.api.annotation.sequence.S5;
import com.alibaba.buc.acl.api.annotation.sequence.S6;
import com.alibaba.buc.acl.api.annotation.sequence.S7;
import com.alibaba.buc.acl.api.annotation.sequence.S8;
import com.alibaba.buc.acl.api.annotation.sequence.S9;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sa3;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.annotation.sequence.Sb5;
import com.alibaba.buc.acl.api.annotation.sequence.Sb6;
import com.alibaba.buc.acl.api.annotation.sequence.Sb8;
import com.alibaba.buc.acl.api.annotation.sequence.Sb9;
import com.alibaba.buc.acl.api.common.AclParam;

@GroupSequence(
        value = {
                Sb1.class,
                S1.class,
                Sa1.class,
                S2.class,
                Oper.class,
                Sb3.class,
                S3.class,
                Sa3.class,
                S4.class,
                Sb5.class,
                S5.class,
                Sb6.class,
                S6.class,
                S7.class,
                Sb8.class,
                S8.class,
                Sb9.class,
                S9.class,
                CreateActionParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "ActionService.createAction",
        groups = {Sa1.class}
)

@ActionAlreadyExistAnnotation(
        appKeyField = "accessKey",
        nameField = "name",
        groups = {S4.class}
)

@PatternAlreadyExistAnnotation(
        appKeyField = "accessKey",
        urlField = "pattern",
        type = "pattern",
        groups = {S6.class}
)

@ActionParentNameAnnotation(
        appKeyField = "accessKey",
        parentNameField = "parentActionName",
        groups = {S8.class}
)

@MenuPermissionAnnotation(
        appKeyField = "accessKey",
        permissionNameField = "permissionName",
        groups = {Sb9.class}
)

/**
 * 创建 url 的入参
 *
 * Created by baidian on 12/14/15.
 */
public class CreateActionParam extends AclParam {

    private static final long serialVersionUID = 4303167904212188154L;

    @NotNull(groups = {Sb3.class})
    @Size(min = 1, max = 200, groups = {S3.class})
    @NameFormatAnnotation(groups = {Sa3.class})
    private String name;

    @NotNull(groups = {Sb5.class})
    @Size(min = 1, max = 200, groups = {S5.class})
    private String title;

    @ExistSize(min = 1, max = 500, groups = {Sb6.class})
    private String pattern;

    @NotNull(groups = {S7.class})
    @Size(min = 1, max = 2000, groups = {Sb8.class})
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
