package com.alibaba.buc.acl.api.annotation.role;

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
public @interface BothNeedAnnotation {
	
	String message() default "{acl.both.need.tip}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String firstField() default "";

    String secondField() default "";
    

}
