package com.alibaba.buc.api.datapermission.param;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 封装数据审批人查询参数
 * 类FindDataApproverParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年12月30日 上午11:28:01
 */
public class FindDataApproverParam extends BasicOutDataSourceQueryParam{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1697789138069333901L;
    
    /**
     * 申请人的bucid
     */
    private Integer applyUserId;
    
    /**
     * 要查询审批人的数据value列表
     */
    private List<String> dataValueList;

    
    public List<String> getDataValueList() {
        return dataValueList;
    }

    
    public void setDataValueList(List<String> dataValueList) {
        this.dataValueList = dataValueList;
    }
    
    
    public Integer getApplyUserId() {
        return applyUserId;
    }

    
    public void setApplyUserId(Integer applyUserId) {
        this.applyUserId = applyUserId;
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
