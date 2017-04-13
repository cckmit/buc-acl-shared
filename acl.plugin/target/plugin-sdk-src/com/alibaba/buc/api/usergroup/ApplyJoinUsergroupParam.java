/*
 * Copyright 2015 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.usergroup;

import com.alibaba.buc.api.common.AclParam;

/**
 * 类ApplyJoinUsergroupParam.java的实现描述：TODO 类实现描述 
 * @author taigao.wjj 2015-4-28 上午8:28:49
 */
public class ApplyJoinUsergroupParam  implements AclParam{
    
    private Integer principalUserId; // 接口操作主体，公共账号userId，须先授予公共账号接口操作权限，调用时会校验该公共账号是否拥权限（注意：不是当前登录人的userId）

    private String usergroupName; // 用户组名

    private Integer userId;   //用户id
    
    private boolean isFlow =false;   //是否走流程

    

    public Integer getPrincipalUserId() {
        return principalUserId;
    }


    public void setPrincipalUserId(Integer principalUserId) {
        this.principalUserId = principalUserId;
    }

    

    public String getUsergroupName() {
        return usergroupName;
    }

    

    public void setUsergroupName(String usergroupName) {
        this.usergroupName = usergroupName;
    }

    

    public Integer getUserId() {
        return userId;
    }

    

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    

    public boolean isFlow() {
        return isFlow;
    }

    

    public void setFlow(boolean isFlow) {
        this.isFlow = isFlow;
    }
    
    
    
    
}
