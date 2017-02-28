package com.alibaba.buc.api.datapermission.param;

import java.util.List;

import javax.validation.GroupSequence;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
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
//                       Oper.class,
                       GetDataPermissionDatasParam.class
               }
       )

    @AppKeyPrivilegeAnnotation(
           appKeyField = "accessKey",
           keyCenterAccessKeyField="keyCenterAccessKey",
           interfaceNameField = "DataAccessControlService.getDataPermissionDatas",
           groups = {Sa1.class}
       )
/**
 * 查询用户拥有数据权限对应数据得参数
 * 类GetDataPermissionDatasParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月22日 上午10:18:53
 */
public class GetDataPermissionDatasParam extends AclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1003176948938437797L;
    
    /**
     * 用户id
     */
    private Integer           userId;  
    
    /**
     * 操作code，不填则返回所有资源
     */
    private List<String>      operationNames;
    
    /**
     * ，过滤条件，数据权限name，可不填
     */
    private List<String>      dataPermissionNames;
    
    /**
     * 来源角色name列表，设定只返回通过拥有roleNames角色而拥有的数据
     */
    private List<String>      roleNames;
    
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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

    @Override
    public int hashCode() {
        return  HashCodeBuilder.reflectionHashCode(this);
    }

    public List<String> getDataPermissionNames() {
        return dataPermissionNames;
    }

    
    public void setDataPermissionNames(List<String> dataPermissionNames) {
        this.dataPermissionNames = dataPermissionNames;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
}
