package com.alibaba.buc.acl.api.input.usergroup;

import com.alibaba.buc.acl.api.common.AclParam;
import com.alibaba.buc.api.param.RevokeRuleConstant;

import java.util.List;

/**
 * 创建用户组的入参
 *
 * @author taigao
 */
public class CreateUsergroupParam extends AclParam {

    private static final long serialVersionUID = -2476002815205391300L;

    /**
     * 用户组英文名
     */
    private String name;

    /**
     * 用户组中文名
     */
    private String title;

    /**
     * 用户组描述
     */
    private String description;

    /**
     * 用户组管理员的 userId
     */
    private List<Integer> adminUserIds;

    /**
     * 是否通知管理员
     */
    private boolean isNotify = true;

    /**
     * 适用范围
     */
    private List<String> orgIds;

    /**
     * 1:用户组 （默认是1，目前没有其他选项）
     */
    private Integer type = 1;

    /**
     * 1:公开可申请 2 公开不可申请 3 不公开 4.使用范围内看见可申请
     */
    private String publicAttri = "1";

    /**
     * 权限回收策略（设置值请使用{@link RevokeRuleConstant}）
     */
    private String revokeRule = "TRANSFER_REVOKE";

    /**
     * 是否要求用户组成员同一部门，开启会定时发邮件统计用户组的成员部门情况
     */
    private Boolean isMemberSameOrg = false;

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

    public List<Integer> getAdminUserIds() {
        return adminUserIds;
    }

    public void setAdminUserIds(List<Integer> adminUserIds) {
        this.adminUserIds = adminUserIds;
    }

    public boolean getIsNotify() {
        return isNotify;
    }

    public void setIsNotify(boolean isNotify) {
        this.isNotify = isNotify;
    }

    public List<String> getOrgIds() {
        return orgIds;
    }

    public void setOrgIds(List<String> orgIds) {
        this.orgIds = orgIds;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPublicAttri() {
        return publicAttri;
    }

    public void setPublicAttri(String publicAttri) {
        this.publicAttri = publicAttri;
    }

    public String getRevokeRule() {
        return revokeRule;
    }

    public void setRevokeRule(String revokeRule) {
        this.revokeRule = revokeRule;
    }

    public Boolean getIsMemberSameOrg() {
        return isMemberSameOrg;
    }

    public void setIsMemberSameOrg(Boolean isMemberSameOrg) {
        this.isMemberSameOrg = isMemberSameOrg;
    }
}
