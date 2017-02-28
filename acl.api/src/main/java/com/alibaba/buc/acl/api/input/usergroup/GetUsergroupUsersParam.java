package com.alibaba.buc.acl.api.input.usergroup;

import javax.validation.GroupSequence;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.MustExistInDbAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.common.AclParam;

/**
 * Created by baidian on 12/18/15.
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
                GetUsergroupUsersParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "UsergroupService.getUsergroupUsers",
        groups = {Sa1.class}
)
public class GetUsergroupUsersParam extends AclParam {

    private static final long serialVersionUID = 5404876725236625136L;

    @NotEmpty(groups = {Sb3.class})
    @MustExistInDbAnnotation(type = "usergroup", groups = {S3.class})
    private String usergroupName;   // 用户组英文名

    public String getUsergroupName() {
        return usergroupName;
    }

    public void setUsergroupName(String usergroupName) {
        this.usergroupName = usergroupName;
    }

}
