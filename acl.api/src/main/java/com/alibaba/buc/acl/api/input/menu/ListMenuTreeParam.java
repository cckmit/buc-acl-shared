package com.alibaba.buc.acl.api.input.menu;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * List菜单的入参
 *
 * @author taigao.wjj 2015/12/03
 */
public class ListMenuTreeParam extends AclParam {

    private static final long serialVersionUID = 4097985443864348510L;

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
