package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.input.check.CheckActionsParam;
import com.alibaba.buc.acl.api.input.check.CheckPermissionsParam;
import com.alibaba.buc.acl.api.output.check.CheckActionsResult;
import com.alibaba.buc.acl.api.output.check.CheckPermissionsResult;

/**
 * Created by baidian on 12/21/15.
 */
public interface AccessControlService {

    /**
     * @since 1.1.7
     *
     * @param checkPermissionsParam 入参
     * @return
     */
    CheckPermissionsResult checkPermissions(CheckPermissionsParam checkPermissionsParam);

    /**
     * @since 1.1.7
     *
     * @param checkActionsParam 入参
     * @return
     */
    CheckActionsResult checkActions(CheckActionsParam checkActionsParam);
}
