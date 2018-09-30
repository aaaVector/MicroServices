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
	 * ��Ӧ�̱��
	 */
	int id() default 0;
	
	/*
	 * ��Ӧ������
	 */
	String name() default "";
	
	/*
	 * ��Ӧ�̵�ַ
	 */
	String address() default "";
	
}