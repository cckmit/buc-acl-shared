package com.alibaba.buc.api.datapermission.result;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 封装属性信息
 * 类PropertyValueResult.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年10月12日 下午3:02:22
 */
public class PropertyValueResult implements Serializable {

	/**
     * 序列化版本号
     */
    private static final long serialVersionUID = -1274097503913112570L;

    /**
	 * 属性name
	 */
	private String name;

	/**
	 * 值列表
	 */
	private List<String> valueList;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<String> getValueList() {
        return valueList;
    }
    
    public void setValueList(List<String> valueList) {
        this.valueList = valueList;
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
