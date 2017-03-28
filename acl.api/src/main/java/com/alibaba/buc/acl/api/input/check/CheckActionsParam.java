package com.alibaba.buc.acl.api.input.check;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

public class CheckActionsParam extends AclParam {

    private static final long serialVersionUID = 6258761572451320217L;

    private Integer userId; // UC中的userId

    private List<String> patterns; // URL列表

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
