package com.alibaba.buc.api.datapermission.param;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 封装外部数据源服务基本参数信息
 * 类BasicOutDataSourceQueryParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年12月30日 上午11:31:00
 */
public class BasicOutDataSourceQueryParam implements Serializable{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -4180008044828154503L;

    /**
     * 属性名
     */
    private String propertyName;
    
    /**
     * 时间戳
     */
    private Long timeStamp;
    
    /**
     * 代表当前做的请求类型，对应DataPermissionConstaints.OUT_DATA_SOURCE_ACTION_TYPE_XXXX信息
     */
    private String actionType;
    
    /**
     * 当前操作场景，为需要区分用户操作场景的应用使用，可以引用
     * DataPermissionConstaints.OUT_DATA_SOURCE_PARAM_SCENE_XXX常量
     */
    private String scene; 
    
    /**
     * 部门管理员操作场景中代表当前管理部门的dep_id列表
     * 逗号“,”分隔
     */
    private String corpList;
    
    /**
     * 安全签名
     */
    private String sign;
    
    
    public String getPropertyName() {
        return propertyName;
    }

    
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
    
    public String getSign() {
        return sign;
    }


    
    public void setSign(String sign) {
        this.sign = sign;
    }
    

    
    public Long getTimeStamp() {
        return timeStamp;
    }

    
    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }


    
    public String getActionType() {
        return actionType;
    }


    
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }
    
    
    public String getScene() {
        return scene;
    }

    
    public void setScene(String scene) {
        this.scene = scene;
    }
    

    
    public String getCorpList() {
        return corpList;
    }


    
    public void setCorpList(String corpList) {
        this.corpList = corpList;
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
