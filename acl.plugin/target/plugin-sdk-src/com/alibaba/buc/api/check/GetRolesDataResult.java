package com.alibaba.buc.api.check;

import java.util.List;

import com.alibaba.buc.api.common.AclResult;

/**
 * 批量查找用户拥有角色的数据,出参
 * <p/>
 * {@link com.alibaba.buc.api.AccessControlService#getRolesData(GetRolesDataParam)}
 * 
 * @author jin.tuj 2015年5月5日 上午11:01:46
 */
public class GetRolesDataResult implements AclResult {

    private static final long   serialVersionUID = 5657350204483949577L;

    private String              roleName;                               // 角色名
    private List<GetDataResult> datas;                                  // 数据列表

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<GetDataResult> getDatas() {
        return datas;
    }

    public void setDatas(List<GetDataResult> datas) {
        this.datas = datas;
    }

}
