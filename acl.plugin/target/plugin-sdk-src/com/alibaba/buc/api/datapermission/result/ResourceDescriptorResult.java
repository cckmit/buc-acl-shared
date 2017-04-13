package com.alibaba.buc.api.datapermission.result;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 封装用到的资源描述符模型
 * 类OperationModel.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月22日 上午10:31:05
 */
public class ResourceDescriptorResult implements Serializable {

	/**
     * 序列化版本号
     */
    private static final long serialVersionUID = -7002057461251634689L;

	/**
	 * 资源描述符的name，具体数据在resourceDescriptorDetailList中，可忽略
	 * 
	 * 可在日志中打印此参数在接口出现问题时方便问题排查
	 * 
	 */
	private String name;

	/**
	 * 数据列表
	 */
	List<DescriptorDetailResult> resourceDescriptorDetailList;

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }


    
    public List<DescriptorDetailResult> getResourceDescriptorDetailList() {
        return resourceDescriptorDetailList;
    }


    
    public void setResourceDescriptorDetailList(List<DescriptorDetailResult> resourceDescriptorDetailList) {
        this.resourceDescriptorDetailList = resourceDescriptorDetailList;
    }

    @Override
    public int hashCode() {
        return  HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
}
