package com.alibaba.buc.acl.api.input.action;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.ExistSize;
import com.alibaba.buc.acl.api.annotation.action.AtLeastExistOneAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.S4;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.common.AclParam;

import javax.validation.GroupSequence;

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
                GetActionParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField="keyCenterAccessKey",
        interfaceNameField = "ActionService.getAction",
        groups = {Sa1.class}
)

@AtLeastExistOneAnnotation(
        firstField = "name",
        secondField = "pattern",
        groups = {S4.class}
)

/**
 * Created by baidian on 12/14/15.
 */
public class GetActionParam extends AclParam {

    private static final long serialVersionUID = -8218944381893663085L;

    @ExistSize(min = 1, max = 200, groups = {Sb3.class})
    private String name;

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
