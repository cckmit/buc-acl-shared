package com.alibaba.buc.api.datapermission.result;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 封装用到的数据权限模型
 * 类DataPermissionModelResult.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年4月25日 上午11:00:50
 */
public class DataPermissionResult implements Serializable {


    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 3410665696242157991L;

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
