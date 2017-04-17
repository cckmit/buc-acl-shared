package com.alibaba.buc.api.userpermission;

import java.io.Serializable;

public class UserResult implements Serializable {

	private static final long serialVersionUID = -8918657987451591751L;
	
	// UC 的 userId
	private int               id;
	
	// 工号
    private String            empId;
    
    // 真名
    private String            name;
    
    // 花名
    private String            nickName;
    
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
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getNickName() {
        return nickName;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
	
}