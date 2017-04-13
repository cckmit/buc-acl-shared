package com.alibaba.buc.api.param;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * 类ResourceParam.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-3-5 下午4:08:27
 */
public class ResourceParam implements Serializable {

    /**
     * 序列化编号
     */
    private static final long serialVersionUID = -920089021077594653L;

    /**
     * 应用英文名，必选
     */
    private String            appName;
    
    /**
     * 所属资源类型名，如果填了，不能为空字符串
     */
    private String            resourceTypeName;
    
    /**
     * 
     * 此属性暂未支持
     * 
     * 资源所属资源包英文名列表，如果是更新，
     * 
     * 则会删掉现在所在资源包，加入新资源包
     * 
     */
    private List<String> resourcePackageName;
    
    /**
     * 父资源英文名，如不填，则设为根资源
     */
    private String parentResourceName;
    
    /**
     * 资源英文名，必选
     */
    private String            name;

    /**
     * 资源中文名，必选
     */
    private String            title;

    /**
     * 资源描述，必选
     */
    private String            description;

    /**
     * 是否激活状态
     */
    private boolean           isActive         = true;

    /**
     * 创建人的用户id，当前资源变更的发起人
     */
    private String            creatorUserId;

    
    public String getParentResourceName() {
        return parentResourceName;
    }
    
    
    public void setParentResourceName(String parentResourceName) {
        this.parentResourceName = parentResourceName;
    }
    
    public String getAppName() {
        return appName;
    }

    
    public void setAppName(String appName) {
        this.appName = appName;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String description) {
        this.description = description;
    }

    
    public boolean isActive() {
        return isActive;
    }

    
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    
    public String getCreatorUserId() {
        return creatorUserId;
    }

    
    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public List<String> getResourcePackageName() {
        return resourcePackageName;
    }

    public void setResourcePackageName(List<String> resourcePackageName) {
        this.resourcePackageName = resourcePackageName;
    }

    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }
    
    
}
