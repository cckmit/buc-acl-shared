package com.alibaba.buc.api.data;

import java.util.List;

/**
 * 权限角色数据规则映射
 *
 * @author yicheng.wp
 */
public class DataMapping {

    /**
     * 申请的权限或角色name
     */
    private String name;

    /**
     * 数据规则name列表
     */
    private List<String> dataNames;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDataNames() {
        return dataNames;
    }

    public void setDataNames(List<String> dataNames) {
        this.dataNames = dataNames;
    }
}
