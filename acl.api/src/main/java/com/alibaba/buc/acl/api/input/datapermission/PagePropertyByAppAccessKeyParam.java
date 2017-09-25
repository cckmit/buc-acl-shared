package com.alibaba.buc.acl.api.input.datapermission;

import com.alibaba.buc.acl.api.common.NormalAclParam;

/**
 * 封装属性查询参数
 * 
 * @author tongxu 2016年11月4日 下午1:47:23
 */
public class PagePropertyByAppAccessKeyParam extends NormalAclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -2602623082384324488L;
    
    /**
     * 属性中文名，支持全模糊查询
     */
    private String title;
    
    /**
     * 属性code，支持全模糊查询
     */
    private String name;
    
    /**
     * 所属数据权限
     */
    private String dataPermissionName;
    
    /**
     * 为true时返回结果包含其他应用共享给此应用的属性，false或者为空代表不包含
     */
    private Boolean includeSharedProperty;

    
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

    
    public String getDataPermissionName() {
        return dataPermissionName;
    }

    
    public void setDataPermissionName(String dataPermissionName) {
        this.dataPermissionName = dataPermissionName;
    }

    
    public Boolean getIncludeSharedProperty() {
        return includeSharedProperty;
    }

    
    public void setIncludeSharedProperty(Boolean includeSharedProperty) {
        this.includeSharedProperty = includeSharedProperty;
    }
    
    

    
}
