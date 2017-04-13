package com.alibaba.buc.api.condition.operation;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.api.condition.Condition;

/**
 * 封装操作查询条件信息
 * 类OperationCondition.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-3-20 上午9:59:27
 */
public class OperationQueryCondition implements Condition{
    
    /**
     * 操作参数的序列化版本号
     */
    private static final long serialVersionUID = 6957610297463624286L;
    
    /**
     * 应用名字
     */
    private String appName;
    
    /**
     * 操作英文name
     */
    private String operationName;

    /**
     * 是否是操作包
     */
    private Boolean isPackage;
    
    
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getOperationName() {
        return operationName;
    }

    
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }
    
    
    @Override
    public int hashCode() {
        return  HashCodeBuilder.reflectionHashCode(17, 37,this);
    }

   
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }



    public Boolean getIsPackage() {
        return isPackage;
    }



    public void setIsPackage(Boolean isPackage) {
        this.isPackage = isPackage;
    }
    
}
