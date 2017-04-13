package com.alibaba.buc.api.condition;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 封装app查询相关参数
 * @author tongxu.ay
 *
 */
public class AppCondition implements Serializable{
	
	/**
	 * 序列化版本号
	 */
	private static final long serialVersionUID = -2161056591551684312L;

	/**
	 * appId
	 */
	private Integer id;

	/**
	 * app code
	 */
	private String name;
	
	/**
	 * app名称
	 */
	private String title;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
