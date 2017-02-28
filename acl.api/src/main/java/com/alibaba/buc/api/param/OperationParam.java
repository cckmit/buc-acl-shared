package com.alibaba.buc.api.param;

import java.io.Serializable;

public class OperationParam  implements Serializable{

	private static final long serialVersionUID = -6339610431448938069L;
	
	
	   /**
     * 应用英文名，必选
     */
    private String            appName;
	
	   /**
     * 操作名，必选
     */
    private String            title;

    /**
     * 操作name，必选
     */
    private String            name;
    
    /**
     * 操作描述，必选
     */
    private String            description;
    
    /**
     * 是否包類型,默認為非包的類型
     */
    private boolean           isPackage;
    
    /**
     * 创建人的用户id，当前操作变更的发起人
     */
    private String            creatorUserId;
    
    
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isPackage() {
		return isPackage;
	}
	public void setPackage(boolean isPackage) {
		this.isPackage = isPackage;
	}
	public String getCreatorUserId() {
		return creatorUserId;
	}
	public void setCreatorUserId(String creatorUserId) {
		this.creatorUserId = creatorUserId;
	}
}
