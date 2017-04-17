/*
 * Copyright 2015 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api;

import com.alibaba.buc.api.common.AclPageResult;
import com.alibaba.buc.api.common.AclPagination;
import com.alibaba.buc.api.data.DataResult;
import com.alibaba.buc.api.exception.BucException;
import com.alibaba.buc.api.permission.data.CreateDataParam;
import com.alibaba.buc.api.permission.data.DeleteDataParam;
import com.alibaba.buc.api.permission.data.GetDataParam;
import com.alibaba.buc.api.permission.data.PageDataParam;
import com.alibaba.buc.api.permission.data.UpdateDataParam;

/**
 * @author taigao.wjj 2015-5-5 上午10:31:32
 */
public interface DataService {
    
    /**
     * 创建数据规则
     * @param param
     * @return
     * @throws BucException
     */
    void createData(CreateDataParam param ) throws BucException;
    
    /**
     * 更新数据规则
     * @param param
     * @throws BucException
     */
    void  updateData(UpdateDataParam param) throws BucException;
    
    /**
     * 删除数据规则
     * @param param
     * @throws BucException
     */
    void deleteData(DeleteDataParam param) throws BucException;
    
    /**
     * 获取单个数据规则
     * @param param
     * @return
     * @throws BucException
     */
    DataResult getData(GetDataParam param) throws BucException;
    
    /**
     * 分页获取数据规则
     * @param param
     * @return
     * @throws BucException
     */
    AclPageResult<DataResult> pageData(PageDataParam param, AclPagination page) throws BucException;
    
    

}
