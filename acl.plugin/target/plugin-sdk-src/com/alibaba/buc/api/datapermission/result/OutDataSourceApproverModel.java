package com.alibaba.buc.api.datapermission.result;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.api.datapermission.constaints.DataPermissionConstaints;

/**
 * 封装数据审批人信息
 * 类OutDataSourceApproverModel.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年12月30日 上午11:16:10
 */
public class OutDataSourceApproverModel implements Serializable{
    
    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 4393312540005802760L;
    
    /**
     * 负责审批的节点，目前acl只有owner审批节点支持外部数据源方式，因此固定为
     * 
     * DataPermissionConstaints.APPROVER_2_PARAM_NAME
     * 
     * 后续业务扩展后可以根据规范填写其他值
     */
    private String currentApprovalNode = DataPermissionConstaints.APPROVER_2_PARAM_NAME;
    
    /**
     * 可以参加当前节点审批的审批人工号列表，不带前缀0
     * 
     * 因为目前acl只有owner审批节点支持外部数据源方式，且owner节点只取一个审批人，
     * 
     * 所以如果列表中包含多个值，会随机选择一个作为owner，如果要指定具体owner，则传入一个审批人工号即可
     * 
     */
    private List<String> approverEmpIdList;
    
    
    public String getCurrentApprovalNode() {
        return currentApprovalNode;
    }
    
    public void setCurrentApprovalNode(String currentApprovalNode) {
        this.currentApprovalNode = currentApprovalNode;
    }

    
    public List<String> getApproverEmpIdList() {
        return approverEmpIdList;
    }

    
    public void setApproverEmpIdList(List<String> approverEmpIdList) {
        this.approverEmpIdList = approverEmpIdList;
    }

    @Override
    public int hashCode() {
        return  HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
    
}
