package com.alibaba.buc.api.datapermission.param;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 封装操作相关信息
 * 类OperationProfile.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月15日 下午1:17:48
 */
public class OperationProfileParam implements Serializable{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 5109497574200939523L;
    
    /**
     * 操作名，必须与在系统中填写的对应操作name相同
     */
    private String operationName;

    
    public String getOperationName() {
        return operationName;
    }

    
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    @Override
    public int hashCode() {
        return  HashCodeBuilder.reflectionHashCode(this);
    }

   
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
}
