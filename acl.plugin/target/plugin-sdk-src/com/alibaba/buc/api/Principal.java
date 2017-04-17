package com.alibaba.buc.api;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 身份标识
 * 
 * @author shenwujie
 */
public class Principal implements Serializable {

    private static final long serialVersionUID = -5666037318325043454L;

    /**
     * 操作人的用户id，必选，请务必传入正确的userId，所有写接口，都会校验该用户是否拥有写的权限
     */
    private String            userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
