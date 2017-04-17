package com.alibaba.buc.api.param;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class TagParam implements Serializable {

    private static final long serialVersionUID = 8057674275185774440L;
    /**
     * 分类名称name
     */
    private String            name;
    /**
     * 分类标题title
     */
    private String            title;
    /**
     * 权限域name
     */
    private String            domainName;
    /**
     * 父分类的name_path
     */
    private String            parentTagNamePath;
    /**
     * 分类描述信息description
     */
    private String            description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getParentTagNamePath() {
        return parentTagNamePath;
    }

    public void setParentTagNamePath(String parentTagNamePath) {
        this.parentTagNamePath = parentTagNamePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
