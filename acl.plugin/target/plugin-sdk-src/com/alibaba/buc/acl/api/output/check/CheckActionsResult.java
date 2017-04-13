package com.alibaba.buc.acl.api.output.check;

import com.alibaba.buc.acl.api.common.AclResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created by baidian on 12/14/15.
 */
public class CheckActionsResult extends AclResult {

    private static final long serialVersionUID = -144891716768664518L;

    private List<CheckActionResultInner> checkActionResults;

    public List<CheckActionResultInner> getCheckActionResults() {
        return checkActionResults;
    }

    public void setCheckActionResults(List<CheckActionResultInner> checkActionResults) {
        this.checkActionResults = checkActionResults;
    }

    public static class CheckActionResultInner implements Serializable {
        private static final long serialVersionUID = -3074277474465253869L;

        private String url; // URL

        private String permissionName; // URL对应的权限名

        private boolean accessible; // 是否拥有权限

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

        public boolean isAccessible() {
            return accessible;
        }

        public void setAccessible(boolean accessible) {
            this.accessible = accessible;
        }
    }

}
