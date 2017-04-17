package com.alibaba.buc.api.datapermission.param;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 封装描述数据权限的操作＋资源信息
 * 类AuthProfile.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月15日 下午1:34:06
 */
public class FindPropertyDataDetailParam extends BasicOutDataSourceQueryParam{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -1560202982488509428L;
    
    /**
     * 要查询详情的数据value列表
     */
    private List<String> dataValueList;
    
    
    public List<String> getDataValueList() {
        return dataValueList;
    }

    
    public void setDataValueList(List<String> dataValueList) {
        this.dataValueList = dataValueList;
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
