package com.alibaba.buc.acl.api.output.user;

import java.io.Serializable;
import java.util.List;

import com.alibaba.buc.acl.api.common.AclResult;

public class FindUsersResult extends AclResult {

    private static final long serialVersionUID = 5908344277832794989L;

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public static class User implements Serializable {

        private static final long serialVersionUID = 8382975003020646686L;

        private String lastName; // user real name

        private String nickNameCn; // user flower name

        private String empId;     // employee Number

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getNickNameCn() {
            return nickNameCn;
        }

        public void setNickNameCn(String nickNameCn) {
            this.nickNameCn = nickNameCn;
        }

        public String getEmpId() {
            return empId;
        }

        public void setEmpId(String empId) {
            this.empId = empId;
        }

    }

}
