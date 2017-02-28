package com.alibaba.buc.api.param;

import java.io.Serializable;

public class DataPermissionParam implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -7004190353538650310L;

    /**
     * 操作英文名，非必填，但如果填了资源名，就必填
     */
    private String            operationName;

    /**
     * 资源英文名，非必填，但如果填了操作名，就必填
     */
    private String            resourceName;

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

}
