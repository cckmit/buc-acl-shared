package com.alibaba.buc.api.check;

import com.alibaba.buc.api.common.AclParam;

import java.util.ArrayList;
import java.util.List;

/**
 * 验权入参
 * <p/>
 * {@link com.alibaba.buc.api.ActionService#checkActions(CheckActionsParam)}
 *
 * @author yicheng.wp
 */
public class CheckActionsParam implements AclParam {

    private static final long serialVersionUID = 860294943244749844L;

    private String appName; // 应用名

    private Integer userId; // UC中的userId

    private List<String> patterns; // URL列表

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

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
