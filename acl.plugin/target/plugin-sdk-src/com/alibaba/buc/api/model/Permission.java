package com.alibaba.buc.api.model;

import java.io.Serializable;

public class Permission implements Serializable {

    private static final long serialVersionUID = -3738366235013855582L;

    /**
     * 权限中文名
     */
    private String            title;

    /**
     * 权限英文名
     */
    private String            name;

    /**
     * 权限描述
     */
    private String            description;

    /**
     * 风险等级
     */
    private String            level;

    /**
     * ownerId
     */
    private String            ownerId;

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

}
