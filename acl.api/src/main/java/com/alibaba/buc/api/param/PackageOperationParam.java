package com.alibaba.buc.api.param;

import java.io.Serializable;
import java.util.List;

public class PackageOperationParam  implements Serializable{

	private static final long serialVersionUID = -6339610431448938069L;
	
	  /**
     * 操作包name
     */
    private String            operationPackName;
    /**
     * 被打包的操作名稱列表
     */
    private List<String>      operationNames;
    
    /**
     * 创建人的用户id，当前操作变更的发起人
     */
    private String            creatorUserId;
    
	public String getOperationPackName() {
		return operationPackName;
	}
	public void setOperationPackName(String operationPackName) {
		this.operationPackName = operationPackName;
	}
	public List<String> getOperationNames() {
		return operationNames;
	}
	public void setOperationNames(List<String> operationNames) {
		this.operationNames = operationNames;
	}
	public String getCreatorUserId() {
		return creatorUserId;
	}
	public void setCreatorUserId(String creatorUserId) {
		this.creatorUserId = creatorUserId;
	}
}
