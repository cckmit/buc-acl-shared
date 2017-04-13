package com.alibaba.buc.api.result;

public class OperationResultModel implements ResultModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6220821619024037906L;


	/**
	 * 操作名，必选
	 */
	private String title;

	/**
	 * 操作name，必选
	 */
	private String name;

	/**
	 * 操作描述，必选
	 */
	private String description;

	/**
	 * 是否包類型,默認為非包的類型
	 */
	private boolean isPackage;


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPackage() {
		return isPackage;
	}

	public void setPackage(boolean isPackage) {
		this.isPackage = isPackage;
	}

}
