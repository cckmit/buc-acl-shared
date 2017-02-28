package com.alibaba.buc.api.action;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;

import com.alibaba.buc.api.annotation.ExistInDbAnnotation;
import com.alibaba.buc.api.annotation.sequence.S1;
import com.alibaba.buc.api.annotation.sequence.S2;
import com.alibaba.buc.api.annotation.sequence.S3;
import com.alibaba.buc.api.annotation.sequence.Sb1;
import com.alibaba.buc.api.common.AclParam;

/**
 * 获取单个菜单的入参
 * @author taigao.wjj
 *
 */
@GroupSequence(value = {Sb1.class,S1.class,S2.class,GetMenuParam.class})
public class GetMenuParam implements AclParam{
	
	private static final long serialVersionUID = -6112860282799961341L;
	
	@NotNull(groups ={Sb1.class})
	@ExistInDbAnnotation(type="app",groups ={S1.class})
	private String appName;  //应用名称,                    必填
	
	@NotNull(groups ={S2.class})
    private String name;  //菜单唯一标示                                         必填
    
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    

}
