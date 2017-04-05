package com.alibaba.buc.acl.api.input.menu;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 获取菜单树的入参
 *
 * @author taigao.wjj 2015/12/03
 */
public class ListMenuTreeParam extends AclParam {

    private static final long serialVersionUID = 4097985443864348510L;

    /**
     * UC 中的 userId，必填
     */
    private Integer userId;

    /**
     * 要获取的开始菜单ID，非必填
     */
    private String startMenuId;

    /**
     * 要获取的开始菜单名，非必填
     */
    private String startMenuName;

    /**
     * 是否递归，非必填
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
