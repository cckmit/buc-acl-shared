package com.alibaba.buc.api.condition;

/**
 * 封装权限相关查询参数
 * @author tongxu
 *
 */
public class PermissionQueryCondition implements Condition {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -928236810032647038L;

    /**
     * 权限名
     */
    private String            permissionName;
    
    /**
     * 所属应用名
     */
    private String appName;
    
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}


}
