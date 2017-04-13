package com.alibaba.buc.api.datapermission.result;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 封装用到的操作模型
 * 类OperationModel.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月22日 上午10:31:05
 */
public class OperationResult implements Serializable {

	/**
     * 序列化版本号
     */
    private static final long serialVersionUID = -7002057461251634689L;

    /**
	 * 操作名，必选
	 */
	private String title;

	/**
	 * 操作name，必选
	 */
	private String name;

	/**
	 * 操作描述，必选
	 */
	private String description;

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String description) {
        this.description = description;
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
