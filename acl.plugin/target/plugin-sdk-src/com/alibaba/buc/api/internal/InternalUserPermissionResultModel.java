package com.alibaba.buc.api.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.alibaba.buc.api.result.AppResultModel;
import com.alibaba.buc.api.result.PermissionDetailResultModel;
import com.alibaba.buc.api.result.ResultModel;

/**
 * @author shenwujie 2013-10-21 下午5:31:19
 */
public class InternalUserPermissionResultModel implements ResultModel {

    /**
     * 
     */
    private static final long                 serialVersionUID  = -288741998228902243L;
    /**
     * buc user Id
     */
    private String                            userId;
    /**
     * acl_app
     */
    private Map<String, AppResultModel>       apps;
    /**
     * 
     */
    private List<PermissionDetailResultModel> permissionDetails = new ArrayList<PermissionDetailResultModel>();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, AppResultModel> getApps() {
        return apps;
    }

    public void setApps(Map<String, AppResultModel> apps) {
        this.apps = apps;
    }

    public List<PermissionDetailResultModel> getPermissionDetails() {
        return permissionDetails;
    }

    public void setPermissionDetails(List<PermissionDetailResultModel> permissionDetails) {
        this.permissionDetails = permissionDetails;
    }

    public void addPermissionDetails(List<PermissionDetailResultModel> permissionDetails) {
        this.permissionDetails.addAll(permissionDetails);
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
