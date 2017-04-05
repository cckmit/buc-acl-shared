package com.alibaba.buc.api.grant;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 清除授权对象指定数据权限参数
 *
 * @author tongxu 2016年9月5日 下午5:17:21
 */
public class CleanDataPermissionParam extends AclParam {


    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -9102425907769922059L;

    /**
     * 数据权限模型
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
     * 过滤条件：来源name,目前是关联的角色name，代表要回收的数据权限必须是通过sourceName对应角色获取到的
     */
    private String sourceName;
    
    /**
     * 过滤条件：来源类型，直接授权为DIRECT，来自ROLE为ROLE，可以取DataPermissionConstaints.SOURCE_TYPE_ROLE设置，普通授权可以为空
     */
    private String sourceType;

    
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

