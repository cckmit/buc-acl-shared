package com.alibaba.buc.api.condition;

import java.util.List;
import java.util.Map;

import com.alibaba.buc.api.param.RiskLevel;

public class PermissionCondition implements Condition {

    private static final long   serialVersionUID = -5352286937290162658L;

    /**
     * 权限域名
     */
    @Deprecated
    private String              domainName;

    /**
     * 帐号
     */
    @Deprecated
    private String              accountName;

    /**
     * 权限名
     */
    private List<String>        permissionNames;

    /**
     * 上下文
     */
    private Map<String, String> context;
    
    /**
     * 应用英文名，必选
     */
    private String            appCode;
    
    /**
     * 权限code，必选
     */
    private String            permissionCode;
    
    /**
     * 权限中文名，必选
     */
    private String            permissionTitle;

    /**
     * 权限风险等级，必选, 默认值为高风险；风险等级关系到申请流程，请根据实际情况选择
     */
    private RiskLevel         riskLevel;

    @Deprecated
    public String getDomainName() {
        return this.domainName;
    }

    @Deprecated
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Deprecated
    public String getAccountName() {
        return this.accountName;
    }

    @Deprecated
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public List<String> getPermissionNames() {
        return permissionNames;
    }

    public void setPermissionNames(List<String> permissionNames) {
        this.permissionNames = permissionNames;
    }

    public Map<String, String> getContext() {
        return context;
    }

    public void setContext(Map<String, String> context) {
        this.context = context;
    }

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getPermissionCode() {
		return permissionCode;
	}

	public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
	}

	public String getPermissionTitle() {
		return permissionTitle;
	}

	public void setPermissionTitle(String permissionTitle) {
		this.permissionTitle = permissionTitle;
	}

	public RiskLevel getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(RiskLevel riskLevel) {
		this.riskLevel = riskLevel;
	}
}
