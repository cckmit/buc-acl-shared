package com.alibaba.buc.api.condition;

/**
 * @since 0.2
 * @deprecated
 */
public class UserCondition implements Condition {

    private static final long serialVersionUID = -7991665810754465666L;

    private String            domainName;

    private String            accountName;

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

}
