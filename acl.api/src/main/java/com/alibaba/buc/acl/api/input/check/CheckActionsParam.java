package com.alibaba.buc.acl.api.input.check;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 验 url 的入参
 *
 * @author taigao
 */
public class CheckActionsParam extends AclParam {

    private static final long serialVersionUID = 6258761572451320217L;

    /**
     * UC 中的 userId
     */
    private Integer userId;

    /**
     * url 列表
     */
    private List<String> patterns;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<String> getPatterns() {
        return patterns;
    }

    public void setPatterns(List<String> patterns) {
        this.patterns = patterns;
    }
}
