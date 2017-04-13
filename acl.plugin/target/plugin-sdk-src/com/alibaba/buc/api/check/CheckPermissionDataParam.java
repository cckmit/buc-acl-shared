package com.alibaba.buc.api.check;

import java.util.List;

import com.alibaba.buc.api.common.AclParam;

/**
 * 验数据权限入参
 * <p/>
 * {@link com.alibaba.buc.api.AccessControlService#checkPermissionData(CheckPermissionDataParam)}
 * 
 * @author jin.tuj 2015年5月5日 上午10:44:27
 */
public class CheckPermissionDataParam implements AclParam {

    private static final long serialVersionUID = -712486818734364314L;

    private Integer           userId;           //UC中的userId，必填
    private String            permissionName;   //权限名，必填
    private List<String>      dataNames;        //数据名列表，必填

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public List<String> getDataNames() {
        return dataNames;
    }

    public void setDataNames(List<String> dataNames) {
        this.dataNames = dataNames;
    }

}
