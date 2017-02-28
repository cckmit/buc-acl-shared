package com.alibaba.buc.acl.api.input.datapermission;

import com.alibaba.buc.acl.api.common.NormalAclParam;


//@AppKeyPrivilegeAnnotation(
//        appKeyField = "accessKey",
//        keyCenterAccessKeyField = "keyCenterAccessKey",
//        interfaceNameField = "PropertyService.updatePropertyEnum",
//        groups = {Sa1.class}
//)

/**
 * 封装修改属性枚举参数
 * 类UpdatePropertyEnumParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年11月4日 下午2:39:52
 */
public class UpdatePropertyEnumParam extends NormalAclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 542119577394149223L;
    
    /**
     * 要要更新枚举的属性name
     */
    private String propertyName;

    /**
     * 新枚举title
     */
    private String enumTitle;
    
    /**
     * 要更新title的枚举value
     */
    private String enumValue;

    
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getEnumTitle() {
        return enumTitle;
    }
    
    public void setEnumTitle(String enumTitle) {
        this.enumTitle = enumTitle;
    }
    
    public String getEnumValue() {
        return enumValue;
    }

    public void setEnumValue(String enumValue) {
        this.enumValue = enumValue;
    }
    
}
