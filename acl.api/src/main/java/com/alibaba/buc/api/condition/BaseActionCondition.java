package com.alibaba.buc.api.condition;

import org.apache.commons.lang.builder.ToStringBuilder;

public class BaseActionCondition implements Condition {

    private static final long serialVersionUID = -6758121146138890559L;
    private String            domainName;
    private String            accountName;

    @Deprecated
    public String getDomainName() {
        return domainName;
    }

    @Deprecated
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Deprecated
    public String getAccountName() {
        return accountName;
    }

    @Deprecated
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
