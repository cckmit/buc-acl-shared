package com.alibaba.buc.api.permission.check;

import java.util.List;
import java.util.Map;

import com.alibaba.buc.api.permission.PermissionCriteria;

/**
 * @since 0.2
 * @deprecated
 * @author howard 23 Dec, 2011 4:28:55 PM
 */
public class DefaultCheckCriteria implements CheckCriteria {

    private static final long        serialVersionUID = 6797647317978745947L;

    private String                   domainName;
    private String                   pricipalId;
    private String                   pricipalType;
    private List<PermissionCriteria> permissions;
    private Map<String, String>      context;

    public DefaultCheckCriteria(String domainName, String pricipalId, List<PermissionCriteria> permissions){
        this.domainName = domainName;
        this.pricipalId = pricipalId;
        this.permissions = permissions;
        this.pricipalType = "USER";
    }

    public DefaultCheckCriteria(String domainName, String pricipalId, String pricipalType,
                                List<PermissionCriteria> permissions, Map<String, String> context){
        this.domainName = domainName;
        this.pricipalId = pricipalId;
        this.permissions = permissions;
        this.pricipalType = pricipalType == null ? "USER" : pricipalType;
        this.context = context;
    }

    public DefaultCheckCriteria(String domainName, String pricipalId, List<PermissionCriteria> permissions,
                                Map<String, String> context){
        this.domainName = domainName;
        this.pricipalId = pricipalId;
        this.permissions = permissions;
        this.pricipalType = "USER";
        this.context = context;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getPricipalId() {
        return pricipalId;
    }

    public void setPricipalId(String pricipalId) {
        this.pricipalId = pricipalId;
    }

    public String getPricipalType() {
        return pricipalType;
    }

    public void setPricipalType(String pricipalType) {
        this.pricipalType = pricipalType;
    }

    public List<PermissionCriteria> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionCriteria> permissions) {
        this.permissions = permissions;
    }

    public Map<String, String> getContext() {
        return context;
    }

    public void setContext(Map<String, String> context) {
        this.context = context;
    }

}
