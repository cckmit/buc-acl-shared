/*
 * Copyright 2015 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.action;

import com.alibaba.buc.api.common.AclResult;

/**
 * 类GetActionResult.java的实现描述
 * @author taigao.wjj 2015-1-15 下午2:14:21
 */
public class ActionResult implements AclResult{
    
    private static final long serialVersionUID = -2621503439604310388L;

    /**
     * 应用名称
     */
    private String appName;
    
    
    /**
     * 父亲url name
     */
    private  String parentActionName;
    
    /**
     * url name
     */
    private String       name;
    
    /**
     * url title
     */
    private String       title;
    
    /**
     * url 关联权限 name
     */
    private String      permissionName;
    
    /**
     * url 序号
     */
    private Integer      sort;
    
    /**
     * url 模式
     * for example : http://www.163.com 
     */
    private String       pattern;
    
    /**
     * url  描述
     */
    private String       description;

    

    public String getParentActionName() {
        return parentActionName;
    }

    

    public void setParentActionName(String parentActionName) {
        this.parentActionName = parentActionName;
    }

    

    public String getName() {
        return name;
    }

    

    public void setName(String name) {
        this.name = name;
    }


    public String getTitle() {
        return title;
    }

    

    public void setTitle(String title) {
        this.title = title;
    }

    

    public String getPermissionName() {
        return permissionName;
    }

    

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
    
    
    


}
