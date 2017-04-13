package com.alibaba.buc.api.datapermission.property;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.api.datapermission.vistor.PropertyVisitor;

/**
 * 应用自己解析类型的资源属性
 * 类SelfResolveStringProperty.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月16日 上午9:25:42
 */
public class SelfResolveStringProperty extends BaseProperty{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -1969570360665840203L;
    
    /**
     * 应用自己解析的字符串值
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
