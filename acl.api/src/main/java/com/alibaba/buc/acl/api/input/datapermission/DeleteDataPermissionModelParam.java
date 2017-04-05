package com.alibaba.buc.acl.api.input.datapermission;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 封装数据权限模型删除相关信息
 *
 * @author tongxu 2016年9月1日 下午2:13:32
 */
public class DeleteDataPermissionModelParam extends AclParam {

	private static final long serialVersionUID = 4135372589910768550L;
    
    // 要删除的数据权限模型name
    private String            name;
    
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
  
	
}
