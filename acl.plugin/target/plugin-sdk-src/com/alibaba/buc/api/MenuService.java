package com.alibaba.buc.api;

import com.alibaba.buc.api.action.CreateMenuParam;
import com.alibaba.buc.api.action.DeleteMenuParam;
import com.alibaba.buc.api.action.GetMenuParam;
import com.alibaba.buc.api.action.MenuResult;
import com.alibaba.buc.api.action.UpdateMenuParam;
import com.alibaba.buc.api.condition.MenuCondition;
import com.alibaba.buc.api.exception.BucException;
import com.alibaba.buc.api.result.MenuResultModel;

public interface MenuService {

    /**
     * @since 1.0
     * @throws BucException
     */
	@Deprecated
    public MenuResultModel listAllTreeMenu(MenuCondition condition) throws BucException;
    
    /**
     * 创建单个菜单
     * @param param
     * @throws BucException
     */
	@Deprecated
    public void createMenu(CreateMenuParam param) throws BucException;
    
    
    /**
     * 创建单个菜单
     * @param param
     * @throws BucException
     */
   // @Deprecated
   // public void createMenu2(CreateMenuParam param) throws BucException;
    
    /**
     * 更新单个菜单
     * @param param
     * @throws BucException
     */
	@Deprecated
    public void updateMenu(UpdateMenuParam param) throws BucException;
    
    /**
     * 删除单个菜单
     * @param param
     * @throws BucException
     */
	@Deprecated
    public void deleteMenu(DeleteMenuParam param) throws BucException;
    
    /**
     * 获取单个菜单
     * @param param
     * @return
     * @throws BucException
     */
	@Deprecated
    public MenuResult getMenu(GetMenuParam param) throws BucException;
    
    
    /**
     * 测试接口
     */
    @Deprecated
    public void testMenu();
    
    

       

}
