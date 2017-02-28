package com.alibaba.buc.api.datapermission.result;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.api.datapermission.param.DataProfileParam;

/**
 * 数据权限验权结果对象
 * 类CheckDataPermissionResultModel.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月16日 上午9:43:32
 */
public class CheckDataPermissionResult implements Serializable{
    
    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -6463535875642162302L;

    /**
     * 验权结果的对应数据
     */
    private DataProfileParam data;
    
    /**
     * 验权结果
     */
    private Boolean accessible;

    
    public DataProfileParam getData() {
        return data;
    }
    
    public void setData(DataProfileParam data) {
        this.data = data;
    }
    
    public Boolean getAccessible() {
        return accessible;
    }


    public Boolean isAccessible() {
        return accessible;
    }

    
    public void setAccessible(Boolean accessible) {
        this.accessible = accessible;
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
