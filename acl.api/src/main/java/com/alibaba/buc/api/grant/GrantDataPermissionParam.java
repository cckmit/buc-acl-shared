package com.alibaba.buc.api.grant;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.alibaba.buc.acl.api.common.AclParam;
import com.alibaba.buc.api.param.Action;

/**
 * 授予/冻结/移除数据权限
 *
 * @author tongxu 2016年3月2日 下午2:29:05
 */
public class GrantDataPermissionParam extends AclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 3582087100298809951L;

    /**
     * 授权指定的操作、属性组合所属数据权限模型name，以便判断授权数据是否规范
     */
    private String dataPermissionModelName;

    /**
     * 授权对象id
     */
    private String grantObjectId;

    /**
     * 授权对象类型,可使用DataPermissionConstaints中的GRANT_OBJECT_TYPE_XXX常量
     */
    private String grantObjectType;
    
    /**
     * 来源name,目前是关联的角色name，以代表该授权是因为用户被授予角色而得到的，关联后用户角色冻结回收会同步冻结、回收此数据权限，普通授权可以为空
     */
    private String sourceName;
    
    /**
     * 来源类型，直接授权为DIRECT，来自ROLE为ROLE，可以取DataPermissionConstaints.SOURCE_TYPE_ROLE设置，普通授权可以为空
     */
    private String sourceType;

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

    /**
     * 授予动作，是授予还是冻结、回收，通过此参数设置
     */
    private Action action;

    
    public String getDataPermissionModelName() {
        return dataPermissionModelName;
    }

    
    public void setDataPermissionModelName(String dataPermissionModelName) {
        this.dataPermissionModelName = dataPermissionModelName;
    }

    
    public String getGrantObjectId() {
        return grantObjectId;
    }

    
    public void setGrantObjectId(String grantObjectId) {
        this.grantObjectId = grantObjectId;
    }

    
    public String getGrantObjectType() {
        return grantObjectType;
    }

    
    public void setGrantObjectType(String grantObjectType) {
        this.grantObjectType = grantObjectType;
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

    
    public Action getAction() {
        return action;
    }

    
    public void setAction(Action action) {
        this.action = action;
    }

    public String getSourceName() {
        return sourceName;
    }

    
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }


    public String getSourceType() {
        return sourceType;
    }


    
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    } 
    
    

}

