package com.alibaba.buc.api.result;

import java.util.Map;

/**
 * 封装用户申请结果
 * 类UserApplyResultModel.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-7-9 下午7:18:22
 */
public class UserApplyResultModel implements ResultModel {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 8392818131152736465L;
    
    /**
     * 成功申请
     */
    public static final String SUCCESS = "success";
    
    /**
     * 申请对象已被申请或者不存在等，最后判断没有可申请的对象
     */
    public static final String NO_APPLYABLE_OBJECT="noApplyableObject";

    /**
     * 申请对象不能申请
     */
    public static final String CAN_NOT_APPLY="canNotApply";
    
    /**
     * 结果码
     */
    public String resultCode;
    
    /**
     * 对应申请单id
     */
    public String applyInstanceId;
    
    /**
     * 定义权限申请结果，key是权限name
     */
    Map<String, ObjectApplyResultModel> permissionsApplyResult;
    
    /**
     * 定义角色申请结果，key是角色name
     */
    Map<String, ObjectApplyResultModel> rolesApplyResult;

    
    public String getApplyInstanceId() {
        return applyInstanceId;
    }

    
    public void setApplyInstanceId(String applyInstanceId) {
        this.applyInstanceId = applyInstanceId;
    }

    
    public Map<String, ObjectApplyResultModel> getPermissionsApplyResult() {
        return permissionsApplyResult;
    }

    
    public void setPermissionsApplyResult(Map<String, ObjectApplyResultModel> permissionsApplyResult) {
        this.permissionsApplyResult = permissionsApplyResult;
    }

    
    public Map<String, ObjectApplyResultModel> getRolesApplyResult() {
        return rolesApplyResult;
    }
    
    public String getResultCode() {
        return resultCode;
    }

    
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }


    public void setRolesApplyResult(Map<String, ObjectApplyResultModel> rolesApplyResult) {
        this.rolesApplyResult = rolesApplyResult;
    }
}
