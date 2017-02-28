package com.alibaba.buc.api.condition;

/**
 * 封装角色权限查询条件
 * 类RolePermissionCondition.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-5-29 下午10:04:21
 */
public class RolePermissionCondition implements Condition {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 3205727505651757170L;

    /**
     * 用户ID
     */
    private String            userId;
    
    /**
     * 角色英文名
     */
    private String            roleName;
    
    /**
     * 权限英文名
     */
    private String            permissionName;

    
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPermissionName() {
        return permissionName;
    }
    
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    
    public String getUserId() {
        return userId;
    }

    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    

}
