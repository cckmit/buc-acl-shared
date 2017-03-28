package com.alibaba.buc.api.datapermission.param;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 查询用户拥有数据权限对应操作的参数
 *
 * @author tongxu 2015年9月22日 上午10:18:53
 */
public class GetDataPermissionOperationsParam extends AclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -7741913492696810396L;

    /**
     * 用户id
     */
    private Integer           userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
