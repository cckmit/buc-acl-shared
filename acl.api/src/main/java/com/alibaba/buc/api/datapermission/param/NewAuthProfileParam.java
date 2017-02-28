package com.alibaba.buc.api.datapermission.param;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.acl.api.common.NormalAclParam;

/**
 * 封装描述数据权限的操作＋资源信息
 * 类AuthProfile.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月15日 下午1:34:06
 */
public class NewAuthProfileParam extends NormalAclParam{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -6456348806272984496L;

    /**
     * 用户信息
     */
    private UserProfileParam user;
    
    /**
     * 操作信息
     */
    private OperationProfileParam operation;
    
    /**
     * 数据信息列表
     */
    private List<DataProfileParam> dataList;

    
    public UserProfileParam getUser() {
        return user;
    }

    
    public void setUser(UserProfileParam user) {
        this.user = user;
    }

    
    public OperationProfileParam getOperation() {
        return operation;
    }

    
    public void setOperation(OperationProfileParam operation) {
        this.operation = operation;
    }

    
    public List<DataProfileParam> getDataList() {
        return dataList;
    }

    
    public void setDataList(List<DataProfileParam> dataList) {
        this.dataList = dataList;
    }

    
    public static long getSerialversionuid() {
        return serialVersionUID;
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
