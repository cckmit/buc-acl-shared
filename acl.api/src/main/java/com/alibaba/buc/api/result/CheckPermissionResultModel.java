package com.alibaba.buc.api.result;

/**
 * @author shenwujie
 */
public class CheckPermissionResultModel implements ResultModel {

    private static final long serialVersionUID = 3800648529248623769L;

    private String            permissionName;

    private String            permissionInfo;

    private boolean           accessible;

    public String getPermissionInfo() {
        return permissionInfo;
    }

    public void setPermissionInfo(String permissionInfo) {
        this.permissionInfo = permissionInfo;
    }

    public boolean isAccessible() {
        return accessible;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

}
