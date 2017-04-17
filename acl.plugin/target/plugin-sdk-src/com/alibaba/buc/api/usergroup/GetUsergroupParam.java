package com.alibaba.buc.api.usergroup;

import com.alibaba.buc.api.common.AclParam;

/**
 * 根据用户组名查询用户组入参
 * <p/>
 * {@link com.alibaba.buc.api.UsergroupService#getUsergroup(GetUsergroupParam)}
 *
 * @author yicheng.wp
 */
public class GetUsergroupParam implements AclParam {

    private static final long serialVersionUID = -5108602877774653383L;

    private String usergroupName; // 用户组英文名

    public String getUsergroupName() {
        return usergroupName;
    }

    public void setUsergroupName(String usergroupName) {
        this.usergroupName = usergroupName;
    }
}
