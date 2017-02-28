package com.alibaba.buc.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 这只是一个标志而已,只注解在方法上,表示注解了
 * 此标志的方法才进行jsr303校验。
 * @author taigao.wjj
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface ValidationAnnotation {

}
