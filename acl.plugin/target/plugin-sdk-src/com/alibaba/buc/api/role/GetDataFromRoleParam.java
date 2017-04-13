package com.alibaba.buc.api.role;

import com.alibaba.buc.api.common.AclParam;

/**
 * 获取角色原生数据规则的入参
 * <p/>
 * {@link com.alibaba.buc.api.RoleService#getDataFromRole(GetDataFromRoleParam)}
 *
 * @author yicheng.wp
 */
public class GetDataFromRoleParam implements AclParam {

    private static final long serialVersionUID = -3112449326115339574L;
    
    private String roleName; // 角色英文名

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
