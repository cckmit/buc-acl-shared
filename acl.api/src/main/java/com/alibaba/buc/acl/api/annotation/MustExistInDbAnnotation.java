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
 * 判断你想要的类型是否在数据库中，如果不在，校验器返回false, 其他返回true.
 * @author taigao.wjj
 *
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { })
public @interface MustExistInDbAnnotation {
	
	String message() default "{acl.not.in.db.tip}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
	String type() default ""; //类型，如permission, role, app, action等。


}
