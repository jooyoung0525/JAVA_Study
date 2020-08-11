package com.user; //서로 관련된 하나이상의 클래스 합친거

public class MyUser {
	public String name;
	int age;
	protected String tel;
	
	
	public MyUser() {	
	}

	public MyUser(String name,int age, String tel) {	
		this.name=name;
		this.age = age;
		this.tel = tel;
	}
	
	public void set(String name,int age, String tel) {	
		this.name=name;
		this.age = age;
		this.tel = tel;
	}
	
	public void write() {
		System.out.println(name+":"+tel+":"+age);
	}
	
	public boolean isAdult() {
		return age>=19?true:false;
	}
}
