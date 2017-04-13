package com.alibaba.buc.api.condition.attribute;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.api.condition.Condition;

public class AttributeCondition implements Condition{

    /**
     * 资源属性序列化版本号
     */
    private static final long serialVersionUID = 4413532587024777603L;
    
    /**
     * 属性名
     */
    private String name;
    
    /**
     * 属性值
     */
    private String value;

    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }
    
    @Override
    public int hashCode() {
        return  HashCodeBuilder.reflectionHashCode(17, 37,this);
    }

   
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
    
    

}
