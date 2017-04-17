package com.alibaba.buc.api.datapermission.result;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 外部数据源数据其他属性返回结果
 * 类OutDataSourceDataListResultModel.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年11月2日 下午2:52:36
 */
public class OutDataSourceOtherPropertyResultModel implements Serializable {
    
    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -4739032288231640415L;


    /**
     * 中文名 
     */
    private String title;
    
    /**
     * 英文名 
     */
    private String name;
    
    /**
     * 数据的值，用户被授权、申请成功后在acl保存的值 
     */
    private String value;

    
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

    
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
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
