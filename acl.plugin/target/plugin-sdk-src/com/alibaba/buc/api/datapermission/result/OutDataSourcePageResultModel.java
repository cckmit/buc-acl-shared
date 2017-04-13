package com.alibaba.buc.api.datapermission.result;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 封装外部数据源分页信息
 * 类OutDataSourcePageResultModel.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年11月2日 下午3:04:51
 */
public class OutDataSourcePageResultModel implements Serializable{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 2239307717255220082L;
    
    /**
     * 匹配查询的结果总数
     */
    private Integer recordCount;

    
    public Integer getRecordCount() {
        return recordCount;
    }

    
    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
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
