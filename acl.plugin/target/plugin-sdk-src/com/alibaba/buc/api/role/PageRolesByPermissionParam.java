package com.alibaba.buc.api.role;

import java.io.Serializable;

/**
 * @author geekchen.zc
 */
public class PageRolesByPermissionParam implements Serializable {

	private static final long serialVersionUID = -7697750854139689052L;
	
	// 权限名
    private String            name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
	
}