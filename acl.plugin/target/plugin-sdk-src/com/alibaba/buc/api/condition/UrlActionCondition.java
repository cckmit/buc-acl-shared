package com.alibaba.buc.api.condition;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

@Deprecated
public class UrlActionCondition extends BaseActionCondition {

    private static final long serialVersionUID = -3171429481264605155L;
    private List<String>      urls             = new ArrayList<String>();

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
