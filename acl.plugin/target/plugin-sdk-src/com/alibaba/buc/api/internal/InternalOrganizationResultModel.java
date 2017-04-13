package com.alibaba.buc.api.internal;

import com.alibaba.buc.api.result.ResultModel;

/**
 * 封装基础组织机构信息，用于内部简单描述一个机构
 * 类InternalOrganizationResultModel.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-2-18 下午1:52:44
 */
public class InternalOrganizationResultModel implements ResultModel {
    
    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 131179643895280883L;

    /**
     * 机构id
     */
    private Integer id;
    
    /**
     * 机构名
     */
    private String title;
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    

}
