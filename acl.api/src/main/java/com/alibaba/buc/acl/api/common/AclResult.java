package com.alibaba.buc.acl.api.common;

import java.io.Serializable;

/**
 * 接口出参需要实现的接口
 * <p/>
 * 之后新增的接口出参都要实现本接口
 *
 * @author yicheng.wp
 */
public class AclResult<T> implements Serializable {
	
	private static final long serialVersionUID = 1445419779219368615L;

	private boolean isSuccess = true ;
    private int code = 0;
    private String msg = "OK";

    /**
     * 返回结果
     */
    private T result;
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
    	isSuccess = (code == 0);
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

	public boolean isSuccess() {
		return isSuccess;
	}
    
    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

}
