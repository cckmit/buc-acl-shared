package com.alibaba.buc.api.check;

import com.alibaba.buc.api.common.AclResult;
import com.alibaba.buc.api.data.DataResult;

/**
 * @author jin.tuj 2015年5月5日 上午11:03:51
 */
public class GetDataResult implements AclResult {

    private static final long serialVersionUID = -2676472711171396450L;

    private DataResult        data;     //数据详情
    /**
     * 数据来源。
     * 取值范围如下：
     * PERMISSION:       权限的原生数据
     * USER_PERMISSION： 用户拥有权限所关联的数据
     * ROLE：            角色的原生数据
     * USER_ROLE：       用户拥有角色所关联的数据
     */
    private String            source;  

    public DataResult getData() {
        return data;
    }

    public void setData(DataResult data) {
        this.data = data;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
