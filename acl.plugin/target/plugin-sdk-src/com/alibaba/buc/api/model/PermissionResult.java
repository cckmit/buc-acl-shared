/**
 * Project: buc.api
 * 
 * File Created at 2011-10-8
 * $Id$
 * 
 * Copyright 1999-2100 Alibaba.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.alibaba.buc.api.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.alibaba.buc.api.permission.PermissionCriteria;

/**
 * PermissionResult
 * 
 * @author congjiang.licj
 * @author wujie.shenwj
 */
public class PermissionResult implements Serializable {

    private static final long serialVersionUID = -8016725654107797002L;
    private String            resourceType;
    private String            resourceName;
    private String            operationName;
    private boolean           accessible;
    private String            permissionInfo;

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public boolean isAccessible() {
        return accessible;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }

    public String getPermissionInfo() {
        return permissionInfo;
    }

    public void setPermissionInfo(String permissionInfo) {
        this.permissionInfo = permissionInfo;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((operationName == null) ? 0 : operationName.hashCode());
        result = prime * result + ((resourceName == null) ? 0 : resourceName.hashCode());
        result = prime * result + ((resourceType == null) ? 0 : resourceType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof PermissionCriteria) {
            PermissionCriteria other = (PermissionCriteria) obj;
            if (operationName == null) {
                if (other.getOperationName() != null) return false;
            } else if (!operationName.equals(other.getOperationName())) return false;
            if (resourceName == null) {
                if (other.getResourceName() != null) return false;
            } else if (!resourceName.equals(other.getResourceName())) return false;
            if (resourceType == null) {
                if (other.getResourceType() != null) return false;
            } else if (!resourceType.equals(other.getResourceType())) return false;
            return true;
        }
        if (getClass() != obj.getClass()) return false;
        PermissionResult other = (PermissionResult) obj;
        if (operationName == null) {
            if (other.operationName != null) return false;
        } else if (!operationName.equals(other.operationName)) return false;
        if (resourceName == null) {
            if (other.resourceName != null) return false;
        } else if (!resourceName.equals(other.resourceName)) return false;
        if (resourceType == null) {
            if (other.resourceType != null) return false;
        } else if (!resourceType.equals(other.resourceType)) return false;
        return true;
    }

}
