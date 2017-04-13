package com.alibaba.buc.api.datapermission.result;

import java.io.Serializable;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 封装用到的描述符细则模型
 * 类OperationModel.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月22日 上午10:31:05
 */
public class DescriptorDetailResult implements Serializable {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -7924933177189043781L;

    /**
     * 属性列名，必须是接入时填写的属性列code
     */
    private String            resourcePropertyDefinitionName;

    /**
     * 运算符，只会出现应用接入时为列设置的授权类型
     */
    private String            operator;

    /**
     * 比较值
     */
    private String            compareValue;
    
    /**
     * 比较值map，用于存放枚举、字符串in等授权
     */
    private Map<String, String> compareValueMap;

    
    public String getResourcePropertyDefinitionName() {
        return resourcePropertyDefinitionName;
    }

    
    public void setResourcePropertyDefinitionName(String resourcePropertyDefinitionName) {
        this.resourcePropertyDefinitionName = resourcePropertyDefinitionName;
    }

    
    public String getOperator() {
        return operator;
    }

    
    public void setOperator(String operator) {
        this.operator = operator;
    }

    
    public String getCompareValue() {
        return compareValue;
    }

    
    public void setCompareValue(String compareValue) {
        this.compareValue = compareValue;
    }

    
    public Map<String, String> getCompareValueMap() {
        return compareValueMap;
    }

    
    public void setCompareValueMap(Map<String, String> compareValueMap) {
        this.compareValueMap = compareValueMap;
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
