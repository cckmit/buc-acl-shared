package com.alibaba.buc.api;

import java.util.List;
import java.util.Map;
import com.alibaba.buc.api.action.ActionResult;
import com.alibaba.buc.api.action.CreateActionParam;
import com.alibaba.buc.api.action.DeleteActionParam;
import com.alibaba.buc.api.action.GetActionParam;
import com.alibaba.buc.api.action.UpdateActionParam;
import com.alibaba.buc.api.check.CheckActionsParam;
import com.alibaba.buc.api.check.CheckActionsResult;
import com.alibaba.buc.api.condition.ActionCondition;
import com.alibaba.buc.api.condition.BaseActionCondition;
import com.alibaba.buc.api.condition.UrlActionCondition;
import com.alibaba.buc.api.exception.BucException;
import com.alibaba.buc.api.result.ActionResultModel;

/**
 * ActionService
 * 
 * @author shenwujie 2012-10-10 下午5:05:55
 */
public interface ActionService {

    

    /**
     * 验权
     *
     * @param checkActionsParam 入参
     * @return List<CheckActionsResult>
     * @throws BucException
     * @since 1.9
     */
	@Deprecated
    public List<CheckActionsResult> checkActions(CheckActionsParam checkActionsParam) throws BucException;
    
    
    
   /**
    * 创建url的接口
    * @param createUrlParam 入参
    * @throws BucException
    * @since 1.9
    */
	@Deprecated
    public  void createAction(CreateActionParam createActionParam) throws BucException;
    
    
    /**
     * 更新url的接口
     * @param updateUrlParam
     * @throws BucException
     */
	@Deprecated
    public void updateAction(UpdateActionParam updateActionParam) throws BucException;
    
    /**
     * 删除url的接口
     * @param deleteUrlParam
     * @throws BucException
     */
	@Deprecated
    public void deleteAction(DeleteActionParam deleteActionParam) throws BucException ;
    
    /**
     * 根据action的 name 或者 pattern 来获取某一个action, 如果url 和 pattern都不为null时，请确保
     * 它们有且只能取到一个，否则报错。
     * @param getActionParam
     * @return
     * @throws BucException
     */
	@Deprecated
    public ActionResult getAction(GetActionParam getActionParam) throws BucException;
    
    
    
    
    //-----------------------以下为过期接口，后期将不提供支持，切勿使用--------------------------
    /**
     * 验权
     *
     * @deprecated {@link ActionService#checkActions(CheckActionsParam)}
     * @since 0.3 {@link UrlActionCondition} @deprecated
     * @since 1.0 {@link ActionCondition}
     * @throws BucException
     */
    @Deprecated
    public Map<String, ActionResultModel> checkActions(BaseActionCondition actionCondition) throws BucException;

}
