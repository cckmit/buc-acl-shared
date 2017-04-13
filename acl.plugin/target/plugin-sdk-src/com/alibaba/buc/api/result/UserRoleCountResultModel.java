package com.alibaba.buc.api.result;

import java.io.Serializable;

public class UserRoleCountResultModel implements Serializable {

    private static final long serialVersionUID = 7368940436750048806L;

    /**
     * 用户ID
     */
    private String            userId;

    /**
     * 用户角色个数
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
