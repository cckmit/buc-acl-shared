package com.alibaba.buc.acl.api.input.user;

import javax.validation.GroupSequence;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.MustExistInDbAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.S4;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb4;
import com.alibaba.buc.acl.api.common.AclParam;

/**
 * @author taigao.wjj
 */
@GroupSequence(
        value = {
                Sb1.class,
                S1.class,
                Sa1.class,
                S2.class,
                Oper.class,
                S3.class,
                Sb4.class,
                S4.class,
                FindUsersParam.class
        }
)
@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "UserService.findUsersByDepIdAndRoleName",
        groups = {Sa1.class}
)
public class FindUsersParam extends AclParam {

    private static final long serialVersionUID = 8547270628295040015L;

    @NotEmpty(groups = {S3.class})
    private String depId;

    @NotEmpty(groups = {Sb4.class})
    @MustExistInDbAnnotation(type = "role", groups = {S4.class})
    private String roleName;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
