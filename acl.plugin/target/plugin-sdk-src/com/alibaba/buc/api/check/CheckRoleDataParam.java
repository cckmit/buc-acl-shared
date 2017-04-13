package com.alibaba.buc.api.check;

import java.util.List;

import com.alibaba.buc.api.common.AclParam;

/**
 * 验数据角色入参
 * <p/>
 * {@link com.alibaba.buc.api.AccessControlService#checkRoleData(CheckRoleDataParam)}
 * 
 * @author jin.tuj 2015年5月5日 上午10:54:12
 */
public class CheckRoleDataParam implements AclParam {

    private static final long serialVersionUID = -712486818734364314L;

    private Integer           userId;                                 // UC中的userId，必填
    private String            roleName;                               // 角色名，必填
    private List<String>      dataNames;                              // 数据名列表，必填

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

    public List<String> getDataNames() {
        return dataNames;
    }

    public void setDataNames(List<String> dataNames) {
        this.dataNames = dataNames;
    }

}
