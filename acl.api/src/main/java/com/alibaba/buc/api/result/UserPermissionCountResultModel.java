package com.alibaba.buc.api.result;

import java.io.Serializable;

public class UserPermissionCountResultModel implements Serializable {

    private static final long serialVersionUID = -4511344812503633900L;

    /**
     * 用户ID
     */
    private String            userId;

    /**
     * 用户拥有的权限个数
     */
    private int               count;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
