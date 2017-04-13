package com.alibaba.buc.api.principal.user;

/**
 * 通过用户id描述用户身份的对象
 * 类UserIdPrincipal.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-3-20 上午9:46:54
 */
public class UserIdPrincipal extends UserPrincipal{
    
    /**
     * 用户id pincipal的序列化版本号
     */
    private static final long serialVersionUID = -748900114805219868L;
    /**
     * 用户id
     */
    private Integer userId;
    
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    
    public Integer getUserId() {
        return userId;
    }

}
