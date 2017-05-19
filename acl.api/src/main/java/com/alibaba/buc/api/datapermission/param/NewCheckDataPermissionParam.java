package com.alibaba.buc.api.datapermission.param;

/**
 * 
 * 类NewCheckDataPermissionParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2017年5月3日 下午3:28:45
 */
public class NewCheckDataPermissionParam extends NewAuthProfileParam{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -981163470364190706L;
    
    /**
     * 验权的数据权限name，必填
     */
    private String dataPermissionName;

    
    public String getDataPermissionName() {
        return dataPermissionName;
    }

    
    public void setDataPermissionName(String dataPermissionName) {
        this.dataPermissionName = dataPermissionName;
    }
    
}
