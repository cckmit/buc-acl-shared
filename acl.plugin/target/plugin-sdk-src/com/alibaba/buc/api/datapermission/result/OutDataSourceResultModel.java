package com.alibaba.buc.api.datapermission.result;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 外部数据源模型
 * 类OutDataSourceResultModel.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年11月2日 下午2:48:35
 */
public class OutDataSourceResultModel implements Serializable{
    
    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 3169139983767328848L;

    /**
     * 分页信息，如果是属性定义成树型的，可忽略此项，树形每层节点展开都是全量展开，不分页
     */
    private OutDataSourcePageResultModel page;
    
    /**
     * 数据信息
     */
    private List<OutDataSourceDataResultModel> dataList;

    
    public OutDataSourcePageResultModel getPage() {
        return page;
    }

    
    public void setPage(OutDataSourcePageResultModel page) {
        this.page = page;
    }

    
    public List<OutDataSourceDataResultModel> getDataList() {
        return dataList;
    }

    
    public void setDataList(List<OutDataSourceDataResultModel> dataList) {
        this.dataList = dataList;
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
