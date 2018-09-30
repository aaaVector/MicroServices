package org.MicroService.cloud;

public class TreeEntity {

	String name;
	
	@TreeType( type = "松鼠", troname = "迎客松")
	@TreeProvider(address="罗湖")
	String type;
	
	String age;
	
	@TreeProvider(address="深圳")
	String provider;
	
	
	public void name(String c) {
		System.out.println("得到的值："+c);
	}
	
}
