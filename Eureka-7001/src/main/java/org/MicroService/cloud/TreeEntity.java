package org.MicroService.cloud;

public class TreeEntity {

	String name;
	
	@TreeType( type = "����", troname = "ӭ����")
	@TreeProvider(address="�޺�")
	String type;
	
	String age;
	
	@TreeProvider(address="����")
	String provider;
	
	
	public void name(String c) {
		System.out.println("�õ���ֵ��"+c);
	}
	
}