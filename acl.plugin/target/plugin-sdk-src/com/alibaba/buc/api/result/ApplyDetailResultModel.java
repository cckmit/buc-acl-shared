package com.alibaba.buc.api.result;

import java.util.Date;
import java.util.List;

import com.alibaba.buc.api.result.apply.FlowDetail;

public class ApplyDetailResultModel implements ResultModel {

    private static final long serialVersionUID = -5951346620463193056L;
    /**
     * 申请人
     */
    private Integer           applyUserId;
    /**
     * 申请原因
     */
    private String            applyReason;
    /**
     * 申请时间
     */
    private Date              applyTime;
    /**
     * 流程详情
     * 一个申请对应多个流程
     */
    private List<FlowDetail>  flowDetailList;

    public Integer getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(Integer applyUserId) {
        this.applyUserId = applyUserId;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public List<FlowDetail> getFlowDetailList() {
        return flowDetailList;
    }

    public void setFlowDetailList(List<FlowDetail> flowDetailList) {
        this.flowDetailList = flowDetailList;
    }

}
