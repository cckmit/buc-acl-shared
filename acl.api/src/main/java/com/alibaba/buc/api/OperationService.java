package com.alibaba.buc.api;

import java.util.List;

import com.alibaba.buc.api.condition.PageCondition;
import com.alibaba.buc.api.condition.operation.OperationQueryCondition;
import com.alibaba.buc.api.exception.BucException;
import com.alibaba.buc.api.model.Page;
import com.alibaba.buc.api.param.OperationParam;
import com.alibaba.buc.api.param.PackageOperationParam;
import com.alibaba.buc.api.result.OperationResultModel;


/**
 * @deprecated
 */
public interface OperationService {
	
	/**
	 * 创建操作或者操作包
	 * @param principal
	 * @param param
	 * @throws BucException
	 */
	void createOperation(Principal principal, OperationParam param) throws BucException;
	
	/**
	 * 修改操作或者操作包
	 * 不允许修改操作名称和是否是操作包
	 * @param principal
	 * @param param
	 * @throws BucException
	 */
	void updateOperation(Principal principal, OperationParam param) throws BucException;
	
	/**
	 * 删除操作或者操作包
	 * param只需填写name属性即可
	 * @param principal
	 * @param param
	 * @throws BucException
	 */
	void deleteOperation(Principal principal, OperationParam param) throws BucException;
	
	/**
	 * 给操作包增加操作
	 * 最多可以插入100条，例如给1个操作包添加100个操作、或给100个操作包均添加1个操作，可以随机组合，总数不能超过100
	 * @param principal
	 * @param appName
	 * @param packageOperationsList
	 * @throws BucException
	 */
	void addOperationToPackage(Principal principal,String appName,List<PackageOperationParam> packageOperationsList) throws BucException;
	
	/**
	 * 给操作包移除操作
	 * 如果关系不存在，则不做操作，不会报异常
	 * 最多可以移除100条，例如给1个操作包移除100个操作、或给100个操作包均移除1个操作，可以随机组合，总数不能超过100
	 * @param principal
	 * @param appName
	 * @param packageOperationsList
	 * @throws BucException
	 */
	void removeOperationFromPackage(Principal principal,String appName,List<PackageOperationParam> packageOperationsList) throws BucException;
	
	/**
	 * 查找操作包里面所有的操作
	 * 
	 * @param appName
	 * @param operationPackName
	 * @return
	 * @throws BucException
	 */
	List<OperationResultModel> findOperationByOperationPackage(String appName,String operationPackName) throws BucException;
	
	/**
	 * 查找操作包或者操作是否存在
	 * param只需填写name属性即可
	 * @param param
	 * @return
	 * @throws BucException
	 */
	boolean isExist(OperationParam param) throws BucException;
	
	/**
	 * 分页查询某应用下的操作包
	 * @return
	 */
	Page<OperationResultModel> pageOperation(PageCondition<OperationQueryCondition> condition) throws BucException;
	
}
