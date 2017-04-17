package com.alibaba.buc.api.result.apply;

import java.util.List;

import com.alibaba.buc.api.result.ResultModel;

public class FlowDetail implements ResultModel{
    
    private static final long serialVersionUID = 3476948299755132803L;
    /**
     * 流程实例ID
     */
    private String         flowInstanceId;
    /**
     * 流程名称
     */
    private String         flowName;
    /**
     * 流程名称中文名
     */
    private String         flowNameCn;
    /**
     * 流程状态
     */
    private String         flowStatus;
    /**
     * 流程状态中文名
     */
    private String         flowStatusCn;
    /**
     * 流程对应节点信息
     * 一个流程对应多个节点
     */
    private List<FlowNode> flowNodeList;

    public String getFlowInstanceId() {
        return flowInstanceId;
    }

    public void setFlowInstanceId(String flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    
    
    public String getFlowNameCn() {
        return flowNameCn;
    }

    
    public void setFlowNameCn(String flowNameCn) {
        this.flowNameCn = flowNameCn;
    }

    
    public String getFlowStatusCn() {
        return flowStatusCn;
    }

    
    public void setFlowStatusCn(String flowStatusCn) {
        this.flowStatusCn = flowStatusCn;
    }

    public String getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
    }

    public List<FlowNode> getFlowNodeList() {
        return flowNodeList;
    }

    public void setFlowNodeList(List<FlowNode> flowNodeList) {
        this.flowNodeList = flowNodeList;
    }
}
