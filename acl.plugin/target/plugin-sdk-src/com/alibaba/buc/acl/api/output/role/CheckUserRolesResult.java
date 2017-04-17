package com.alibaba.buc.acl.api.output.role;

import java.io.Serializable;
import java.util.List;

import com.alibaba.buc.acl.api.common.AclResult;

public class CheckUserRolesResult extends AclResult {

    private static final long serialVersionUID = -1855853689564058819L;

    private List<CheckUserRoleEntiry> ownership;

    public List<CheckUserRoleEntiry> getOwnership() {
        return ownership;
    }

    public void setOwnership(List<CheckUserRoleEntiry> ownership) {
        this.ownership = ownership;
    }


    public static class CheckUserRoleEntiry implements Serializable {

        private static final long serialVersionUID = -1650200599128604554L;

        private String roleName;

        private boolean ownerOrNot = false;

        public String getRoleName() {
            return roleName;
        }

        public void setRoleName(String roleName) {
            this.roleName = roleName;
        }

        public boolean getOwnerOrNot() {
            return ownerOrNot;
        }

        public void setOwnerOrNot(boolean ownerOrNot) {
            this.ownerOrNot = ownerOrNot;
        }

    }

}
