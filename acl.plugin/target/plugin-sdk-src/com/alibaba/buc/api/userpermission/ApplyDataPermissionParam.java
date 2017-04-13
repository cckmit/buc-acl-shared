package com.alibaba.buc.api.userpermission;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.alibaba.buc.acl.api.common.NormalAclParam;

/**
 * 数据权限申请参数
 * 类ApplyDataPermissionParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年12月26日 上午10:31:47
 */
public class ApplyDataPermissionParam extends NormalAclParam{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -147435006418846012L;

    /**
     * 要申请的数据权限name
     */
    private String dataPermissionName;

    /**
     * 申请人id
     */
    private Integer applyUserId;

    /**
     * 操作name
     */
    private String operationName;

    /**
     * 数据map，key是属性name，value是值列表
     * 
     * 必须与数据权限关联数据模型中的属性数据一一对应
     */
    private Map<String,List<String>> dataMap;
    
    /**
     * 截止有效期，长期有效可不填
     */
    private Date expireDate;
    
    /**
     * 申请原因
     */
    private String reason;
    
    
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


    public String getDataPermissionName() {
        return dataPermissionName;
    }

    
    public void setDataPermissionName(String dataPermissionName) {
        this.dataPermissionName = dataPermissionName;
    }

    
    public Integer getApplyUserId() {
        return applyUserId;
    }

    
    public void setApplyUserId(Integer applyUserId) {
        this.applyUserId = applyUserId;
    }

    
    public Date getExpireDate() {
        return expireDate;
    }

    
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }


    public String getOperationName() {
        return operationName;
    }

    
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Map<String, List<String>> getDataMap() {
        return dataMap;
    }

    
    public void setDataMap(Map<String, List<String>> dataMap) {
        this.dataMap = dataMap;
    }

}
