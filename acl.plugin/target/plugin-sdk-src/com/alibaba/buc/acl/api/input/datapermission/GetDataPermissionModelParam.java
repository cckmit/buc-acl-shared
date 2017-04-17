package com.alibaba.buc.acl.api.input.datapermission;

import com.alibaba.buc.acl.api.common.AclParam;

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
