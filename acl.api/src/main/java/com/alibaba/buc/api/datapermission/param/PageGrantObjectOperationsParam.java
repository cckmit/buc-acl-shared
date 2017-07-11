package com.alibaba.buc.api.datapermission.param;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 分页查询授权对象能够执行操作的参数
 * 类PageGrantObjectOperationsParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2017年6月19日 上午11:28:52
 */
public class PageGrantObjectOperationsParam extends AclParam {


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
    
    /**
     * ，过滤条件，数据权限name，可不填
     */
    private List<String>      dataPermissionNames;

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
    
    
    public List<String> getDataPermissionNames() {
        return dataPermissionNames;
    }


    
    public void setDataPermissionNames(List<String> dataPermissionNames) {
        this.dataPermissionNames = dataPermissionNames;
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
