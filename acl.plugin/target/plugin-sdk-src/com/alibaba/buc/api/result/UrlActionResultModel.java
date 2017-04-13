package com.alibaba.buc.api.result;

public class UrlActionResultModel extends ActionResultModel {

    private static final long serialVersionUID = -1437854322558032993L;

    /**
     * URL
     */
    private String            url;

    /**
     * URL对应的permissionName
     */
    private String            permissionName;

    /**
     * 是否有权限
     */
    private boolean           accessible;

    public boolean isAccessible() {
        return accessible;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

}
