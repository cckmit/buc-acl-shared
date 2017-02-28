package com.alibaba.buc.api.datapermission.param;

import java.util.List;

import javax.validation.GroupSequence;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.common.AclParam;

@GroupSequence(
               value = {
                       Sb1.class,
                       S1.class,
                       Sa1.class,
                       S2.class,
                       Oper.class,
                       GetDatasByGrantObjectParam.class
               }
       )

    @AppKeyPrivilegeAnnotation(
           appKeyField = "accessKey",
           keyCenterAccessKeyField="keyCenterAccessKey",
           interfaceNameField = "DataAccessControlService.getDatasByGrantObject",
           groups = {Sa1.class}
       )
/**
 * 查询授权对象拥有数据权限数据得参数
 * 类GetDatasByGrantObjectParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月22日 上午10:18:53
 */
public class GetDatasByGrantObjectParam extends AclParam {

    
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
     * 来源角色name列表，设定只返回通过拥有roleNames角色而拥有的数据
     * 
     * 目前这个参数只作用于查用户数据的业务场景，查角色下数据请设置grantObjectName
     * 
     */
    private List<String>      roleNames;
    
    public List<String> getOperationNames() {
        return operationNames;
    }
    
    public void setOperationNames(List<String> operationNames) {
        this.operationNames = operationNames;
    }       
    
    
    public List<String> getRoleNames() {
        return roleNames;
    }

    
    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
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
