package com.alibaba.buc.api.check;

import com.alibaba.buc.api.common.AclResult;

/**
 * 验数据权限出参
 * <p/>
 * {@link com.alibaba.buc.api.AccessControlService#checkPermissionData(CheckPermissionDataParam)}
 * 
 * @author jin.tuj 2015年5月5日 上午10:51:52
 */
public class CheckPermissionDataResult implements AclResult {

    private static final long serialVersionUID = -9052681404476146473L;
    private String            dataName;                                // 数据名
    private boolean           accessible;                              // 是否拥有数据

    public CheckPermissionDataResult(){
        super();
    }

    public CheckPermissionDataResult(String dataName, boolean accessible){
        this.dataName = dataName;
        this.accessible = accessible;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public boolean isAccessible() {
        return accessible;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }

}
