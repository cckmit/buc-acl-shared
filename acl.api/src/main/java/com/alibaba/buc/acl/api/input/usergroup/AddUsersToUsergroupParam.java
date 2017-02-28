package com.alibaba.buc.acl.api.input.usergroup;

import java.util.Date;
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
                AddUsersToUsergroupParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "UsergroupService.addUsersToUsergroup",
        groups = {Sa1.class}
)
public class AddUsersToUsergroupParam extends AclParam {

    private static final long serialVersionUID = 1508135524033294029L;

    @NotEmpty(groups = {Sb3.class})
    @MustExistInDbAnnotation(type = "usergroup", groups = {S3.class})
    private String usergroupName; // 用户组名

    @NotNull(groups = {Sb4.class})
    @BucUserWithWBListAnnotation(groups = {S4.class})
    private List<Integer> userIds; // 用户userId列表

    private Date expiredDate;

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

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
