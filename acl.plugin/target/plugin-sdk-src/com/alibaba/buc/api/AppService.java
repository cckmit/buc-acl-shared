package com.alibaba.buc.api;

import java.util.List;

import com.alibaba.buc.api.common.AclPagination;
import com.alibaba.buc.api.condition.AppCondition;
import com.alibaba.buc.api.exception.BucException;
import com.alibaba.buc.api.permission.PagePermissionsByUserParam;
import com.alibaba.buc.api.permission.PermissionResult;
import com.alibaba.buc.api.result.AppResultModel;
import com.alibaba.buc.api.app.GetAppParam;
import com.alibaba.buc.api.app.AppResult;

/**
 * 封装app相关服务
 * @author tongxu.ay
 *
 */
public interface AppService {


	/**
     * @deprecated {@link AppService#getApp(com.alibaba.buc.api.app.GetAppParam)}
     * 
     * 提供给外部系统使用的接口，根据param的值查询满足条件的app
     * 
     * 此接口支持id、title、name属性查询
     * 
     * 如果查询参数全为空，则返回全部
     * 
     * @return
     */
    public List<AppResultModel> findApp(AppCondition condition) throws BucException;
    
    /**
     * 根据应用名查询app
     * @throws BucException
     * 
     * <ul>
     * <li>{@link GetAppParam#setName(String)} 应用名, 英文, 必填</li>
     * </ul>
     * <ul>
     * <li>出参中的AppResult的说明<li>
     * <li>{@link AppResult#getName()} String, 应用英文名</li>
     * <li>{@link AppResult#getTitle()} String, 应用中文名</li>
     * <li>{@link AppResult#getDescription()} String, 应用描述</li>
     * <li>{@link AppResult#getAoneAppId()} String, 应用的aoneAppId</li>
     * </ul>
     * 
     */
    @Deprecated
    public AppResult getApp(GetAppParam param) throws BucException;
}
