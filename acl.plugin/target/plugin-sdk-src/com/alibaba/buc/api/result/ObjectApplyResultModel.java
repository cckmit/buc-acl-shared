package com.alibaba.buc.api.result;

/**
 * 封装申请结果
 * 类UserApplyResultModel.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-7-9 下午7:18:22
 */
public class ObjectApplyResultModel implements ResultModel {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 8392818131152736465L;
    
    /**
     * 成功申请
     */
    public static final String SUCCESS = "success";
    
    /**
     * 申请对象不存在
     */
    public static final String OBJECT_NOT_EXIST = "objectNotExist";
    
    /**
     * 对象已被用户申请过
     */
    public static final String OBJECT_ALREADY_APPLY="objectAlreadyApply";

    /**
     * 申请对象不能申请
     */
    public static final String CAN_NOT_APPLY="canNotApply";
    
    /**
     * 其他错误
     */
    public static final String OTHER_ERROR="otherError";
    
    /**
     * 结果码
     */
    public String resultCode;
    
    /**
     * 对应申请流程id
     */
    public String applyFlowInstanceId;

    public String getResultCode() {
        return resultCode;
    }

    
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    
    public String getApplyFlowInstanceId() {
        return applyFlowInstanceId;
    }

    
    public void setApplyFlowInstanceId(String applyFlowInstanceId) {
        this.applyFlowInstanceId = applyFlowInstanceId;
    }

    
    public static String getSuccess() {
        return SUCCESS;
    }

    
    public static String getObjectNotExist() {
        return OBJECT_NOT_EXIST;
    }

    
    public static String getObjectAlreadyApply() {
        return OBJECT_ALREADY_APPLY;
    }
    

}
