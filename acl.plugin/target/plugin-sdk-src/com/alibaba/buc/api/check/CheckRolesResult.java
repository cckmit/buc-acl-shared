package com.alibaba.buc.api.check;

import com.alibaba.buc.api.common.AclResult;

/**
 * 验角色出参
 * <p/>
 * {@link com.alibaba.buc.api.AccessControlService#checkRoles(CheckRoleParam)}
 * 
 * @author jin.tuj 2015年5月5日 上午10:35:50
 */
public class CheckRolesResult implements AclResult {

    private static final long serialVersionUID = -7553909441709081272L;

    private String            roleName;                                // 角色名

    private boolean           accessible;                              // 是否拥有权限

    public CheckRolesResult(){
        super();
    }

    public CheckRolesResult(String roleName, boolean accessible){
        this.roleName = roleName;
        this.accessible = accessible;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public boolean isAccessible() {
        return accessible;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }

}
