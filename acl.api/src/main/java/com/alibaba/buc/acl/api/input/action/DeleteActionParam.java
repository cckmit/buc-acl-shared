package com.alibaba.buc.acl.api.input.action;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.action.ActionMustExistAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
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
                DeleteActionParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "ActionService.deleteAction",
        groups = {Sa1.class}
)


@ActionMustExistAnnotation(
        appKeyField = "accessKey",
        nameField = "name",
        type = "action",
        groups = {S3.class}
)

/**
 * Created by baidian on 12/14/15.
 */
public class DeleteActionParam extends AclParam {

    private static final long serialVersionUID = 7210772998685136122L;

    @NotEmpty(groups = {Sb3.class})
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
