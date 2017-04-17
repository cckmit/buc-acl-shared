package com.alibaba.buc.api.datapermission.result;

import java.io.Serializable;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 封装外部数据源返回的审批人信息
 * 类ApproverModel.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年12月28日 下午3:11:58
 */
public class ApproverModel implements Serializable{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -343732107758060168L;
    
    /**
     * 审批人map，key代表第几个审批节点，value是审批人工号
     * 
     * 审批节点参考DataPermissionConstaints中的APPROVER_x_PARAM_NAME参数
     * 
     * 目前只有自定义流程的数据权限支持此设置，需要配置和申请，请勿直接使用，否则无法生效
     * 
     */
    private Map<String, String> approverMap;

    
    public Map<String, String> getApproverMap() {
        return approverMap;
    }
    
    public void setApproverMap(Map<String, String> approverMap) {
        this.approverMap = approverMap;
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
