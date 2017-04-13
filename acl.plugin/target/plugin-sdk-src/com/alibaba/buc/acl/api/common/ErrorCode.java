package com.alibaba.buc.acl.api.common;

public class ErrorCode {
	
	public  static final int un_known_error = 8888;
	
	/**
	 * 数据权限验权失败
	 */
	public static final int DATA_PERMISSION_CHECK_DATA_PERMISSION_ERROR = 30001;

	/**
     * 数据权限获取操作失败
     */
    public static final int DATA_PERMISSION_GET_DATA_PERMISSION_OPERATIONS_ERROR = 30002;
    
    /**
     * 数据权限获取数据失败
     */
    public static final int DATA_PERMISSION_GET_DATA_PERMISSION_DATAS_ERROR = 30003;
    
    /**
     * 数据权限校验申请单失败
     */
    public static final int DATA_PERMISSION_CHECK_APPLYING_DATAS_ERROR = 30004;
    
    /**
     * 数据权限发起申请失败
     */
    public static final int DATA_PERMISSION_APPLY_ERROR = 30005;
}
