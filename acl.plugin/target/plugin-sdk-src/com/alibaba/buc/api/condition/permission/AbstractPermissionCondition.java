package com.alibaba.buc.api.condition.permission;

import com.alibaba.buc.api.condition.Condition;

/**
 * 抽象封装所有权限，如静态权限、动态权限的基本信息
 * 类AbstractPermissionCondition.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-3-20 上午10:11:28
 */
public class AbstractPermissionCondition implements Condition{

    /**
     * 权限查询条件序列化版本号
     */
    private static final long serialVersionUID = 9178130154895858840L;
    
    /**
     * 权限所属应用英文名，必填
     */
    private String appName;
    
    /**
     * 权限英文名 
     */
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
    
}
