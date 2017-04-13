package com.alibaba.buc.acl.api.service;

import java.util.List;
import java.util.Map;

import com.alibaba.buc.api.common.AclPagination;
import com.alibaba.buc.api.datapermission.param.FindDataApproverParam;
import com.alibaba.buc.api.datapermission.param.FindPropertyDataDetailParam;
import com.alibaba.buc.api.datapermission.param.PagePropertyDataParam;
import com.alibaba.buc.api.datapermission.result.OutDataSourceApproverModel;
import com.alibaba.buc.api.datapermission.result.OutDataSourceDataResultModel;
import com.alibaba.buc.api.datapermission.result.OutDataSourceResultModel;

/**
 * 封装acl外部数据源服务，每个应用可以分别实现这个接口提供自己的数据服务，
 * 
 * 但是版本号不能重复，部署之前应该先在hsf控制台查询判断下版本号是否被占用
 * 
 * 类AclOutDataSourceService.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年12月30日 上午10:29:20
 */
public interface AclOutDataSourceService {
    
    /**
     * 申请、授权用接口
     * 
     * 当用户页面上申请数据、管理员授权时，会调用这个接口获取属性数据
     * 
     * @param page
     * @return
     */
    public OutDataSourceResultModel pagePropertyData(PagePropertyDataParam pagePropertyDataParam,AclPagination page);
    
    /**
     * 展示用接口
     * 
     * 审批、已分配权限管理时审批人以及管理员需要查看授权数据的详细信息，而acl只保存了数据的id
     * 
     * 需要调此接口传入数据id并获取数据的详情，以显示给用户
     * 
     * 返回结果的key是传入数据值，value是匹配数据完整信息
     * 
     * @param findPropertyDataDetailParam
     * @return
     */
    public Map<String, OutDataSourceDataResultModel> findPropertyDataDetail(FindPropertyDataDetailParam findPropertyDataDetailParam);
    
    /**
     * 查询数据审批人接口
     * 
     * 当用户发起申请时，会将用户申请的数据传入，获取该数据审批人
     * 
     * 返回结果的key是对应数据字符串，value是各个节点审批人列表
     * 
     * 因为目前acl只有owner节点支持外部数据源方式，所以返回map的value列表应该只包含一个元素
     * 
     * @param findDataApproverParam
     * @return
     */
    public Map<String, List<OutDataSourceApproverModel>> findDataApprover(FindDataApproverParam findDataApproverParam);

}
