package com.alibaba.buc.api.internal;

import java.util.List;
import java.util.Map;


/**
 * 内部服务
 * 
 * @author shenwujie 2013-10-21 下午5:35:26
 */
public interface InternalUserPermissionService {

    /**
     * 内部使用
     * 
     * @param userIds
     * @return
     * @throws Exception
     */
    Map<String, InternalUserPermissionResultModel> findAllPermissionByUserIds(List<String> userIds) throws Exception;

}
