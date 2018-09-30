package org.MicroService.cloud;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class TreeInfoUtil {
	
	public static void getTreeInfo(Class<?> clazz) {
		
		for (Field field: clazz.getDeclaredFields()) {
			
//			if(field.isAnnotationPresent(TreeProvider.class)) {
//				TreeProvider annotation = field.getAnnotation(TreeProvider.class);
//				String address = annotation.address();
//				String name = annotation.name();
//				System.out.println(address+"--"+name);
//			}
//			
//			if(field.isAnnotationPresent(TreeType.class)) {
//				TreeType annotation = field.getAnnotation(TreeType.class);
//				String type = annotation.type();
//				String troname = annotation.troname();
//				System.out.println(type+"--"+troname);
//			}
			
			for (Annotation annotation : field.getAnnotations()) {
				if(annotation instanceof TreeProvider) {
					String address = ((TreeProvider)annotation).address();
					String name = ((TreeProvider)annotation).name();
					System.out.println(address+"---"+name);
				}
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		TreeInfoUtil.getTreeInfo(TreeEntity.class);
		
		
	}

}
