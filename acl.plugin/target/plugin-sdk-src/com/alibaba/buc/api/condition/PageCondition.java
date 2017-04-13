package com.alibaba.buc.api.condition;

import java.io.Serializable;

/**
 * 封装分页查询条件
 * 
 * @author tongxu.ay
 * @param <QueryCondition>
 */
public class PageCondition<QueryCondition> implements Serializable {

    /**
     * 序列化号码
     */
    private static final long serialVersionUID = 7421162878026797661L;

    /**
     * 保存查询条件的查询参数
     */
    private QueryCondition    param;

    /**
     * 当前页码, 开始页码为1, 小于1认为为1
     */
    private int               page             = 1;

    /**
     * 每页条数, 最大100条, 大于100认为为100
     */
    private int               sizePerPage      = 20;

    public QueryCondition getParam() {
        return param;
    }

    public void setParam(QueryCondition param) {
        this.param = param;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSizePerPage() {
        return sizePerPage;
    }

    public void setSizePerPage(int sizePerPage) {
        this.sizePerPage = sizePerPage;
    }

}
