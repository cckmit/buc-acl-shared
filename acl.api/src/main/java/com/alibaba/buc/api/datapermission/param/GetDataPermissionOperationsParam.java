package com.alibaba.buc.api.datapermission.param;

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
                       GetDataPermissionOperationsParam.class
               }
       )

    @AppKeyPrivilegeAnnotation(
           appKeyField = "accessKey",
           keyCenterAccessKeyField="keyCenterAccessKey",
           interfaceNameField = "DataAccessControlService.getDataPermissionOperations",
           groups = {Sa1.class}
       )
/**
 * 查询用户拥有数据权限对应操作的参数
 * 类GetDataPermissionDatasParam.java的实现描述：TODO 类实现描述 
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
