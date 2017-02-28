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
 * Created by baidian on 12/24/15.
 */

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { })
public @interface ArrayNotNullAndLimitSizeAnnotation {

    String message() default "{acl.array.not.null.size.tip}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    int size() default Integer.MAX_VALUE;
}
