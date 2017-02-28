package com.alibaba.buc.acl.api.input.usergroup;

import java.util.List;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.MustExistInDbAnnotation;
import com.alibaba.buc.acl.api.annotation.role.BucUserWithWBListAnnotation;
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
                Sb4.class,
                S4.class,
                RemoveUsersFromUsergroupParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "UsergroupService.removeUsersFromUsergroup",
        groups = {Sa1.class}
)
public class RemoveUsersFromUsergroupParam extends AclParam {

    private static final long serialVersionUID = -7068230715576112639L;

    @NotEmpty(groups = {Sb3.class})
    @MustExistInDbAnnotation(type = "usergroup", groups = {S3.class})
    private String usergroupName;   // 用户组名

    @NotNull(groups = {Sb4.class})
    @BucUserWithWBListAnnotation(groups = {S4.class})
    private List<Integer> userIds;  // 用户userId列表

    private String reason; // 理由

    public String getUsergroupName() {
        return usergroupName;
    }

    public void setUsergroupName(String usergroupName) {
        this.usergroupName = usergroupName;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
