package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.input.app.CheckAppContainsPermOrRoleParam;
import com.alibaba.buc.acl.api.input.app.GetAppParam;
import com.alibaba.buc.acl.api.output.app.AppResult;
import com.alibaba.buc.acl.api.output.app.CheckAppContainsPermOrRoleResult;

public interface AppService {

    /**
     *获取单个应用
     * @param param
     * @return
     */
    public AppResult getApp(GetAppParam param);
    
    /**
     * 判读某个应用下是否包含权限或者角色
     * @param param
     * @return
     */
    public CheckAppContainsPermOrRoleResult checkAppContainsPermOrRole(CheckAppContainsPermOrRoleParam param);

}
