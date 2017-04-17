package com.alibaba.buc.acl.api.common;

import java.io.Serializable;

/**
 * 接口入参基类
 *
 * @author yicheng.wp
 */
public class AclParam implements Serializable {

    private static final long serialVersionUID = 152341552939252108L;

	/**
	 * 必填，注册ACL的应用都会有一个accessKey，可在应用管理中查看
	 */
    private String accessKey;

	/**
	 * 非必填，BUC-KeyCenter accessKey，普通用户无需关注
	 */
	private String keyCenterAccessKey;

	/**
	 * 非必填，接口操作人，建议填写以追溯操作此动作的员工是谁
	 * 操作人userId可从SSO的client里面获取
	 * 如果是系统操作，也可填写部门公共账号（即工作帐号）
	 */
    private Integer operatorUserId = -1000;

    public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getKeyCenterAccessKey() {
		return keyCenterAccessKey;
	}

	public void setKeyCenterAccessKey(String keyCenterAccessKey) {
		this.keyCenterAccessKey = keyCenterAccessKey;
	}

	public Integer getOperatorUserId() {
		if(this.operatorUserId==null){
			return -1000;
		}
        return operatorUserId;
    }

    public void setOperatorUserId(Integer operatorUserId) {
        this.operatorUserId = operatorUserId;
    }

	public Integer getReallyOperatorUserId() {
		return operatorUserId;
	}
}
