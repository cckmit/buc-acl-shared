/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.common;

import java.io.Serializable;

/**
 * 类Pagination.java的实现描述：Acl HSF 的分页类，入参
 * @author taigao.wjj 2014-12-30 下午1:55:43
 */
public class AclPagination implements Serializable {
    
    private static final long serialVersionUID = -1757332712272969225L;

    /**
     * 当前页码, 开始页码为1, 小于1认为为1
     */
    private int pageNo = 1;

    /**
     * 每页条数, 默认20
     */
    private int pageSize = 20;
    
    public AclPagination(){
    }

  
    public AclPagination(int pageNo,int pageSize){
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
    

    public int getPageNo() {
        return pageNo;
    }


    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    
    

}
