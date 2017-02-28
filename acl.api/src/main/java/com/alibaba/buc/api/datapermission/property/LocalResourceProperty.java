package com.alibaba.buc.api.datapermission.property;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.api.datapermission.vistor.PropertyVisitor;

/**
 * 落地acl资源属性
 * 类EnumProperty.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月16日 上午9:25:31
 */
public class LocalResourceProperty extends BaseProperty{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -770874629919564920L;
    
    /**
     * 资源name，必须与在acl添加资源时填写的name相同
     */
    private String resourceName;
    
    
    public String getResourceName() {
        return resourceName;
    }
    
    @Override
    public String getPropertyValue() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
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
