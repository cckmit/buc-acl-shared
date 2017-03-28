package com.alibaba.buc.acl.api.input.datapermission;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 封装数据模型删除相关参数
 *
 * @author tongxu 2016年9月1日 下午2:13:32
 */
public class DeleteDataModelParam extends AclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -6815790953200523118L;
    
    // 要删除的数据模型name
    private String            name;
    
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
  
	
}
