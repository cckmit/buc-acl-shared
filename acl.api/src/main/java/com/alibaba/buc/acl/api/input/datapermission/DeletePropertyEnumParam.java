package com.alibaba.buc.acl.api.input.datapermission;

import com.alibaba.buc.acl.api.common.NormalAclParam;

//@AppKeyPrivilegeAnnotation(
//        appKeyField = "accessKey",
//        keyCenterAccessKeyField = "keyCenterAccessKey",
//        interfaceNameField = "PropertyService.deletePropertyEnum",
//        groups = {Sa1.class}
//)

/**
 * 封装属性枚举删除参数
 * 类DeletePropertyEnumParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年11月4日 下午2:50:03
 */
public class DeletePropertyEnumParam extends NormalAclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -6815790953200523118L;
    
    /**
     *  要删除的枚举对应属性name
     */
    private String propertyName;
    
    /**
     * 要删除的枚举value
     */
    private String enumValue;

    
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
