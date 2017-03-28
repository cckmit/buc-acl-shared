package com.alibaba.buc.acl.api.input.datapermission;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 封装数据模型更新参数
 *
 * @author tongxu 2016年9月1日 下午2:35:12
 */
public class UpdateDataModelParam extends AclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 542119577394149223L;
    
    /**
     * 要更新信息的英文名
     */
    private String name;
    

    /**
     * 中文名
     */
    private String title;
    
    /**
     * 描述
     */
    private String description;
    
    /**
    
    /**
     * 包含的属性name列表
     */
    private List<String> propertyNameList;

    
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

    
    public List<String> getPropertyNameList() {
        return propertyNameList;
    }

    
    public void setPropertyNameList(List<String> propertyNameList) {
        this.propertyNameList = propertyNameList;
    }
    
    
}
