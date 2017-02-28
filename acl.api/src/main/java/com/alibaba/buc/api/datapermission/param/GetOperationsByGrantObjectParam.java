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

@GroupSequence(value = { Sb1.class, S1.class, Sa1.class, S2.class, Oper.class, GetOperationsByGrantObjectParam.class })
@AppKeyPrivilegeAnnotation(appKeyField = "accessKey", keyCenterAccessKeyField = "keyCenterAccessKey", interfaceNameField = "DataAccessControlService.getOperationsByGrantObject", groups = { Sa1.class })
/**
 * 查询授权对象拥有的操作
 * 类GetOperationsByGrantObjectParam.java的实现描述：TODO 类实现描述 
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
