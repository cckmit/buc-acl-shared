package com.alibaba.buc.api.result;

import java.io.Serializable;

public class UserResultModel implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -6579974858119232340L;
    
    private int           id;
    private String        empId;
    private String        lastName;
    private String        nickName;       // 花名
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getEmpId() {
        return empId;
    }
    
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getNickName() {
        return nickName;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    

}
