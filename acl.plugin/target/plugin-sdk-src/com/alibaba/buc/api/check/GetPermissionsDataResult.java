package com.alibaba.buc.api.check;

import java.util.List;

import com.alibaba.buc.api.common.AclResult;

/**
 * 批量查找用户拥有权限的数据,出参
 * <p/>
 * {@link com.alibaba.buc.api.AccessControlService#getPermissionsData(GetPermissionsDataParam)}
 * 
 * @author jin.tuj 2015年5月5日 上午11:01:46
 */
public class GetPermissionsDataResult implements AclResult {

    private static final long   serialVersionUID = 5657350204483949577L;

    private String              permissionName;                         // 权限名
    private List<GetDataResult> datas;                                  // 数据列表

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public List<GetDataResult> getDatas() {
        return datas;
    }

    public void setDatas(List<GetDataResult> datas) {
        this.datas = datas;
    }

}
