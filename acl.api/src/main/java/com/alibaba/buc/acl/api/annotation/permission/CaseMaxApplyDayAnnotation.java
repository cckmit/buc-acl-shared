package com.alibaba.buc.acl.api.annotation.permission;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({TYPE, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = { })
@Documented
public @interface CaseMaxApplyDayAnnotation {
	
	String message() default "{acl.high.risk.level.tip}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String levelField() default "";

    String maxApplyDayField() default "";

}
