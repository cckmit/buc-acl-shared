package com.alibaba.buc.api.datapermission.property;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.api.datapermission.vistor.PropertyVisitor;

/**
 * 封装数据权限相关属性基本信息
 * 类BaseProperty.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月15日 下午1:33:39
 */
public abstract class BaseProperty implements Serializable{
    
    /**
     * 序列化版本号 
     */
    private static final long serialVersionUID = -4253395022477723359L;
    
    /**
     * 指定属性的code，必须与接入时填写的对应属性name相同
     */
    private String propertyName;

    
    public String getPropertyName() {
        return propertyName;
    }
    
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
    
    /**
     * 简单获取属性值的方法，用户请忽略
     * @return
     */
    public abstract String getPropertyValue();
    
    /**
     * 抽象方法，内部逻辑使用，用户请忽略
     * @param visitor
     */
    public abstract void accept(PropertyVisitor visitor);
    
    @Override
    public int hashCode() {
        return  HashCodeBuilder.reflectionHashCode(this);
    }

   
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

}
