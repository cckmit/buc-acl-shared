package com.alibaba.buc.acl.api.input.menu;

import javax.validation.GroupSequence;
import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.common.AclParam;

@GroupSequence(
        value = {
        		  Sb1.class,
                  S1.class,
                  Sa1.class,
                  S2.class,
                  Oper.class,
                  ListAppTreeMenuParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "MenuService.listAppTreeMenu",
        groups = {Sa1.class}
)


public class ListAppTreeMenuParam extends AclParam{
	

}
