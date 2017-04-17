package com.alibaba.buc.api;

import java.util.List;

import com.alibaba.buc.api.exception.BucException;
import com.alibaba.buc.api.param.UsergroupParam;
import com.alibaba.buc.api.param.UsergroupUserParam;
import com.alibaba.buc.api.usergroup.*;

/**
 * @author jin.tuj
 */
public interface UsergroupService {

    /**
     * 创建用户组
     * 
     * @since 1.0
     * @throws BucException 用户组重名
     */
	@Deprecated
    public void createUsergroup(Principal principal, UsergroupParam usergroup) throws BucException;

    /**
     * 根据用户组名查询用户组
     * 如果查询不到，返回 NULL
     *
     * @param getUsergroupParam 根据 usergroupName 全匹配查询
     * @return GetUsergroupResult
     * @throws BucException
     * @since 1.9
     */
	@Deprecated
    public UsergroupResult getUsergroup(GetUsergroupParam getUsergroupParam) throws BucException;

    /**
     * 查询用户组下的用户
     *
     * @param findUsergroupUsersParam 根据 usergroupName 查询用户组下的用户
     * @return FindUsergroupUsersResult
     * @throws BucException
     * @since 1.9
     */
	@Deprecated
    public FindUsergroupUsersResult findUsergroupUsers(FindUsergroupUsersParam findUsergroupUsersParam) throws BucException;


    /**
     * 用户组添加用户
     * <p/>
     * 一次最多给用户组添加100个用户
     *
     * @param addUsersToUsergroupParam 入参
     * @throws BucException
     * @since 1.9
     */
	@Deprecated
    public void addUsersToUsergroup(AddUsersToUsergroupParam addUsersToUsergroupParam) throws BucException;
       
    /**
     * 用户组移除用户
     * <p/>
     * 一次最多从用户组移除100个用户
     *
     * @param removeUsersFromUsergroupParam 入参
     * @throws BucException
     * @since 1.9
     */
	@Deprecated
    public void removeUsersFromUsergroup(RemoveUsersFromUsergroupParam removeUsersFromUsergroupParam) throws BucException;
    
    
    
    /**
     * 用户自助申请加入用户组
     * @param param
     * @return
     * @throws BucException
     */
    //public ApplyJoinUsergroupResult applyJoinUsergroup(ApplyJoinUsergroupParam param) throws BucException;
    
    
    //-----------------------以下为过期接口，后期将不提供支持，切勿使用--------------------------
    /**
     * @deprecated {@link UsergroupService#addUsersToUsergroup(AddUsersToUsergroupParam)}
     * 用户组添加用户
     * 
     * @since 1.0
     * @throws BucException 用户组/用户不存在
     */
    @Deprecated
    public void addUserToUsergroup(Principal principal, List<UsergroupUserParam> usergroupUsers) throws BucException;
    
    /**
     * @deprecated {@link UsergroupService#removeUsersFromUsergroup(RemoveUsersFromUsergroupParam)}
     * 用户组移除用户
     * 
     * @since 1.0
     * @throws BucException 用户组/用户不存在
     */
    @Deprecated
    public void removeUserFromUsergroup(Principal principal, List<UsergroupUserParam> usergroupUsers)
                                                                                                     throws BucException;

}
