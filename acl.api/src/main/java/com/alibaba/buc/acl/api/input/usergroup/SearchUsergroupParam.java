package com.alibaba.buc.acl.api.input.usergroup;

import com.alibaba.buc.acl.api.common.AclParam;


/**
 * @author zhangchen
 * @date 2017/10/23
 */
public class SearchUsergroupParam extends AclParam {

    private static final long serialVersionUID = 8046964398724668303L;

    private String keyword;

    private String outsourceProjectId;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getOutsourceProjectId() {
        return outsourceProjectId;
    }

    public void setOutsourceProjectId(String outsourceProjectId) {
        this.outsourceProjectId = outsourceProjectId;
    }
}
