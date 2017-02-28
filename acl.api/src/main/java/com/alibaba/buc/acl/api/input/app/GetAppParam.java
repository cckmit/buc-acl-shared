package com.alibaba.buc.acl.api.input.app;

import javax.validation.GroupSequence;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.common.AclParam;

/**
 * @author baidian.zc
 * @author taigao.wjj update 2015/12/03
 */

@GroupSequence(
        value = {
                Sb1.class,
                S1.class,
                S2.class,
                S3.class,
                GetAppParam.class
        }
)
public class GetAppParam extends AclParam {

    private static final long serialVersionUID = 6193356594476111706L;

    // 应用名, 英文
    @NotEmpty(groups = {S3.class})
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
