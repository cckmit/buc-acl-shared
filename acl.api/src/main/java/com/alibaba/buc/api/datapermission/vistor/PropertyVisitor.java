package com.alibaba.buc.api.datapermission.vistor;

import com.alibaba.buc.api.datapermission.property.EnumProperty;
import com.alibaba.buc.api.datapermission.property.LocalResourceProperty;
import com.alibaba.buc.api.datapermission.property.SelfResolveStringProperty;
import com.alibaba.buc.api.datapermission.property.StringProperty;

/**
 * 内部使用，用户请忽略
 * 类PropertyVisitor.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月16日 下午1:39:57
 */
public interface PropertyVisitor {
    
    /**
     * 字符串属性visit方法
     * @param property
     */
    public void visit(StringProperty property);
    
    /**
     * 枚举属性visit方法
     * @param property
     */
    public void visit(EnumProperty property);
    
    /**
     * 自解析字符串属性visit方法
     * @param property
     */
    public void visit(SelfResolveStringProperty property);
    
    /**
     * 本地资源属性visit方法
     * @param property
     */
    public void visit(LocalResourceProperty property);

}
