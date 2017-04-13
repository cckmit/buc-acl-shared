package com.alibaba.buc.api.model;

import java.io.Serializable;

public class Role implements Serializable {

    private static final long serialVersionUID = -3738366235013899982L;

    /**
     * 角色名称(英文名)
     */
    private String            name;

    /**
     * 角色标题(中文名)
     */
    private String            title;

    /**
     * 描述
     */
    @Deprecated
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
