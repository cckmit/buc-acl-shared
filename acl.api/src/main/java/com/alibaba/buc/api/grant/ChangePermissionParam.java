package com.alibaba.buc.api.grant;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 变更权限参数
 * 类ChangePermissionParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2017年9月12日 上午10:25:02
 */
public class ChangePermissionParam extends AclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 3582087100298809951L;
    
    /**
     * 数据权限name
     */
    private String dataPermissionName;

    /**
     * 授权指定的操作、属性组合所属数据权限模型name，以便判断授权数据是否规范
     */
    private String dataPermissionModelName;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 角色name
     */
    private String roleName;

    /**
     * 授予的操作name
     */
    private String operationName;

    /**
     * 授予的数据map，key是属性name，value是值列表
     */
    private Map<String,List<String>> dataMap;

    /**
     * 过期时间
     */
    private Date expireDate;

    
    public String getDataPermissionName() {
        return dataPermissionName;
    }

    
    public void setDataPermissionName(String dataPermissionName) {
        this.dataPermissionName = dataPermissionName;
    }

    
    public String getDataPermissionModelName() {
        return dataPermissionModelName;
    }

    
    public void setDataPermissionModelName(String dataPermissionModelName) {
        this.dataPermissionModelName = dataPermissionModelName;
    }

    
    public Integer getUserId() {
        return userId;
    }

    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    public String getRoleName() {
        return roleName;
    }

    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    
    public String getOperationName() {
        return operationName;
    }

    
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    
    public Map<String, List<String>> getDataMap() {
        return dataMap;
    }

    
    public void setDataMap(Map<String, List<String>> dataMap) {
        this.dataMap = dataMap;
    }

    
    public Date getExpireDate() {
        return expireDate;
    }

    
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    } 
    
    
}

