package org.MicroService.cloud;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TreeType {

	/*
	 * 名称 
	 */
	String troname();
	
	/*
	 * 类型
	 */
	String type();
	
	/*
	 * 年份
	 */
	String age() default "";
	
}
