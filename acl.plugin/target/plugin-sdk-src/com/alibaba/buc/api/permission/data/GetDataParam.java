/*
 * Copyright 2015 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.permission.data;

import com.alibaba.buc.api.common.AclParam;

/**
 * @author taigao.wjj 2015-5-5 上午10:26:22
 */
public class GetDataParam implements AclParam{
    
    private static final long serialVersionUID = 9035205203886602597L;
    private String appName; //应用名称                     必填
    private String name;  //数据规则名称                    必填         //数据规则必须是这个应用下面的
    
    public String getAppName() {
        return appName;
    }
    

    public void setAppName(String appName) {
        this.appName = appName;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    

}
