package com.alibaba.buc.acl.api.input.datapermission;

import javax.validation.GroupSequence;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 根据权限名查询权限入参
 * <p/>
 * {@link com.alibaba.buc.api.PermissionService#getPermission(GetDataPermissionModelParam)}
 *
 * @author yicheng.wp
 */
/**
 * @author baidian.zc
 */
@GroupSequence(
               value = {
                       Sb1.class,
                       S1.class,
                       Sa1.class,
                       S2.class,
                       Oper.class,
                       GetDataPermissionModelParam.class
               }
       )

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "DataPermissionModelService.getDataPermissionModel",
        groups = {Sa1.class}
)

public class GetDataPermissionModelParam extends AclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -2563147309523404298L;
    
    /**
     * 要查询的数据权限模型name
     */
    private String name;

    
    public String getName() {
        return name;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
}
