/*
 * Copyright 2015 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.action;

import com.alibaba.buc.api.common.AclParam;

/**
 **删除url的接口入参
 * <p/>
 * {@link com.alibaba.buc.api.ActionService#updateUrl(UpdateUrlParam)}
 * @author taigao.wjj 2015-1-15 下午1:25:11
 */
public class DeleteActionParam  implements AclParam{


    private static final long serialVersionUID = -5878393705244212328L;
    
    // 接口操作主体，公共账号userId，须先授予公共账号接口操作权限，调用时会校验该公共账号是否拥权限（注意：不是当前登录人的userId）
    private String        principalUserId;
    
    
    /**
     * 应用名称
     */
    private String appName;
    
    private String name;
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getAppName() {
        return appName;
    }

    
    public void setAppName(String appName) {
        this.appName = appName;
    }

    
    public String getPrincipalUserId() {
        return principalUserId;
    }

    

    public void setPrincipalUserId(String principalUserId) {
        this.principalUserId = principalUserId;
    }



    
    
    

}
