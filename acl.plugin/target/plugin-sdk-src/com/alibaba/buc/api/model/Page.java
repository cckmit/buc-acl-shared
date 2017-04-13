/*
 * Copyright 2011 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.model;

import java.io.Serializable;
import java.util.List;

/**
 * 类OrganizationPage.java的实现描述：TODO 类实现描述
 * 
 * @author howard 22 Jun 2011 9:53:04 AM
 */
public class Page<T> implements Serializable {

    private static final long serialVersionUID = 7211327238078753453L;
    List<T>                   items;
    int                       count;

    /**
     * @return the items
     */
    public List<T> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<T> items) {
        this.items = items;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

}
