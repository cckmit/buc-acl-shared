package com.alibaba.buc.api.datapermission.param;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.acl.api.common.NormalAclParam;

/**
 * 封装分页查询用户数据的接口
 * 类PageDataPermissionDatasParam.java的实现描述：TODO 类实现描述 
 * 
 * interfaceNameField = "DataAccessControlService.pageUserDataPermissionDatas"
 * 
 * @author tongxu 2016年10月12日 下午2:24:33
 */
public class PageUserDataPermissionDatasParam extends NormalAclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -1376294726443995810L;

    /**
     *  用户id，必填
     */
    private Integer           userId;  
    
    /**
     * ，过滤条件，数据权限name，可不填
     */
    private List<String>      dataPermissionNames;
    
    /**
     *  来源角色name列表，设定只返回通过拥有roleNames角色而拥有的数据
     */
    private List<String>      roleNames;
    
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<String> getRoleNames() {
        return roleNames;
    }

    
    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
    }

    @Override
    public int hashCode() {
        return  HashCodeBuilder.reflectionHashCode(this);
    }

    public List<String> getDataPermissionNames() {
        return dataPermissionNames;
    }

    
    public void setDataPermissionNames(List<String> dataPermissionNames) {
        this.dataPermissionNames = dataPermissionNames;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
}
