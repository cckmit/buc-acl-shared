package com.alibaba.buc.api.condition;

import java.util.Map;

import com.alibaba.buc.acl.api.common.NormalAclParam;

public class ApplyingDataPermissionCondition extends NormalAclParam{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -5286456290489127873L;

    /**
     * 查询的数据权限
     */
    private String dataPermissionName;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 授予的操作name
     */
    private String operationName;

    /**
     * 数据map，key是属性name，value是值
     * 
     * 必须与数据权限关联数据模型中的属性数据一一对应
     */
    private Map<String,String> dataMap;

    
    public String getDataPermissionName() {
        return dataPermissionName;
    }

    
    public void setDataPermissionName(String dataPermissionName) {
        this.dataPermissionName = dataPermissionName;
    }

    
    public Integer getUserId() {
        return userId;
    }

    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    public String getOperationName() {
        return operationName;
    }

    
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    
    public Map<String, String> getDataMap() {
        return dataMap;
    }


    public void setDataMap(Map<String, String> dataMap) {
        this.dataMap = dataMap;
    }

}
