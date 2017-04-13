package com.alibaba.buc.api;

import java.util.List;
import java.util.Map;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.api.apply.ApplyPermissionAddToRoleParam;
import com.alibaba.buc.api.apply.ApproveUserResult;
import com.alibaba.buc.api.apply.FindApproveUserByRoleNameParam;
import com.alibaba.buc.api.condition.ApplyInstanceCondition;
import com.alibaba.buc.api.condition.ApplyingDataPermissionCondition;
import com.alibaba.buc.api.condition.ApplyingPermissionCondition;
import com.alibaba.buc.api.condition.PageCondition;
import com.alibaba.buc.api.exception.BucException;
import com.alibaba.buc.api.model.Page;
import com.alibaba.buc.api.result.ApplyDataPermissionResultModel;
import com.alibaba.buc.api.result.ApplyDetailResultModel;
import com.alibaba.buc.api.result.ApplyInstanceResultModel;
import com.alibaba.buc.api.result.ApplyPermissionResultModel;
import com.alibaba.buc.api.userpermission.ApplyDataPermissionParam;
import com.alibaba.buc.api.userpermission.ApplyPermissionParam;

/**
 * ApplyInstanceService
 * 
 * @author shenwujie 2012-10-22 下午7:38:29
 */
public interface ApplyInstanceService {

    /**
     * 查看权限的申请状态
     * 
     * @since 0.3
     * @throws BucException
     */
    Map<String, ApplyPermissionResultModel> checkApplyingPermissions(ApplyingPermissionCondition applyPermissionCondtion)
                                                                                                                         throws BucException;
    /**
     * 检查数据权限申请状态
     * @param applyingDataPermissionCondition
     * @return
     * @throws BucException
     */
    AclResult<ApplyDataPermissionResultModel> checkApplyingDataPermissions(ApplyingDataPermissionCondition applyingDataPermissionCondition)
            throws BucException;

    /**
     * 分页查询申请单
     * 
     * @since 1.0
     * @throws BucException
     */
    Page<ApplyInstanceResultModel> pageApplyInstatnce(PageCondition<ApplyInstanceCondition> condition)
                                                                                                      throws BucException;

    /**
     * 查看申请单详情
     * 
     * @param userId
     * @param applyInstanceId
     * @return 
     * @throws Exception 
     */
    ApplyDetailResultModel queryApplyDetail(String userId, String applyInstanceId) throws BucException, Exception;

    /**
     * 申请权限、角色
     *
     * @param applyPermissionParam 入参
     * @return applyInstanceId 对应申请单id
     * @throws BucException
     */
    public Integer applyPermission(ApplyPermissionParam applyPermissionParam) throws BucException;
    
    /**
     * 申请数据权限
     * @param applyDataPermissionParam
     * @return
     * @throws BucException
     */
    public AclResult<Integer> applyDataPermission(ApplyDataPermissionParam applyDataPermissionParam) throws BucException;

    /**
     * 申请将权限加入角色
     *
     * @param applyPermissionAddToRoleParam 入参
     * @return 申请单号
     * @throws BucException
     */
    public Integer applyPermissionAddToRole(ApplyPermissionAddToRoleParam applyPermissionAddToRoleParam) throws BucException;

    /**
     * 查询角色配置的审批人
     *
     * @param findApproveUserByRoleNameParam 入参
     * @return 审批人列表
     * @throws BucException
     */
    public List<ApproveUserResult> findApproveUserByRoleName(FindApproveUserByRoleNameParam findApproveUserByRoleNameParam) throws BucException;
}
