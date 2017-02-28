package com.alibaba.buc.acl.api.common;

import java.io.Serializable;

/**
 * 带基础参数且不使用注解的对象
 * 类NormalAclParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年9月28日 上午10:01:05
 */
public class NormalAclParam implements Serializable {

    private static final long serialVersionUID = 152341552939252108L;

    private String accessKey;  // appKey 必填

    private String keyCenterAccessKey; // 如果你是keyCenter,这个值不能为null,且必须正确。

    private Integer operatorUserId = -1000;   // 默认为-1000;操作人,最好要填,来源从SSO的client里面获取

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

}
