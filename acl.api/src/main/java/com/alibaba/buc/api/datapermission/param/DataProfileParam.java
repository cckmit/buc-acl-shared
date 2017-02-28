package com.alibaba.buc.api.datapermission.param;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.api.datapermission.property.BaseProperty;

/**
 * 封装一个具体资源相关属性的类
 * 类DataProfile.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月15日 下午1:38:20
 */
public class DataProfileParam implements Serializable{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * 数据id，主要给使用http方式验权的用户使用，因为验权结果返回的是以data为key的map，
     * 
     * 在序列化成json时成为了一个json对象，http用户需要对比json对象的每个属性才能获取其验权结果，
     * 
     * 过程较复杂，因此提供dataId，简化http用户使用难度
     * 
     * http用户可自己为每个数据指定一个id，这样http接口返回的验权结果呈现简单的dataId:true(false)格式
     */
    private String dataId;
    
    /**
     * 数据模型name，必须和在acl页面上定义的数据模型name一致
     */
    private String dataModelName;
    
    /**
     * 资源各属性列表
     */
    private List<? extends BaseProperty> propertyList;

    
    public List<? extends BaseProperty> getPropertyList() {
        return propertyList;
    }

    
    public void setPropertyList(List<? extends BaseProperty> propertyList) {
        this.propertyList = propertyList;
    }
    
    public String getDataId() {
        return dataId;
    }


    
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    
    public String getDataModelName() {
        return dataModelName;
    }


    
    public void setDataModelName(String dataModelName) {
        this.dataModelName = dataModelName;
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
