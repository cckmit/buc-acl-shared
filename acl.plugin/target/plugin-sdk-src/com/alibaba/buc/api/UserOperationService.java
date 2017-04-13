package com.alibaba.buc.api;

import java.util.List;
import java.util.Map;

import com.alibaba.buc.api.condition.resource.ResourceCondition;
import com.alibaba.buc.api.exception.BucException;
import com.alibaba.buc.api.model.Operation;

public interface UserOperationService {
	
	/**
	 * 查询用户所授权的资源上有什么操作
	 * 
	 * @param principal
	 * @param appName
	 * @param resourceConditionList
	 * @return
	 * @throws BucException
	 */
	Map<ResourceCondition, List<Operation>> findUserOperationByResource(
			Principal principal, String appName,
			List<ResourceCondition> resourceConditionList) throws BucException;
}
