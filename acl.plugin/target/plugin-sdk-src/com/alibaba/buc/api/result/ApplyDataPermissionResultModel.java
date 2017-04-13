package com.alibaba.buc.api.result;

import java.io.Serializable;
import java.util.Date;

/**
 * 封装数据权限申请情况数据
 * 类ApplyDataPermissionResultModel.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年12月7日 下午3:49:37
 */
public class ApplyDataPermissionResultModel implements Serializable {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -5671005671636828299L;

    /**
     * 申请时间
     */
    private Date                     applyDate;

    /**
     * 状态，取ApplyStatus枚举中数据，
     * 
     * 目前只有申请中的申请单会被查出来，因此只会是ApplyStatus.START
     */
    private String                   applyStatus;

    /**
     * 申请单单号
     */
    private Integer                  applyInstanceId;

    
    public Date getApplyDate() {
        return applyDate;
    }

    
    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    
    public String getApplyStatus() {
        return applyStatus;
    }

    
    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    
    public Integer getApplyInstanceId() {
        return applyInstanceId;
    }

    
    public void setApplyInstanceId(Integer applyInstanceId) {
        this.applyInstanceId = applyInstanceId;
    }
    
}
