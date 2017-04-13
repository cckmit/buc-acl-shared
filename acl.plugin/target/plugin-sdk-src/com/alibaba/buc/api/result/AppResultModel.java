package com.alibaba.buc.api.result;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 类AppResultModel.java的实现描述：TODO 类实现描述
 * 
 * @author shenwujie 2013-10-21 下午5:32:18
 */
public class AppResultModel implements ResultModel {

    /**
     * 
     */
    private static final long serialVersionUID = 1345611401083495835L;

    private String            id;
    private String            name;
    private String title;
    private String description;
    private String aoneAppId;

    public String getName() {
        return name;
    }

    public AppResultModel(){
    }

    public AppResultModel(String id, String name){
        super();
        this.id = id;
        this.name = name;
    }

    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

    public String getAoneAppId() {
        return aoneAppId;
    }

    public void setAoneAppId(String aoneAppId) {
        this.aoneAppId = aoneAppId;
    }
}
