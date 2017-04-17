package com.alibaba.buc.api.datapermission.result;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 外部数据源数据模型返回结果
 * 类OutDataSourceDataListResultModel.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年11月2日 下午2:52:36
 */
public class OutDataSourceDataResultModel implements Serializable {
    
    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -8793035378502448692L;

    /**
     * 中文名 
     */
    private String title;
    
    /**
     * 英文名 
     */
    private String name;
    
    /**
     * 数据的值，用户被授权、申请后实际得到的值 
     */
    private String value;
    
    /**
     *  数据描述，用于展示给用户 
     */
    private String description;
    
    /**
     *  树形结果中，如果当前节点包含下级节点，则返回true，否则返回false 
     */
    private Boolean hasChildren;
    
    /**
     *  资源属性定义name，代表这个外部数据源查询的资源属性定义 
     */
    private String propertyName;
    
    /**
     * 其他业务相关属性
     */
    private List<OutDataSourceOtherPropertyResultModel> otherPropertys;

    
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

    
    public String getPropertyName() {
        return propertyName;
    }

    
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    
    public List<OutDataSourceOtherPropertyResultModel> getOtherPropertys() {
        return otherPropertys;
    }
    
    public void setOtherPropertys(List<OutDataSourceOtherPropertyResultModel> otherPropertys) {
        this.otherPropertys = otherPropertys;
    }


    
    public String getDescription() {
        return description;
    }


    
    public void setDescription(String description) {
        this.description = description;
    }

    
    public Boolean getHasChildren() {
        return hasChildren;
    }

    
    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
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
