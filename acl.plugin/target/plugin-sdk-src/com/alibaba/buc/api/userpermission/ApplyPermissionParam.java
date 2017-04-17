package com.alibaba.buc.api.userpermission;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.alibaba.buc.api.common.AclParam;
import com.alibaba.buc.api.data.DataMapping;
import com.alibaba.buc.api.grant.DataPermissionParam;

/**
 * 申请权限、角色入参
 * <p/>
 * {@link com.alibaba.buc.api.UserPermissionService#applyPermission(ApplyPermissionParam)}
 *
 * @author yicheng.wp
 */
public class ApplyPermissionParam implements AclParam {

    private static final long serialVersionUID = -2174774083097830021L;

    /**
     * 申请的权限name列表
     */
    private List<String> permissionNames;

    /**
     * 申请的数据权限对应的数据规则列表，没有可以为空
     */
    private List<DataMapping> permissionDatas;

    /**
     * 申请的角色name列表
     */
    private List<String> roleNames;

    /**
     * 申请的数据权限对应的数据规则列表，没有可以为空（老版数据权限属性，使用老版数据权限用户请设置此属性）
     */
    private List<DataMapping> roleDatas;
    
    /**
     * 申请的角色包含的数据权限，key是角色name，value是数据权限详情列表（最新版数据权限属性，使用新版数据权限用户请设置此属性）
     */
    private Map<String, List<DataPermissionParam>> roleDataPermissionMap; 

    /**
     * 申请人id
     */
    private Integer userId;

    /**
     * 申请原因
     */
    private String reason;

    /**
     * 过期时间
     */
    private Date expireDate;

    public List<String> getPermissionNames() {
        return permissionNames;
    }

    public void setPermissionNames(List<String> permissionNames) {
        this.permissionNames = permissionNames;
    }

    public List<DataMapping> getPermissionDatas() {
        return permissionDatas;
    }

    public void setPermissionDatas(List<DataMapping> permissionDatas) {
        this.permissionDatas = permissionDatas;
    }

    public List<String> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
    }

    public List<DataMapping> getRoleDatas() {
        return roleDatas;
    }

    public void setRoleDatas(List<DataMapping> roleDatas) {
        this.roleDatas = roleDatas;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    
    public Map<String, List<DataPermissionParam>> getRoleDataPermissionMap() {
        return roleDataPermissionMap;
    }

    
    public void setRoleDataPermissionMap(Map<String, List<DataPermissionParam>> roleDataPermissionMap) {
        this.roleDataPermissionMap = roleDataPermissionMap;
    }
    
}
