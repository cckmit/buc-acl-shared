package com.alibaba.buc.api.datapermission.property;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.api.datapermission.vistor.PropertyVisitor;

/**
 * 封装字符串类型的资源属性
 * 类StringProperty.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月16日 上午9:24:24
 */
public class StringProperty extends BaseProperty implements Serializable{
    
    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 8331294535044020383L;
    /**
     * 字符串类型的属性值
     */
    private String value;

    
    public String getValue() {
        return value;
    }
    
    @Override
    public String getPropertyValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 内部逻辑使用，用户请忽略
     * @param visitor
     */
    @Override
    public void accept(PropertyVisitor visitor) {
        visitor.visit(this);
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
