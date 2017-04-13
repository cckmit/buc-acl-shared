package com.alibaba.buc.api.data;

import com.alibaba.buc.api.common.AclResult;

/**
 * 数据规则出参
 *
 * @author yicheng.wp
 */
public class DataResult implements AclResult {

    private static final long serialVersionUID = 8059031947613995829L;

    private String name; // 数据规则英文名

    private String title; // 数据规则中文名

    private String typeName; // 数据类型英文名

    private String value; // 数据规则值

    private String desc; // 数据规则描述
    
    private Integer sort;  //排序
    
    private String parentName;  //父数据规则名称

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
    
    
}
