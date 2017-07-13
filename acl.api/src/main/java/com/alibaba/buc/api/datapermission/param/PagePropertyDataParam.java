package com.alibaba.buc.api.datapermission.param;

import java.util.List;
import java.util.Map;

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
    
    /**
     * 发起调用时用户在其他属性选择的值，用于制作级联菜单等场景
     * 
     * key是其他属性name，value是当前选择的值列表
     */
    private Map<String, List<String>> currentOtherPropertyValues;
    
    
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
    
    
    public Map<String, List<String>> getCurrentOtherPropertyValues() {
        return currentOtherPropertyValues;
    }

    
    public void setCurrentOtherPropertyValues(Map<String, List<String>> currentOtherPropertyValues) {
        this.currentOtherPropertyValues = currentOtherPropertyValues;
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
