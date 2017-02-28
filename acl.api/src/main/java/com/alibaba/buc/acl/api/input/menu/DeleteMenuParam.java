package com.alibaba.buc.acl.api.input.menu;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.menu.MenuMustExistAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.S4;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.annotation.sequence.Sb4;
import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 删除菜单的入参
 *
 * @author taigao.wjj
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
            Sb4.class,
            S4.class,
            DeleteMenuParam.class
    }
)
@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField="keyCenterAccessKey",
        interfaceNameField = "MenuService.deleteMenu",
        groups = {Sa1.class}
)

@MenuMustExistAnnotation(
        appKeyField = "accessKey",
        nameField = "name",
        groups = {S4.class}
)
//并不需要验证这个对象是否为null, 框架do this.
public class DeleteMenuParam extends AclParam {

    private static final long serialVersionUID = -8344602082953638351L;

    @NotEmpty(groups = {Sb4.class})
    private String name;    //菜单唯一标示, 必填

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
