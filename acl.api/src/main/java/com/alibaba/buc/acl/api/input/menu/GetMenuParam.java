package com.alibaba.buc.acl.api.input.menu;

import javax.validation.GroupSequence;

import com.alibaba.buc.acl.api.annotation.ExistSize;
import com.alibaba.buc.acl.api.annotation.action.AtLeastExistOneAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.S4;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.common.AclParam;


/**
 * 获取单个菜单的入参
 *
 * @author taigao.wjj
 */
@GroupSequence(
        value = {
                Sb1.class,
                S2.class,
                Oper.class,
                Sb3.class,
                S3.class,
                S4.class,
                GetMenuParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "MenuService.getMenu",
        groups = {Sa1.class}
)

@AtLeastExistOneAnnotation(
        firstField = "name",
        secondField = "pattern",
        groups = {S4.class}
)

public class GetMenuParam extends AclParam {

    private static final long serialVersionUID = 1069746530784792021L;

    @ExistSize(min = 1, max = 200, groups = {Sb3.class})
    private String name;    //菜单唯一标示

    @ExistSize(min = 1, max = 500, groups = {S3.class})
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
