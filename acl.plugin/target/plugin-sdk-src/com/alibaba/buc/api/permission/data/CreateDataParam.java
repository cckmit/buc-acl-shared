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
 * @author taigao.wjj 2015-5-5 上午10:10:17
 */
public class CreateDataParam  implements AclParam{
    
    private static final long serialVersionUID = -8023392990038801453L;
    private Integer principalUserId;  //公共账号  ,             必填
    private  Integer operatorUserId; //操作者id，            必填
    private String name;  //数据规则名称                          必填
    private String title;  //数据规则title                              必填
    private String desc;  //数据规则描述                            选填
    private String appName;  //应用名称                          必填
    private String typeName;  //数据类型名称                  必填
    private String value;  //数据规则值                              必填
    private String parentName;  // 父data的名称              选填          //如果填了，此父数据规则不在数据库中，那么会报错提示。
    private Integer sort ;    //排序序号                               选填
    

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
    

    public String getTitle() {
        return title;
    }
    

    public void setTitle(String title) {
        this.title = title;
    }
    

    public String getDesc() {
        return desc;
    }
    

    public void setDesc(String desc) {
        this.desc = desc;
    }
    

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


    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }


    public String getValue() {
        return value;
    }
    

    public void setValue(String value) {
        this.value = value;
    }



    public Integer getSort() {
        return sort;
    }
    

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    
    
}
