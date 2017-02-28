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
 **更新url的接口入参
 * <p/>
 * {@link com.alibaba.buc.api.ActionService#updateUrl(UpdateUrlParam)}
 * @author taigao.wjj 2015-1-15 下午2:09:25
 */
public class GetActionParam implements AclParam{
    
    private static final long serialVersionUID = 4948387038025250697L;

    
    
    /**
     * 应用名称
     */
    private String appName;
    
    
    /**
     * action name
     */
    private String name;
    
    /**
     * action pattern;
     */
    private String pattern;

 
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
    
    
    
    
    

}
