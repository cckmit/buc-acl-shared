package com.alibaba.buc.acl.api.input.role;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 分页查询角色入参
 * 类PageRolesByAppNameParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2017年9月25日 上午9:34:14
 */
public class PageRolesByAppAccessKeyParam extends AclParam{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 6484748423804310361L;
    
    /**
     * 角色中文名，支持全模糊查询
     */
	private String title;
	
	/**
	 * 角色code
	 */
	private String name;
	
	/**
	 * 为true时返回结果包含其他应用共享给此应用的角色，false或者为空代表不包含
	 */
	private Boolean includeSharedRole;

    
    
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



    public Boolean getIncludeSharedRole() {
        return includeSharedRole;
    }


    
    public void setIncludeSharedRole(Boolean includeSharedRole) {
        this.includeSharedRole = includeSharedRole;
    }
    
}
