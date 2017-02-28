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
 * 创建url的接口入参
 * <p/>
 * {@link com.alibaba.buc.api.ActionService#createUrl(CreateUrlParam)}
 * @author taigao.wjj 2015-1-15 上午11:40:09
 */
public class CreateActionParam implements AclParam{

    private static final long serialVersionUID = -5464822041283198844L;
    
    // 接口操作主体，公共账号userId，须先授予公共账号接口操作权限，调用时会校验该公共账号是否拥权限（注意：不是当前登录人的userId）
    private String        principalUserId;
    
    /**
     * 应用名称
     */
    private String appName;
    
    /**
     * 父亲url  action name
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
     * url 关联权限名称
     */
    private String       permissionName;
    
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

    public String getAppName() {
        return appName;
    }


    public void setAppName(String appName) {
        this.appName = appName;
    }


    public String getParentActionName() {
        return parentActionName;
    }

    
    public void setParentActionName(String parentActionName) {
        this.parentActionName = parentActionName;
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

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    
    public String getPrincipalUserId() {
        return principalUserId;
    }

    

    public void setPrincipalUserId(String principalUserId) {
        this.principalUserId = principalUserId;
    }


    

}
