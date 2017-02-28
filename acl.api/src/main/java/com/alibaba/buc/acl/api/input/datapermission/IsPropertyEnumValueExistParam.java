package com.alibaba.buc.acl.api.input.datapermission;

import com.alibaba.buc.acl.api.common.NormalAclParam;

//@AppKeyPrivilegeAnnotation(
//        appKeyField = "accessKey",
//        keyCenterAccessKeyField = "keyCenterAccessKey",
//        interfaceNameField = "PropertyService.isPropertyEnumValueExist",
//        groups = {Sa1.class}
//)

/**
 * 封装属性查询参数 
 * 
 * 类GetPropertyParam.java的实现描述：TODO 类实现描述
 * 
 * @author tongxu 2016年11月4日 下午1:47:23
 */
public class IsPropertyEnumValueExistParam extends NormalAclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -6815790953200523118L;

    /**
     * 枚举属性的name
     */
    private String            propertyName;

    /**
     * 要检查的枚举值
     */
    private String            enumValue;

    public String getPropertyName() {
        return propertyName;
    }

    
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getEnumValue() {
        return enumValue;
    }

    public void setEnumValue(String enumValue) {
        this.enumValue = enumValue;
    }

}
