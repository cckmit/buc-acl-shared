package com.alibaba.buc.api;

import java.util.List;

import com.alibaba.buc.api.exception.BucException;
import com.alibaba.buc.api.grant.GrantPermissionsToUserParam;
import com.alibaba.buc.api.grant.GrantPermissionsToUsergroupParam;
import com.alibaba.buc.api.grant.GrantRolesToUserParam;
import com.alibaba.buc.api.grant.GrantRolesToUsergroupParam;
import com.alibaba.buc.api.param.UserPermissionParam;
import com.alibaba.buc.api.param.UserRoleParam;
import com.alibaba.buc.api.param.UsergroupPermissionParam;

/**
 * 授权接口
 * 
 * @author jin.tuj
 */
public interface GrantService {

    /**
     * 授予/冻结/移除用户权限
     * <p>
     * 用户权限的业务唯一键为userId及permissionName, 以业务键决定新增或更新
     * </p>
     *
     * @param grantPermissionsToUserParam 入参
     * @since 1.9
     */
	@Deprecated
    void grantPermissionsToUser(GrantPermissionsToUserParam grantPermissionsToUserParam) throws BucException;
    
    /**
     * 授予/冻结/移除用户角色
     * <p>
     * 用户角色的业务键为userId及roleName, 以业务键决定新增或更新
     * </p>
     *
     * @param grantRolesToUserParam 入参
     * @since 1.9
     */
	@Deprecated
    void grantRolesToUser(GrantRolesToUserParam grantRolesToUserParam) throws BucException;

    

    /**
     * 授予/冻结/移除用户组权限
     * <p>
     * 用户組权限的业务键为usergroupName及permissionName, 以业务键决定新增或更新
     * 目前不支持数据权限授予给用户组
     * </p>
     *
     * @param grantPermissionsToUsergroupParam 入参
     * @since 1.9
     */
	@Deprecated
    void grantPermissionsToUsergroup(GrantPermissionsToUsergroupParam grantPermissionsToUsergroupParam) throws BucException;

    /**
     * 授予/冻结/移除用户组角色
     * <p/>
     * 用户組角色的业务键为usergroupName及roleName, 以业务键决定新增或更新
     *
     * @param grantRolesToUsergroupParam 入参
     * @throws BucException
     * @since 1.9
     */
	@Deprecated
    void grantRolesToUsergroup(GrantRolesToUsergroupParam grantRolesToUsergroupParam) throws BucException;
    
    
    
    //-----------------------以下为过期接口，后期将不提供支持，切勿使用--------------------------
    /**
     * @deprecated {@link GrantService#grantPermissionsToUser(GrantPermissionsToUserParam)}
     * 授予/冻结/移除用户权限
     * <p>
     * 用户权限的业务唯一键为userId及permissionName, 以业务键决定新增或更新
     * </p>
     * 
     * @param principal 接口操作主体, 须先授予接口操作权限
     * @param appName 授予权限所在的应用
     * @since 1.0
     */
    @Deprecated
    void grantPermissionToUser(Principal principal, String appName, List<UserPermissionParam> userPermissions)
                                                                                                                     throws BucException;
    
    /**
     * @deprecated {@link GrantService#grantRolesToUser(GrantRolesToUserParam)}
     * 授予/冻结/移除用户角色
     * <p>
     * 用户角色的业务键为userId及roleName, 以业务键决定新增或更新
     * </p>
     * 
     * @param principal 接口操作主体, 须先授予接口操作权限
     * @param appName 授予角色所在的应用
     * @since 1.0
     */
    @Deprecated
    void grantRoleToUser(Principal principal, String appName, List<UserRoleParam> userRoles) throws BucException;
    
    /**
     * @deprecated {@link GrantService#grantPermissionsToUsergroup(GrantPermissionsToUsergroupParam)}
     * 授予/冻结/移除用户组权限
     * <p>
     * 用户組权限的业务键为usergroupName及permissionName, 以业务键决定新增或更新
     * 目前不支持数据权限授予给用户组
     * </p>
     * 
     * @param principal 接口操作主体, 须先授予接口操作权限
     * @param appName 授予权限所在的应用
     * @since 1.0
     */
    @Deprecated
    void grantPermissionToUsergroup(Principal principal, String appName,
                                    List<UsergroupPermissionParam> usergroupPermissions) throws BucException;
    
}
