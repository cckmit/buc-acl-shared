package com.alibaba.buc.api.check;

import java.util.List;

import com.alibaba.buc.api.common.AclParam;

/**
 * 验角色入参
 * <p/>
 * {@link com.alibaba.buc.api.AccessControlService#checkRoles(CheckRoleParam)}
 * 
 * @author jin.tuj 2015年5月5日 上午10:30:14
 */
public class CheckRolesParam implements AclParam {

    private static final long serialVersionUID = -1327208839955802126L;

    private Integer           userId;                                  // UC中的userId，必填

    private List<String>      roleNames;                               // 角色名列表，必填

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<String> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
    }

}
