package org.MicroService.cloud;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({ TYPE, METHOD ,ElementType.FIELD})
public @interface TreeProvider {

	/*
	 * 供应商编号
	 */
	int id() default 0;
	
	/*
	 * 供应商名字
	 */
	String name() default "";
	
	/*
	 * 供应商地址
	 */
	String address() default "";
	
}
