package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.test.CreateTestParam;

public interface TestService {
	
	public AclResult createTest(CreateTestParam param);
    

}
