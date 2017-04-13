package com.alibaba.buc.api.param;

/**
 * 权限回收策略
 *
 * @author yicheng.wp
 */
public class RevokeRuleConstant {

    /**
     * 权限回收 - 用户所在部门发生变化时，该用户的权限将被回收
     */
    public static final String    REVOKE           = "REVOKE";

    /**
     * 权限保留 - 用户所在部门发生变化时，该用户的权限将被保留
     */
    public static final String    RESERVE          = "RESERVE";

    /**
     * 个人主动转岗时回收 - 只在小二主动申请转岗时回收本权限，其它情况（如组织结构变化）权限保留
     */
    public static final String    TRANSFER_REVOKE  = "TRANSFER_REVOKE";
}
