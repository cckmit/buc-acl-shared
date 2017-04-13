package com.alibaba.buc.api.param;

import java.util.List;

import com.alibaba.buc.api.common.AclParam;


public class UserReverseRolesParam implements AclParam {

	private static final long serialVersionUID = -5787199900025609418L;

	private Integer principalUserId; // 接口操作主体，公共账号userId，须先授予公共账号接口操作权限，调用时会校验该公共账号是否拥权限（注意：不是当前登录人的userId）

    private String appName; // 角色所在的应用

    private Integer userId; // UC中的userId

    private List<String> roleNames; // 角色名列表
    
    //暂不支持冻结Freeze操作
    private Action action;
    
    private String reverseReason; //reason必填

    public Integer getPrincipalUserId() {
        return principalUserId;
    }

    public void setPrincipalUserId(Integer principalUserId) {
        this.principalUserId = principalUserId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public List<String> getRoleNames() {
		return roleNames;
	}

	public void setRoleNames(List<String> roleNames) {
		this.roleNames = roleNames;
	}

    
    public Action getAction() {
        return action;
    }

    
    public void setAction(Action action) {
        this.action = action;
    }

    
    public String getReverseReason() {
        return reverseReason;
    }

    
    public void setReverseReason(String reverseReason) {
        this.reverseReason = reverseReason;
    }

    
}
