package com.alibaba.buc.api.condition;

public class MenuCondition implements Condition {

    private static final long serialVersionUID = 1279487560142920782L;

    private String            appName;

    private String            userId;

    private String            startMenuId;

    private String            startMenuName;
    
    /**
     * is开头，用eclipse生成getter, setter, 容易出错。
     */
    private Boolean         recursive;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStartMenuId() {
        return startMenuId;
    }

    public void setStartMenuId(String startMenuId) {
        this.startMenuId = startMenuId;
    }

    public String getStartMenuName() {
        return startMenuName;
    }

    public void setStartMenuName(String startMenuName) {
        this.startMenuName = startMenuName;
    }

	public Boolean getRecursive() {
		return recursive;
	}

	public void setRecursive(Boolean recursive) {
		this.recursive = recursive;
	}
    
    

}
