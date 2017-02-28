/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 类AclListResult.java的实现描述：Acl HSF 分页返回对象 所有HSF的分页返回值 T 由此对象封装
 * 
 * @author taigao.wjj 2014-12-30 下午2:00:16
 */
public class AclPageResult<T> implements Serializable {

    private static final long serialVersionUID = -8045228209381102763L;
    private List<T>           items            = new ArrayList<T>();
    private int               count;

    public AclPageResult(){

    }

    public AclPageResult(List<T> items, int count){
        this.items = items;
        this.count = count;
    }

    public AclPageResult(List<T> items){
        this.items = items;
    }

    public AclPageResult(int count){
        this.count = count;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
