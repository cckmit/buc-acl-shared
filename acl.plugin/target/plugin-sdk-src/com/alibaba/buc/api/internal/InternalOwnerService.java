package com.alibaba.buc.api.internal;

import java.util.List;


/**
 * 封装查询用户owner的数据的服务
 * 类InternalOwnerService.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-2-18 下午1:54:58
 */
public interface InternalOwnerService {

    /**
     * 根据部门管理员id查询部门管理员管理的所有部门
     * @param adminUserId
     * @return
     * @throws Exception
     */
    List<InternalOrganizationResultModel> findAllOrgListByAdminUserId(Integer adminUserId) throws Exception;

}
