package com.alibaba.buc.api.param;

import java.io.Serializable;
import java.util.List;

/**
 * 封装角色与角色关系的参数对象
 * @author tongxu.ay
 *
 */
public class RoleRelationParam implements Serializable {

    /**
	 * 序列化版本号
	 */
	private static final long serialVersionUID = -3339693354423653637L;
	
	/**
	 * 应用名
	 */
	private String appName;
	
	/**
	 * 父角色名
	 */
	private String parentRoleName;

	/**
	 * 子角色名列表
	 */
	private List<String> subRoleNames;

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getParentRoleName() {
		return parentRoleName;
	}

	public void setParentRoleName(String parentRoleName) {
		this.parentRoleName = parentRoleName;
	}

	public List<String> getSubRoleNames() {
		return subRoleNames;
	}

	public void setSubRoleNames(List<String> subRoleNames) {
		this.subRoleNames = subRoleNames;
	}
}
