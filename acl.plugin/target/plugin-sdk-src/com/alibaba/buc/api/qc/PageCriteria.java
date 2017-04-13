/*
 * Copyright 2011 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.qc;

import java.io.Serializable;

/**
 * 类PageCriteria.java的实现描述：TODO 类实现描述
 * 
 * @author howard 3 Aug 2011 2:35:53 PM
 */
public class PageCriteria implements Serializable {

    private static final long serialVersionUID = -6521826191736481433L;
    private int page        = 1;  // page 指的是页数 0和1 都代表第一页
    private int sizePerPage = 20;

    /**
     * @return the page
     */
    public int getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * @return the sizePerPage
     */
    public int getSizePerPage() {
        return sizePerPage;
    }

    /**
     * @param sizePerPage the sizePerPage to set
     */
    public void setSizePerPage(int sizePerPage) {
        this.sizePerPage = sizePerPage;
    }

}
