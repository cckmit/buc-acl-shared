package com.alibaba.buc.acl.api.input.app;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 获取单个应用的入参
 *
 * @author taigao
 */
public class GetAppParam extends AclParam {

    private static final long serialVersionUID = 6193356594476111706L;

    /**
     * 应用名 英文
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
