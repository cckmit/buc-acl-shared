package com.alibaba.buc.acl.api.input.menu;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;

import com.alibaba.buc.acl.api.annotation.BucUserAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.S3;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb3;
import com.alibaba.buc.acl.api.common.AclParam;

/**
 * List菜单的入参
 *
 * @author taigao.wjj update 2015/12/03
 */
@GroupSequence(value = {
        Sb1.class,
        S1.class,
        S2.class,
        Oper.class,
        Sb3.class,
        S3.class,
        ListMenuTreeParam.class
})
public class ListMenuTreeParam extends AclParam {

    private static final long serialVersionUID = 4097985443864348510L;

    @NotNull(groups = {Sb3.class})
    @BucUserAnnotation(groups = {S3.class})
    private Integer userId;

    private String startMenuId;

    private String startMenuName;

    /**
     * is开头，用eclipse生成getter, setter, 容易出错。
     */
    private Boolean recursive;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStartMenuId() {
        return startMenuId;
    }

    public void setStartMenuId(String startMenuId) {
        this.startMenuId = startMenuId;
    }

    public String getStartMenuName() {
        return startMenuName;
    }

    public void setStartMenuName(String startMenuName) {
        this.startMenuName = startMenuName;
    }

    public Boolean getRecursive() {
        return recursive;
    }

    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }


}
