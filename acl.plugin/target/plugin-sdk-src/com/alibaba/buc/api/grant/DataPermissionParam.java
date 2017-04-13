package com.alibaba.buc.api.grant;

import java.util.List;
import java.util.Map;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 保存数据权限授权详情的对象
 * 类DataPermissionParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年4月13日 下午2:56:29
 */
public class DataPermissionParam extends AclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 3582087100298809951L;

    /**
     * 指定的操作、属性组合所属数据权限模型name，以便判断授权数据是否规范
     */
    private String dataPermissionModelName;

    /**
     * 操作name列表
     */
    private List<String> operationNameList;

    /**
     * 数据map，key是属性name，value是值列表
     */
    private Map<String,List<String>> dataMap;

    
    public String getDataPermissionModelName() {
        return dataPermissionModelName;
    }

    
    public void setDataPermissionModelName(String dataPermissionModelName) {
        this.dataPermissionModelName = dataPermissionModelName;
    }

    
    public List<String> getOperationNameList() {
        return operationNameList;
    }

    
    public void setOperationNameList(List<String> operationNameList) {
        this.operationNameList = operationNameList;
    }

    
    public Map<String, List<String>> getDataMap() {
        return dataMap;
    }

    
    public void setDataMap(Map<String, List<String>> dataMap) {
        this.dataMap = dataMap;
    }
    
}

