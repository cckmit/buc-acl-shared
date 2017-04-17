package com.alibaba.buc.util;


import java.security.MessageDigest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.EqualsBuilder;

import com.alibaba.buc.api.common.AclPagination;
import com.alibaba.buc.api.datapermission.constaints.DataPermissionConstaints;
import com.alibaba.buc.api.datapermission.param.BasicOutDataSourceQueryParam;
import com.alibaba.buc.api.datapermission.param.FindDataApproverParam;
import com.alibaba.buc.api.datapermission.param.FindPropertyDataDetailParam;
import com.alibaba.buc.api.datapermission.param.PagePropertyDataParam;


/**
 * 签名工具类 
 * @author zhh 2015年5月19日 下午12:44:51
 */
public class SignUtil {

    /**
	 * 生成MD5签名
	 * @param params
	 * @param secret
	 * @return
	 */
	public static String sign(Map<String, String> params, String secret) {

		String result = null;
		if (params == null || params.size()==0 )
			return result;
		
		Map<String, String> treeMap = new TreeMap<String, String>();
		treeMap.putAll(params);
		
		Iterator<String> iter = treeMap.keySet().iterator();
		StringBuilder orgin = new StringBuilder(secret);
		while (iter.hasNext()) {
			String name = (String) iter.next();
			orgin.append(name).append(treeMap.get(name));
		}
		
		return sign(orgin.toString(), secret);
	}
	
	/**
	 * 校验入参是否匹配sign得方法
	 * @param sign
	 * @param secret
	 * @param t
	 * @param page
	 * @return
	 */
    public static <T extends BasicOutDataSourceQueryParam> boolean checkSign(T t,
                                                                             AclPagination page,String secret) {

        // 获取sign
        String sign = t.getSign();
        
        // sign为空，返回false
        if(StringUtils.isEmpty(sign)){
            return false;
        }
        
        // 根据参数计算sign
        if (StringUtils.isNotEmpty(t.getActionType())) {

            Map<String, String> map = new HashMap<String, String>();
            map.put(DataPermissionConstaints.OUT_DATA_SOURCE_PARAM_PROPERTY_NAME, t.getPropertyName());
            map.put(DataPermissionConstaints.OUT_DATA_SOURCE_PARAM_TIME_STAMP,
                    t.getTimeStamp() == null ? "" : t.getTimeStamp().toString());
            if (DataPermissionConstaints.OUT_DATA_SOURCE_ACTION_TYPE_FOR_QUERY.equals(t.getActionType())) {

                // 如果入参不是PagePropertyDataParam类型，返回false
                if (t instanceof PagePropertyDataParam != true) {
                    return false;
                }

                // 切换类型
                PagePropertyDataParam pagePropertyDataParam = (PagePropertyDataParam) t;

                // 设置分页信息
                String pageNum = "";
                String pageSize = "";
                if (page != null) {
                    pageNum = page.getPageNo() + "";
                    pageSize = page.getPageSize() + "";
                }

                map.put(DataPermissionConstaints.OUT_DATA_SOURCE_PARAM_PARENT_PROPERTY_NAME,
                        pagePropertyDataParam.getParentValue() == null ? "" : pagePropertyDataParam.getParentValue());
                map.put(DataPermissionConstaints.OUT_DATA_SOURCE_PARAM_SEARCH_KEY,
                        pagePropertyDataParam.getSearchKey() == null ? "" : pagePropertyDataParam.getSearchKey());
                map.put(DataPermissionConstaints.OUT_DATA_SOURCE_PARAM_PAGE_NUM, pageNum);
                map.put(DataPermissionConstaints.OUT_DATA_SOURCE_PARAM_PAGE_SIZE, pageSize);
                
            } else if (DataPermissionConstaints.OUT_DATA_SOURCE_ACTION_TYPE_FOR_DETAIL.equals(t.getActionType())) {
                // 如果入参不是FindPropertyDataDetailParam类型，返回false
                if (t instanceof FindPropertyDataDetailParam != true) {
                    return false;
                }

                // 切换类型
                FindPropertyDataDetailParam findPropertyDataDetailParam = (FindPropertyDataDetailParam) t;
                map.put(DataPermissionConstaints.OUT_DATA_SOURCE_PARAM_VALUE_LIST,
                        convertList2String(findPropertyDataDetailParam.getDataValueList()));

            } else if (DataPermissionConstaints.OUT_DATA_SOURCE_ACTION_TYPE_FOR_APPROVAL.equals(t.getActionType())) {

                // 如果入参不是FindDataApproverParam类型，返回false
                if (t instanceof FindDataApproverParam != true) {
                    return false;
                }

                // 切换类型
                FindDataApproverParam findPropertyDataDetailParam = (FindDataApproverParam) t;
                map.put(DataPermissionConstaints.OUT_DATA_SOURCE_PARAM_VALUE_LIST,
                        convertList2String(findPropertyDataDetailParam.getDataValueList()));
            }
            
            // 计算sign
            String localSign = sign(map, secret);
            
            // 获取比较结果
            Boolean isSignEqual = new EqualsBuilder().append(localSign, sign).isEquals();
            
            // 返回比较结果
            return isSignEqual;
        }
        
        // 其他情况都为false
        return false;
    }
	
	private static String convertList2String(Collection<String> source) {
        String target = null;
        for (String s : source) {
            if (target == null) {
                target = s.toString();
            } else {
                target = target + DataPermissionConstaints.OUT_DATA_SOURCE_MULTI_VALUE_SEPERATOR + s;
            }
        }
        return target == null ? "" : target;
    }
	
	private static String sign(String params, String secret) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			return byte2hex(md.digest(params.getBytes("utf-8")));
		} catch (Exception ex) {
			throw new java.lang.RuntimeException("sign error !");
		}
	}

	private static String byte2hex(byte[] b) {
        StringBuilder hs = new StringBuilder();
        String stmp;
        for (int n = 0; n < b.length; n++) {
            stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1)
                hs.append("0").append(stmp);
            else
                hs.append(stmp);
        }
        return hs.toString().toUpperCase();
    }
	
}
