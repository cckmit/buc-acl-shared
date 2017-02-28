package com.alibaba.buc.acl.api.input.check;

import java.util.List;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.ArrayNotNullAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.S4;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.common.AclParam;

@GroupSequence(
        value = {
                Sb1.class,
                S1.class,
                // Sa1.class,
                S2.class,
                // Oper.class,
                Sb3.class,
                S3.class,
                S4.class,
                CheckActionsParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "AccessControlService.checkActions",
        groups = {Sa1.class}
)

/**
 * Created by baidian on 12/14/15.
 */
public class CheckActionsParam extends AclParam {

    private static final long serialVersionUID = 6258761572451320217L;

    @NotNull(groups = {Sb3.class})
    // @BucUserAnnotation(groups = {S3.class})   //不需要
    private Integer userId; // UC中的userId

    @ArrayNotNullAnnotation(groups = {S4.class})
    private List<String> patterns; // URL列表

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<String> getPatterns() {
        return patterns;
    }

    public void setPatterns(List<String> patterns) {
        this.patterns = patterns;
    }

}
