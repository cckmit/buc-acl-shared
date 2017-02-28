package com.alibaba.buc.acl.api.input.role;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.GroupSequence;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.common.AclParam;

@GroupSequence(
        value = {
                Sb1.class,
                S1.class,
                Sa1.class,
                S2.class,
                Oper.class,
                AddDataPermissionsToRoleParam.class
        }
)

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "RoleService.addDataPermissionToRole",
        groups = {Sa1.class}
)

/**
 * 封装添加数据权限给角色参数对象
 * 类AddDataPermissionsToRoleParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年4月19日 下午5:16:17
 */
public class AddDataPermissionsToRoleParam extends AclParam {

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
