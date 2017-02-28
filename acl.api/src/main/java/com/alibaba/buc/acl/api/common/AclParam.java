package com.alibaba.buc.acl.api.common;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.buc.acl.api.annotation.AppKeyAnnotation;
import com.alibaba.buc.acl.api.annotation.KeyCenterAppKeyAnnotation;
import com.alibaba.buc.acl.api.annotation.OperatorAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;

/**
 * 接口入参需要实现的接口
 * <p/>
 * 之后新增的接口入参都要实现本接口
 *
 * @author yicheng.wp
 */
public class AclParam implements Serializable {

    private static final long serialVersionUID = 152341552939252108L;

    @NotEmpty(groups = {Sb1.class})
    @AppKeyAnnotation(groups = {S1.class})
    private String accessKey;  // appKey 必填

    @KeyCenterAppKeyAnnotation(groups = {S2.class})
    private String keyCenterAccessKey; // 如果你是keyCenter,这个值不能为null,且必须正确。

    @OperatorAnnotation(groups = {Oper.class})
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
