package com.alibaba.buc.api.datapermission.param;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 封装描述数据权限的操作＋资源信息
 * 类AuthProfile.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月15日 下午1:34:06
 */
public class PagePropertyDataParam extends BasicOutDataSourceQueryParam{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -5567218274851402554L;
    
    /**
     * 父节点数据value，为空代表查询根节点
     * 
     * 如果属性是列表类型的，可忽略此值
     * 
     */
    private String parentValue;
    
    /**
     * 用户搜索框内输入的关键字
     */
    private String searchKey;
    
    
    public String getParentValue() {
        return parentValue;
    }
    
    public void setParentValue(String parentValue) {
        this.parentValue = parentValue;
    }

    public String getSearchKey() {
        return searchKey;
    }

    
    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
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
