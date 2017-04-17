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
 * @author taigao.wjj 2015-5-5 上午10:23:59
 */
public class DeleteDataParam implements AclParam{
    
    private static final long serialVersionUID = 6969239938976156830L;
    private Integer principalUserId; //公共账号                       必填
    private Integer operatorUserId;  //操作者id                      必填
    private String name;     //数据规则名称                             必填
    private String appName;  //应用名称                                必填  //其中数据规则必须是这个应用下面的。

    public Integer getPrincipalUserId() {
        return principalUserId;
    }
    
    public void setPrincipalUserId(Integer principalUserId) {
        this.principalUserId = principalUserId;
    }
    
    public Integer getOperatorUserId() {
        return operatorUserId;
    }
    
    public void setOperatorUserId(Integer operatorUserId) {
        this.operatorUserId = operatorUserId;
    }
    
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

    
}
