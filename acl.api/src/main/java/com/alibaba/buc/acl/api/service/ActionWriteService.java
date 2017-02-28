package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.action.CreateActionParam;
import com.alibaba.buc.acl.api.input.action.DeleteActionParam;
import com.alibaba.buc.acl.api.input.action.UpdateActionParam;

/**
 * URL Write Service
 */
public interface ActionWriteService {

    /**
     * 创建url
     *
     * @param createActionParam 入参
     * @return AclResult
     * @since acl.api 1.1.7
     */
    AclResult createAction(CreateActionParam createActionParam);

    /**
     * 更新url
     *
     * @param updateActionParam 入参
     * @return AclResult
     * @since acl.api 1.1.7
     */
    AclResult updateAction(UpdateActionParam updateActionParam);

    /**
     * 删除url
     *
     * @param deleteActionParam 入参
     * @return AclResult
     * @since acl.api 1.1.7
     */
    AclResult deleteAction(DeleteActionParam deleteActionParam);
}
