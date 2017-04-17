package com.alibaba.buc.api.permission;

import java.io.Serializable;

/**
 * @author baidian.zc
 */
public class DeletePermissionParam implements Serializable {

	private static final long serialVersionUID = 8054792466509408314L;
	
	// 接口操作主体，公共账号userId，须先授予公共账号接口操作权限，调用时会校验该公共账号是否拥权限（注意：不是当前登录人的userId）
    private String            principalUserId;
    
    // 应用名称
    private String            appName;
    
    // 权限名称
    private String            name;
    
    // 操作人的用户id, 当前权限变更的发起人
    private String            operatorUserId; 
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAppName() {
        return appName;
    }
   
    public void setAppName(String appName) {
        this.appName = appName;
    }
  
    public String getPrincipalUserId() {
        return principalUserId;
    }

    public void setPrincipalUserId(String principalUserId) {
        this.principalUserId = principalUserId;
    }
    
    public String getOperatorUserId() {
        return operatorUserId;
    }

    public void setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
    }
	
}
