package com.alibaba.buc.api.datapermission.property;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.api.datapermission.vistor.PropertyVisitor;

/**
 * 枚举类属性
 * 类EnumProperty.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月16日 上午9:25:31
 */
public class EnumProperty extends BaseProperty{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -770874629919564920L;
    
    /**
     * 枚举值，必须与接入应用时填写的枚举值相同
     */
    private String enumValue;

    
    public String getEnumValue() {
        return enumValue;
    }
    
    @Override
    public String getPropertyValue() {
        return enumValue;
    }

    
    public void setEnumValue(String enumValue) {
        this.enumValue = enumValue;
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
