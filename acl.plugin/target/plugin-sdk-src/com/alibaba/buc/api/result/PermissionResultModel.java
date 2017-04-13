package com.alibaba.buc.api.result;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.alibaba.buc.api.param.RiskLevel;

public class PermissionResultModel implements ResultModel {

    private static final long serialVersionUID = -4864194443541241197L;

    private String            permissionName;
    private String            permissionInfo;
    
    /**
	 * 权限名
	 */
	private String permissionTitle;
	
	/**
	 * 权限描述
	 */
	private String permissionDesc;

	/**
	 * 权限ownerId列表
	 */
	private List<Integer> permissionOwnerIdList;

	/**
	 * 风险等级
	 */
	private RiskLevel riskLevel;

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionInfo() {
        return permissionInfo;
    }

    public void setPermissionInfo(String permissionInfo) {
        this.permissionInfo = permissionInfo;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

	public String getPermissionTitle() {
		return permissionTitle;
	}

	public void setPermissionTitle(String permissionTitle) {
		this.permissionTitle = permissionTitle;
	}

	public String getPermissionDesc() {
		return permissionDesc;
	}

	public void setPermissionDesc(String permissionDesc) {
		this.permissionDesc = permissionDesc;
	}

	public List<Integer> getPermissionOwnerIdList() {
		return permissionOwnerIdList;
	}

	public void setPermissionOwnerIdList(List<Integer> permissionOwnerIdList) {
		this.permissionOwnerIdList = permissionOwnerIdList;
	}

	public RiskLevel getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(RiskLevel riskLevel) {
		this.riskLevel = riskLevel;
	}
    
    
    
}
