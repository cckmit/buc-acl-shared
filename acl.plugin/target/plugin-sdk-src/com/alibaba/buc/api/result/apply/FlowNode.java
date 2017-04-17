package com.alibaba.buc.api.result.apply;

import java.util.Date;

import com.alibaba.buc.api.result.ResultModel;


public class FlowNode implements ResultModel{
    private static final long serialVersionUID = 6673173449978685269L;
    /**
     * 节点名称
     */
    private String nodeName;
    /**
     * 节点审批人工号
     */
    private String approvalEmpId;
    /**
     * 节点状态
     */
    private String nodeStatus;
    /**
     * 审批时间
     */
    private Date   approvalTime;
    /**
     * 审批意见
     */
    private String approvalReason;
    /**
     * 节点状态中文名
     */
    private String nodeStatusCn;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getApprovalEmpId() {
        return approvalEmpId;
    }

    
    public void setApprovalEmpId(String approvalEmpId) {
        this.approvalEmpId = approvalEmpId;
    }

    public String getNodeStatus() {
        return nodeStatus;
    }

    
    public void setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
    }


    public Date getApprovalTime() {
        return approvalTime;
    }

    
    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getApprovalReason() {
        return approvalReason;
    }

    public void setApprovalReason(String approvalReason) {
        this.approvalReason = approvalReason;
    }

    
    public String getNodeStatusCn() {
        return nodeStatusCn;
    }

    
    public void setNodeStatusCn(String nodeStatusCn) {
        this.nodeStatusCn = nodeStatusCn;
    }

}
