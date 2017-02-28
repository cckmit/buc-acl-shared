package com.alibaba.buc.acl.api.annotation.action;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by baidian on 12/22/15.
 */

@Target({TYPE, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { })
public @interface ActionParentNameAnnotation {

    String message() default "{acl.action.parent.name.tip}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    String appKeyField() default "";

    String parentNameField() default "";
}
