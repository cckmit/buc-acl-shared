package com.alibaba.buc.acl.api.input.usergroup;

/**
 * Created by baidian on 5/7/17.
 */
public class ProjectInfo {

    private Integer projectId;

    private String projectTitle;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }
}
