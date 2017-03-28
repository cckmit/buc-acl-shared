package com.alibaba.buc.acl.api.input.role;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 封装从角色移除数据权限参数对象
 *
 * @author tongxu 2016年4月19日 下午5:16:17
 */
public class RemoveDataPermissionsFromRoleParam extends AclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 4743291785342584830L;

    /**
     * 授权指定的操作、属性组合所属数据权限模型name，以便判断授权数据是否规范
     */
    private String dataPermissionModelName;

    /**
     * 要授予的角色name
     */
    private String roleName;

    /**
     * 授予的操作name列表
     */
    private List<String> operationNameList;

    /**
     * 授予的数据map，key是属性name，value是值列表
     */
    private Map<String, List<String>> dataMap;

    /**
     * 过期时间
     */
    private Date expireDate;

    public String getDataPermissionModelName() {
        return dataPermissionModelName;
    }

    public void setDataPermissionModelName(String dataPermissionModelName) {
        this.dataPermissionModelName = dataPermissionModelName;
    }

    public List<String> getOperationNameList() {
        return operationNameList;
    }

    public void setOperationNameList(List<String> operationNameList) {
        this.operationNameList = operationNameList;
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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
