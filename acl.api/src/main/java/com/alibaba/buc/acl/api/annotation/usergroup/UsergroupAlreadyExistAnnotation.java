package com.alibaba.buc.acl.api.annotation.usergroup;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by baidian on 12/18/15.
 */
@Target({ANNOTATION_TYPE, FIELD, METHOD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { })
public @interface UsergroupAlreadyExistAnnotation {

    String message() default "{acl.usergroup.name.exist.tip}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    String nameField() default "";

}
