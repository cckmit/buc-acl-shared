package com.alibaba.buc.api.result;

import com.alibaba.buc.api.result.ResultModel;

public class RoleResultModel implements ResultModel {

    private static final long serialVersionUID = -1743591522983755789L;

    private Integer           id;

    private String            name;

    private String            title;

    private String            description;

    private Boolean           isSystem;

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
