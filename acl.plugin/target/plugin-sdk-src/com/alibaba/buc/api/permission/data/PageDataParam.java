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
 * @author taigao.wjj 2015-5-5 上午10:28:13
 */
public class PageDataParam implements AclParam{
    
    private static final long serialVersionUID = -5590463542509373766L;
    private String appName; //应用名称                  必填
    private String typeName; //数据规则类型           选填

    public String getAppName() {
        return appName;
    }
    

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }



    
}
