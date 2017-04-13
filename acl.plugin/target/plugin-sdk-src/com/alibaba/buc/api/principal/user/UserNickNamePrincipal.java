package com.alibaba.buc.api.principal.user;

/**
 * 通过用户花名描述用户的对象
 * 类UserNickNamePrincipal.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-3-20 上午9:50:19
 */
public class UserNickNamePrincipal extends UserPrincipal{
    
    /**
     * 用户nickNameCn pincipal的序列化版本号
     */
    private static final long serialVersionUID = -748900114805219868L;
    
    /**
     * 用户花名
     */
    private String nickNameCn;

    
    public String getNickNameCn() {
        return nickNameCn;
    }

    
    public void setNickNameCn(String nickNameCn) {
        this.nickNameCn = nickNameCn;
    }
    
    

}
