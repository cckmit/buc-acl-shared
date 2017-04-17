/*
 * Copyright 2015 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.usergroup;

import com.alibaba.buc.api.common.AclResult;

/**
 * 类ApplyJoinUsergroupResult.java的实现描述：TODO 类实现描述 
 * @author taigao.wjj 2015-4-28 上午8:31:03
 */
public class ApplyJoinUsergroupResult implements AclResult{
    
    private Integer instanceId; //流程Id.

    public ApplyJoinUsergroupResult(Integer instanceId){
        this.instanceId = instanceId;
    }
    
    public ApplyJoinUsergroupResult(){
        super();
    }
    
    public Integer getInstanceId() {
        return instanceId;
    }


    public void setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
    }
    
    

}
