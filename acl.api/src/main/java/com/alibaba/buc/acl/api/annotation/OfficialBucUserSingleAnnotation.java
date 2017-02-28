package com.alibaba.buc.acl.api.annotation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * 和BucUserAnnotation有些许区别，不能是外包，不能是工作账号。
 * 这个是作为权限的owner User 校验的。
 * @author taigao.wjj
 *
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { })
public @interface OfficialBucUserSingleAnnotation {
	
	String message() default "{acl.buc.user.not.offical.tip}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
	String type() default "";  // type="create" or "update", 这两种处理方式有些不同。
}
