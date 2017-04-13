package com.alibaba.buc.api.app;

import java.io.Serializable;

/**
 * @author baidian.zc
 */
public class GetAppParam implements Serializable {

	private static final long serialVersionUID = -4094527596767155369L;

	// 应用名, 英文
	private String            name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
