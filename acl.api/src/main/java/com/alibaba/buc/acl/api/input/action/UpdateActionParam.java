package com.alibaba.buc.acl.api.input.action;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.ExistSize;
import com.alibaba.buc.acl.api.annotation.action.ActionMustExistAnnotation;
import com.alibaba.buc.acl.api.annotation.action.ActionParentNameAnnotation;
import com.alibaba.buc.acl.api.annotation.menu.MenuPermissionAnnotation;
import com.alibaba.buc.acl.api.annotation.menu.UrlCanUpdateAnnotation;
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
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.annotation.sequence.Sb5;
import com.alibaba.buc.acl.api.annotation.sequence.Sb6;
import com.alibaba.buc.acl.api.annotation.sequence.Sb8;
import com.alibaba.buc.acl.api.annotation.sequence.Sb9;
import com.alibaba.buc.acl.api.common.AclParam;

import javax.validation.GroupSequence;

import org.hibernate.validator.constraints.NotEmpty;

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
                S5.class,
                Sb6.class,
                S6.class,
                S7.class,
                Sb8.class,
                S8.class,
                Sb9.class,
                S9.class,
                UpdateActionParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "ActionService.updateAction",
        groups = {Sa1.class}
)

@ActionMustExistAnnotation(
        appKeyField = "accessKey",
        nameField = "name",
        groups = {S3.class}
)

@UrlCanUpdateAnnotation(
        appKeyField = "accessKey",
        urlField = "pattern",
        nameField = "name",
        groups = {S6.class}
)

@ActionParentNameAnnotation(
        appKeyField = "accessKey",
        parentNameField = "parentActionName",
        groups = {Sb8.class}
)

@MenuPermissionAnnotation(
        appKeyField = "accessKey",
        permissionNameField = "permissionName",
        groups = {S8.class}
)

/**
 * Created by baidian on 12/14/15.
 */
public class UpdateActionParam extends AclParam {

    private static final long serialVersionUID = 3735300054394735178L;

    @NotEmpty(groups = {Sb3.class})
    private String name;

    @ExistSize(min = 1, max = 200, groups = {S4.class})
    private String title;

    @ExistSize(min = 1, max = 500, groups = {S5.class})
    private String pattern;

    @ExistSize(min = 1, max = 2000, groups = {S7.class})
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
