package com.alibaba.buc.acl.api.input.datapermission;

import com.alibaba.buc.acl.api.common.NormalAclParam;


//@AppKeyPrivilegeAnnotation(
//        appKeyField = "accessKey",
//        keyCenterAccessKeyField = "keyCenterAccessKey",
//        interfaceNameField = "PropertyService.createPropertyEnum",
//        groups = {Sa1.class}
//)

/**
 * 封装属性枚举创建参数
 * 类CreatePropertyEnumValueParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年11月4日 下午2:31:50
 */
public class CreatePropertyEnumParam extends NormalAclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -2776026117403021065L;
    
    /**
     * 要添加枚举的属性name
     */
    private String propertyName;

    /**
     * 枚举title
     */
    private String enumTitle;
    
    /**
     * 枚举value
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
