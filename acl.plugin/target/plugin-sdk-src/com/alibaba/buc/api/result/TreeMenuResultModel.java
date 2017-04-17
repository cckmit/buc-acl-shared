package com.alibaba.buc.api.result;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class TreeMenuResultModel extends MenuResultModel {

    private static final long serialVersionUID = -1834775795429524581L;

    private String            menuId;

    private String            menuParentId;

    private String            menuName;

    private String            menuTitle;

    private boolean           isLeaf;

    private String            menuUrl;

    private String            permissionName;

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    private List<TreeMenuResultModel> subMenus = new ArrayList<TreeMenuResultModel>();
    /**
     * 同一层菜单的排列顺序
     */
    private String                    sort;

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public List<TreeMenuResultModel> getSubMenus() {
        return subMenus;
    }

    public void setSubMenus(List<TreeMenuResultModel> subMenus) {
        this.subMenus = subMenus;
    }

    public String getMenuParentId() {
        return menuParentId;
    }

    public void setMenuParentId(String menuParentId) {
        this.menuParentId = menuParentId;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
