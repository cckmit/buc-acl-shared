package com.alibaba.buc.acl.api.input.datapermission;

import java.util.List;

import javax.validation.GroupSequence;

import com.alibaba.buc.acl.api.annotation.AppKeyPrivilegeAnnotation;
import com.alibaba.buc.acl.api.annotation.sequence.Oper;
import com.alibaba.buc.acl.api.annotation.sequence.S1;
import com.alibaba.buc.acl.api.annotation.sequence.S2;
import com.alibaba.buc.acl.api.annotation.sequence.Sa1;
import com.alibaba.buc.acl.api.annotation.sequence.Sb1;
import com.alibaba.buc.acl.api.common.AclParam;

@GroupSequence(
               value = {
                       Sb1.class,
                       S1.class,
                       Sa1.class,
                       S2.class,
                       Oper.class,
                       UpdateDataModelParam.class
               }
       )

@AppKeyPrivilegeAnnotation(
        appKeyField = "accessKey",
        keyCenterAccessKeyField = "keyCenterAccessKey",
        interfaceNameField = "DataModelService.updateDataModel",
        groups = {Sa1.class}
)

/**
 * 封装数据模型更新参数
 * 类CreateDataModelParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年9月1日 下午2:35:12
 */
public class UpdateDataModelParam extends AclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 542119577394149223L;
    
    /**
     * 要更新信息的英文名
     */
    private String name;
    

    /**
     * 中文名
     */
    private String title;
    
    /**
     * 描述
     */
    private String description;
    
    /**
    
    /**
     * 包含的属性name列表
     */
    private List<String> propertyNameList;

    
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

    
    public List<String> getPropertyNameList() {
        return propertyNameList;
    }

    
    public void setPropertyNameList(List<String> propertyNameList) {
        this.propertyNameList = propertyNameList;
    }
    
    
}
