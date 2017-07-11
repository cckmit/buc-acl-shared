package com.alibaba.buc.api.datapermission.param;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 分页查询授权对象数据的参数对象
 * 类PageGrantObjectDatasParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2017年6月19日 上午11:35:38
 */
public class PageGrantObjectDatasParam extends AclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -6637411520523485884L;

    /**
     * 角色、用户组的name
     */
    private String            grantObjectName;

    /**
     * DataPermissionConstaints.GRANT_OBJECT_TYPE_ROLE代表角色（目前仅支持角色）
     */
    private String            grantObjectType;
    
    /**
     * 操作code，不填则返回所有资源
     */
    private List<String>      operationNames;

    /**
     * ，过滤条件，数据权限name，可不填
     */
    private List<String>      dataPermissionNames;
    
    
    public List<String> getOperationNames() {
        return operationNames;
    }
    
    public void setOperationNames(List<String> operationNames) {
        this.operationNames = operationNames;
    }       
    
    public List<String> getDataPermissionNames() {
        return dataPermissionNames;
    }

    public void setDataPermissionNames(List<String> dataPermissionNames) {
        this.dataPermissionNames = dataPermissionNames;
    }

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
        return  HashCodeBuilder.reflectionHashCode(this);
    }

   
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
}
