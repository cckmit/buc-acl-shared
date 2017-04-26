package com.alibaba.buc.acl.plugin;

import java.net.URL;

import com.taobao.pandora.api.service.Context;
import com.taobao.pandora.api.service.Initializer;
import com.taobao.pandora.api.service.loader.ClassLoaderService;

/**
 * pandora acl plugin 是否启动判断
 *
 * @author yicheng.wp
 */
public class AclPluginInitializer implements Initializer {

    public boolean permitStartup(Context context) {
        ClassLoader bizClassLoader = context.getService(ClassLoaderService.class).getBizClassLoader();

        //control with user file
        URL url = bizClassLoader.getResource("disable-pandora-buc-acl");
        if (null != url) {
            return false;
        }

        //control with -D param
        if (Boolean.getBoolean("disable.pandora.buc.acl")) {
            return false;
        }

        return true;
    }
}
