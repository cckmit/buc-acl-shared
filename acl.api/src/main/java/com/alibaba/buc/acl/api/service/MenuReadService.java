package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.input.menu.GetMenuParam;
import com.alibaba.buc.acl.api.input.menu.ListAppTreeMenuParam;
import com.alibaba.buc.acl.api.input.menu.ListMenuTreeParam;
import com.alibaba.buc.acl.api.input.menu.ListRoleTreeMenuParam;
import com.alibaba.buc.acl.api.output.menu.MenuResult;
import com.alibaba.buc.acl.api.output.menu.TreeMenuResult;

/**
 * Menu Read Service
 */
public interface MenuReadService {

    /**
     * 查询用户的菜单树
     *
     * @param condition 入参
     * @return TreeMenuResult
     * @since acl.api 1.1.7
     */
    TreeMenuResult listAllTreeMenu(ListMenuTreeParam condition);

    /**
     * 获取单个菜单
     *
     * @param param 入参
     * @return AclResult
     * @since acl.api 1.1.7
     */
    MenuResult getMenu(GetMenuParam param);
    
    /**
     * 获取某个app下面的菜单树
     * @param appName
     * @return
     */
    TreeMenuResult listAppTreeMenu(ListAppTreeMenuParam param );
    
    
    /**
     * 获取某个app下面的菜单树
     * @param appName
     * @return
     */
    TreeMenuResult listRoleTreeMenu(ListRoleTreeMenuParam param );
    
    
}
