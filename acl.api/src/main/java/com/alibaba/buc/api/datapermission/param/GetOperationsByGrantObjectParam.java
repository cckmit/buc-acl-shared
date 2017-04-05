package com.alibaba.buc.api.datapermission.param;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 查询授权对象拥有的操作
 *
 * @author tongxu 2016年5月11日 上午11:57:00
 */
public class GetOperationsByGrantObjectParam extends AclParam {


    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 5501051681785010384L;

    /**
     * 角色、用户组的name
     */
    private String            grantObjectName;

    /**
     * DataPermissionConstaints.GRANT_OBJECT_TYPE_ROLE代表角色（目前仅支持角色）
     */
    private String            grantObjectType;

    public String getGrantObjectName() {
        return grantObjectName;
    }

    
    public void setGrantObjectName(String grantObjectName) {
        this.grantObjectName = grantObjectName;
    }

    
    public String getGrantObjectType() {
        return grantObjectType;
    }

    
    public void setGrantObjectType(String grantObjectType) {
        this.grantObjectType = grantObjectType;
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

}
