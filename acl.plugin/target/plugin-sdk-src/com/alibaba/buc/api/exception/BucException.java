/*
 * Copyright 2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package com.alibaba.buc.api.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * 类BucException.java的实现描述：TODO 类实现描述
 * 
 * @author howard 17 Jun 2011 11:26:52 AM
 */
public class BucException extends Exception {

    private static final long                 serialVersionUID             = -8970237263937382422L;
    public final static int                   USER_NOT_FOUND               = 1001;
    public final static int                   ILLEGAL_ARGUMENT             = 1002;
    public final static int                   TOO_MANY_RESULTS             = 1003;
    public final static int                   NOT_SUPPORT_OPERATION        = 1004;
    public final static int                   ARGUMENT_CANT_BE_BLANK       = 1005;
    public final static int                   AUTHENTICATE_FAILED          = 1006;
    public final static int                   NOT_ALLOWED_AUTH_TYPE        = 1007;
    public final static int                   USER_ALREADY_EXISTED         = 1008;
    public final static int                   APP_DONT_EXIST               = 1009;
    public final static int                   EXCEED_LIMITATION            = 1010;
    public final static int                   XML_PARSE_ERROR              = 1011;
    public final static int                   DB_EXECUTE_ERROR             = 1012;
    public final static int                   DOMAIN_NOT_EXIST             = 1013;
    public final static int                   VALIDATE_DATA_ERROR          = 1100;
    public final static int                   APP_AUTH_BLOCKED             = 1101;
    public final static int                   SUB_SYSTEM_USER_NOT_EXIST    = 1102;
    public final static int                   CONFIG_ERROR                 = 1103;
    public final static int                   PROXY_EXCEED_LIMIT           = 1104;
    public final static int                   PROXY_ALREADY_EXIST          = 1105;
    public final static int                   OTHER_ERROR                  = 9999;
    public final static int                   ORGANIZATION_ALREADY_EXISTED = 1014;
    public final static int                   TOO_MANY_ACCOUNT             = 2001;

    private int                               errorCode;

    private final static Map<Integer, String> messages;

    static {
        messages = new HashMap<Integer, String>();
        messages.put(USER_NOT_FOUND, "user not found");
        messages.put(ILLEGAL_ARGUMENT, "illegal argument");
        messages.put(TOO_MANY_RESULTS, "too many results");
        messages.put(NOT_SUPPORT_OPERATION, "not supported operation");
        messages.put(ARGUMENT_CANT_BE_BLANK, "argument can't be blank");
        messages.put(AUTHENTICATE_FAILED, "authenticate failed");
        messages.put(NOT_ALLOWED_AUTH_TYPE, "not allowed auth type");
        messages.put(USER_ALREADY_EXISTED, "user already existed");
        messages.put(APP_DONT_EXIST, "app dont exist");
        messages.put(EXCEED_LIMITATION, "exceed query size limitation");
        messages.put(XML_PARSE_ERROR, "xml parse error");
        messages.put(DB_EXECUTE_ERROR, "DB execute error");
        messages.put(DOMAIN_NOT_EXIST, "domain not found");
        messages.put(VALIDATE_DATA_ERROR, "data invalid");
        messages.put(OTHER_ERROR, "other error");
        messages.put(APP_AUTH_BLOCKED, "no permission in this application");
        messages.put(SUB_SYSTEM_USER_NOT_EXIST, "sub system user not exist");
        messages.put(CONFIG_ERROR, "system config error");
        messages.put(PROXY_EXCEED_LIMIT, "proxy exceed  limit");
        messages.put(PROXY_ALREADY_EXIST, "proxy has exist");
        messages.put(ORGANIZATION_ALREADY_EXISTED, "organization already existed");
        messages.put(TOO_MANY_ACCOUNT, "there are duplicated login account having the same loginname");
    }

    public BucException(int messageCode, Throwable cause){
        super(messages.get(messageCode), cause);
        errorCode = messageCode;
    }

    public BucException(int messageCode){
        super(messages.get(messageCode));
        errorCode = messageCode;
    }

    public BucException(int messageCode, String message, Throwable cause){
        super(message, cause);
        errorCode = messageCode;
    }

    public BucException(int messageCode, String message){
        super(message);
        errorCode = messageCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public static String getErrorMessage(int messageCode) {
        return messages.get(messageCode);
    }
}
