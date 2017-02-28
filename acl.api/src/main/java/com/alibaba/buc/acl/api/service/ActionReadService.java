package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.input.action.GetActionParam;
import com.alibaba.buc.acl.api.output.action.ActionResult;

/**
 * URL Read Service
 */
public interface ActionReadService {

    /**
     * 获取url
     *
     * @param getActionParam 入参
     * @return ActionResult
     * @since acl.api 1.1.7
     */
    ActionResult getAction(GetActionParam getActionParam);
}
