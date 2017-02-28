package com.alibaba.buc.acl.api.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by baidian on 6/16/16.
 *
 * 判断传进来的 String 是否是一个 cron 表达式
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { })
public @interface CronExpressionAnnotation {

    String message() default "{acl.cron.expression.tip}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
