package com.alibaba.buc.api.datapermission.param;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 分页查询用户操作
 * 类PageUserOperationsParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2017年6月19日 上午11:25:06
 */
public class PageUserOperationsParam extends AclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -7741913492696810396L;

    /**
     * 用户id
     */
    private Integer           userId;
    
    /**
     * ，过滤条件，数据权限name，可不填
     */
    private List<String>      dataPermissionNames;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }  
    
    public List<String> getDataPermissionNames() {
        return dataPermissionNames;
    }

    public void setDataPermissionNames(List<String> dataPermissionNames) {
        this.dataPermissionNames = dataPermissionNames;
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
