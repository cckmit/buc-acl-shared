package com.alibaba.buc.api.datapermission.param;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.acl.api.common.NormalAclParam;

/**
 * 查询数据详情的参数
 * 类FindDataDetailParam.java的实现描述：TODO 类实现描述
 * interfaceNameField = "DataAccessControlService.findDataDetail"
 * @author tongxu 2016年10月12日 下午3:21:25
 */
public class FindDataDetailParam extends NormalAclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1003176948938437797L;
    
    /**
     * ，要查询详情的数据name，必填，不能超过100个
     */
    private List<String>      dataNameList;
    
    public List<String> getDataNameList() {
        return dataNameList;
    }

    public void setDataNameList(List<String> dataNameList) {
        this.dataNameList = dataNameList;
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
