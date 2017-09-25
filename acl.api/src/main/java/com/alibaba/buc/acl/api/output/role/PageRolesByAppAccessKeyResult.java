package com.alibaba.buc.acl.api.output.role;

import java.io.Serializable;

public class PageRolesByAppAccessKeyResult implements Serializable {
	
    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 角色code
     */
    private String name;
    
    /**
     * 角色中文名
     */
    private String title;
    
    /**
     * 角色描述
     */
    private String description;

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String description) {
        this.description = description;
    }
    
}
