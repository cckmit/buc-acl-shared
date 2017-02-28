package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.menu.CreateMenuParam;
import com.alibaba.buc.acl.api.input.menu.DeleteMenuParam;
import com.alibaba.buc.acl.api.input.menu.UpdateMenuParam;

/**
 * Menu Write Service
 */
public interface MenuWriteService {

    /**
     * 创建单个菜单
     *
     * @param param 入参
     * @return AclResult
     * @since acl.api 1.1.7
     */
    AclResult createMenu(CreateMenuParam param);

    /**
     * 更新单个菜单
     *
     * @param param 入参
     * @return AclResult
     * @since acl.api 1.1.7
     */
    AclResult updateMenu(UpdateMenuParam param);

    /**
     * 删除单个菜单
     *
     * @param param 入参
     * @return AclResult
     * @since acl.api 1.1.7
     */
    AclResult deleteMenu(DeleteMenuParam param);
}
