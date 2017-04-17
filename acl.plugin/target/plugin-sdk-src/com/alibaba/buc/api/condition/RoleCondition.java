package com.alibaba.buc.api.condition;

/**
 * @since 0.2
 * @deprecated
 */
public class RoleCondition implements Condition {

    private static final long serialVersionUID = 6698909299625027484L;
    private String            roleName;
    private String            domainName;

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
