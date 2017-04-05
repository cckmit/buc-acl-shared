package com.alibaba.buc.acl.api.input.role;

import com.alibaba.buc.acl.api.common.AclParam;


/**
 * 分页查询数据权限模型关联操作的入参
 *
 * @author tongxu 2016年4月28日 下午4:07:20
 */
public class PageDataPermissionModelPropertyParam extends AclParam {

    private static final long serialVersionUID = 8544782005254653337L;

    /**
     * 数据权限模型名
     */
    private String dataPermissionModelName;

    public String getDataPermissionModelName() {
        return dataPermissionModelName;
    }

    public void setDataPermissionModelName(String dataPermissionModelName) {
        this.dataPermissionModelName = dataPermissionModelName;
    }

}
