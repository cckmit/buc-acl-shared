package com.alibaba.buc.acl.api.output.check;

import com.alibaba.buc.acl.api.common.AclResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created by baidian on 12/21/15.
 * 这个验权接口需要注意的是，如果返回的code==0， msg=='OK'
 * 不意味着你验权成功，验权成功要看 checkPermissionResults 的值
 * 如果 checkPermissionResults == null , 表示这些个权限名称并不存在acl 系统中。
 * checkPermissionResults里面的 单个实体对象CheckPermissionResultInner.accessible == true, 才真正表明验权成功。
 * checkPermissionResults里面的 单个实体对象CheckPermissionResultInner.accessible == false, 表明验权失败。
 */
public class CheckPermissionsResult extends AclResult {

    private static final long serialVersionUID = -2144740882850805546L;

    private List<CheckPermissionResultInner> checkPermissionResults;

    public List<CheckPermissionResultInner> getCheckPermissionResults() {
        return checkPermissionResults;
    }

    public void setCheckPermissionResults(List<CheckPermissionResultInner> checkPermissionResults) {
        this.checkPermissionResults = checkPermissionResults;
    }

    public static class CheckPermissionResultInner implements Serializable {

        private static final long serialVersionUID = 2573410844443912863L;

        private String permissionName; // 权限名

        private boolean accessible; // 是否拥有权限

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
