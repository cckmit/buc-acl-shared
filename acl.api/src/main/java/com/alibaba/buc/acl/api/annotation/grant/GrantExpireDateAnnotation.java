package com.alibaba.buc.acl.api.annotation.grant;

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
public @interface GrantExpireDateAnnotation {
	
	String message() default "{acl.grant.permission.expiredate.tip}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String appKeyField();
  
    String permissionNamesField() default "";
    
    String expireDateField() default "";
    
    String actionField() default "";
    
    String type() default "";

}
